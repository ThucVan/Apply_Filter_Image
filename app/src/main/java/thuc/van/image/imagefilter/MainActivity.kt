package thuc.van.image.imagefilter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import org.wysaid.common.SharedContext
import org.wysaid.nativePort.CGEImageHandler
import org.wysaid.nativePort.CGENativeLibrary
import thuc.van.image.imagefilter.databinding.ActivityMainBinding
import thuc.van.image.imagefilter.util.CommandGenerator
import thuc.van.image.imagefilter.util.ConfigData
import thuc.van.image.imagefilter.util.ConfigData.ID_CARNIVAL_FUN
import thuc.van.image.imagefilter.util.ConfigData.ID_FILM_NOIR
import thuc.van.image.imagefilter.util.ConfigData.ID_FIREFLY_NIGHT
import thuc.van.image.imagefilter.util.ConfigData.ID_MOONLIGHT_MAGIC
import thuc.van.image.imagefilter.util.ConfigData.ID_POLAROID_MEMORIES
import thuc.van.image.imagefilter.util.ConfigData.ID_SPRING_BOOM
import thuc.van.image.imagefilter.util.ConfigData.ID_SUNSET_GLOW
import thuc.van.image.imagefilter.util.ConfigData.ID_TOKYO_NIGHTS
import thuc.van.image.imagefilter.util.ConfigData.ID_TRENDING
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private lateinit var adapterFilter: AdapterFilter
    private lateinit var adapterPreview: AdapterPreview

    var mBitmapOrigin: Bitmap? = null
    var mBitmapOriginal: Bitmap? = null
    var fileName = ""

    private var mLoadImageCallback: CGENativeLibrary.LoadImageCallback =
        object : CGENativeLibrary.LoadImageCallback {
            override fun loadImage(name: String, arg: Any?): Bitmap? {
                return try {
                    BitmapFactory.decodeStream(assets.open(name))
                } catch (unused: IOException) {
                    null
                }
            }

            override fun loadImageOK(bmp: Bitmap?, arg: Any?) {
                bmp?.recycle()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setContentView(binding.root)

        CGENativeLibrary.setLoadImageCallback(mLoadImageCallback, null)

        val listPreview = arrayListOf(
            "preview/carnival_fun.webp",
            "preview/film_noir.webp",
            "preview/firefly_night.webp",
            "preview/moonlight_magic.webp",
            "preview/polaroid_memories.webp",
            "preview/spring_boom.webp",
            "preview/sunset_glow.webp",
            "preview/tokyo_nights.webp",
            "preview/trending.webp",
        )

        val listFilter = ConfigData.getFilterListByCategoryID(ID_FIREFLY_NIGHT)

        adapterFilter = AdapterFilter {
            fileName = it.name

            var newBitmap: Bitmap? = null
                val glContext = SharedContext.create()
                glContext.makeCurrent()
                newBitmap = mBitmapOrigin?.let { it1 -> getFilterToBitmap(it1, it) }
                glContext.release()
            mBitmapOriginal = newBitmap

            Glide.with(this).load(newBitmap).into(binding.imvPreview)
        }

        adapterPreview = AdapterPreview {
            Glide.with(this).asBitmap().load("file:///android_asset/filters/$it").skipMemoryCache(true).diskCacheStrategy(
                DiskCacheStrategy.NONE
            ).into(object : CustomTarget<Bitmap?>() {

                override fun onResourceReady(
                    resource: Bitmap, transition: Transition<in Bitmap?>?
                ) {
                    mBitmapOrigin = resource

                    mBitmapOriginal = resource
                }

                override fun onLoadCleared(placeholder: Drawable?) {

                }
            })

            Glide.with(this).load("file:///android_asset/filters/$it").into(binding.imvPreview)
        }

        adapterFilter.submitData(listFilter)
        adapterPreview.submitData(listPreview)

        binding.rcvFilter.adapter = adapterFilter
        binding.rcvPreview.adapter = adapterPreview

        binding.btnSave.setOnClickListener {
            onSaveGallery(mBitmapOriginal!!)
        }
    }

    private fun getFilterToBitmap(bm: Bitmap, filter: FilterModel): Bitmap {
        val handler = CGEImageHandler().apply {
            initWithBitmap(bm)
            setFilterWithConfig(
                CommandGenerator.generateCommand(
                    ConfigData.defaultAdjustmentList, filter
                ), true, false
            )
            setFilterIntensity(filter.intensity, true)
        }
        return handler.resultBitmap
    }

    private fun onSaveGallery(bitmapInput: Bitmap): String {
        if (!folderSave.exists()) {
            folderSave.mkdirs()
        }
        val file = File(folderSave, "$fileName.png")
        try {
            val outputStream = FileOutputStream(file)
            bitmapInput.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
            outputStream.flush()
            outputStream.close()
            return file.absolutePath
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return ""
    }

    val folderSave = File(
        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
            .toString() + "/FilterImage"
    )
}