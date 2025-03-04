package thuc.van.image.imagefilter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import thuc.van.image.imagefilter.databinding.ItemFilterBinding

class AdapterPreview(val onClickItem : (item : String) -> Unit) : RecyclerView.Adapter<AdapterPreview.ViewHolder>() {
    private lateinit var binding: ItemFilterBinding

    val listItem = mutableListOf<String>()

    @SuppressLint("NotifyDataSetChanged")
    fun submitData(newData: List<String>) {
        listItem.clear()
        listItem.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.item_filter, parent, false
        )

        return ViewHolder(binding, onClickItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(listItem[position])
    }

    override fun getItemCount() = listItem.size

    class ViewHolder(private val binding: ItemFilterBinding, val onClickItem : (item : String) -> Unit) : RecyclerView.ViewHolder(binding.root){
        fun bindData(item: String) {
            Glide.with(binding.root).load("file:///android_asset/filters/$item").into(binding.imvFilter)

            binding.root.setOnClickListener {
                onClickItem(item)
            }
        }
    }
}