package thuc.van.image.imagefilter.util

data class AdjustConfig (
    var name : Int = 0,
    var iconRes : Int  = 0,
    var minValue : Float = 0f,
    var maxValue : Float = 0f,
    var originalValue : Float = 0f,
    var intensity : Float = 0.5f,
    var type : AdjustType = AdjustType.BRIGHTNESS,
    var isSelected : Boolean = false){
    fun getCommand(): String {
        val currentValue = calculateCurrentValue()
        return when (type) {
            AdjustType.BRIGHTNESS -> {
                "@adjust brightness $currentValue "
            }
            AdjustType.CONTRAST -> {
                "@adjust contrast $currentValue "
            }
            AdjustType.SATURATION -> {
                "@adjust saturation $currentValue "
            }
            AdjustType.HIGHLIGHT ->{
                "@adjust shadowhighlight 0 $currentValue "
            }
            AdjustType.SHADOWS ->{
                "@adjust shadowhighlight $currentValue 0 "
            }
            AdjustType.WARMTH ->{
                "@adjust whitebalance $currentValue 1 "
            }
            AdjustType.VIGNETTE ->{
                "@vignette $currentValue 1"
            }
            AdjustType.HUE ->{
                "@adjust hue $currentValue "
            }
            AdjustType.SHARPEN ->{
                "@adjust sharpen $currentValue 1 "
            }
            AdjustType.GRAIN ->{
                "@blend vividlight grain.png $currentValue "
            }
            AdjustType.TINT ->{
                "@adjust whitebalance 0 $currentValue "
            }
            AdjustType.FADE ->{
                "@pixblend mix 245 245 245 $currentValue 100 "
            }
        }
    }

     fun calculateCurrentValue(): Float {
        return when {
            intensity <= 0.0f -> minValue
            intensity >= 1.0f -> maxValue
            intensity <= 0.5f -> minValue + (originalValue - minValue) * intensity * 2.0f
            else -> maxValue + (originalValue - maxValue) * (1.0f - intensity) * 2.0f
        }
    }

}