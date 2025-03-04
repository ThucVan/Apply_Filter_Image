package thuc.van.image.imagefilter

import android.graphics.Bitmap

data class FilterModel(
    var id: Int = 0,
    var name: String,
    var lutPath: String,
    var intensity: Float = 1f,
    var isSelected: Boolean = false,
    var bitmapFilter: Bitmap? = null,
    var placeholder : Int,
    var assetFilter : String
) {
    fun getCommand(): String {
        return "@adjust lut $lutPath "
    }
}
