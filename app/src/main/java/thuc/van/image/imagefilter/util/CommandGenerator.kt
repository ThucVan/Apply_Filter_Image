package thuc.van.image.imagefilter.util

import thuc.van.image.imagefilter.FilterModel

object CommandGenerator {

    fun generateCommand(configList: List<AdjustConfig>, selectedFilter : FilterModel): String {
        var shadowValue = 0f
        var highlightValue = 0f
        var warmthValue = 0f
        var tintValue = 1f

        val commandBuilder = StringBuilder()
        commandBuilder.append(selectedFilter.getCommand())
        configList.forEach {
            if(it.calculateCurrentValue()!= it.originalValue){
                when(it.type){
                    AdjustType.SHADOWS -> shadowValue = it.calculateCurrentValue()
                    AdjustType.HIGHLIGHT -> highlightValue =it.calculateCurrentValue()
                    AdjustType.WARMTH -> warmthValue = it.calculateCurrentValue()
                    AdjustType.TINT -> tintValue = it.calculateCurrentValue()
                    else -> commandBuilder.append(it.getCommand())
                }
            }
        }
        if(shadowValue!=0f || highlightValue!= 0f){
            commandBuilder.append(generateShadowAndHighLightCommand(shadowValue, highlightValue))
        }
        if(warmthValue!= 0f || tintValue!= 1f){
            commandBuilder.append(generateWarmthAndTintCommand(warmthValue, tintValue))
        }
        return commandBuilder.toString()
    }

    private fun generateShadowAndHighLightCommand(shadowValue: Float, highlightValue: Float): String {
        return "@adjust shadowhighlight $shadowValue $highlightValue "
    }

    private fun generateWarmthAndTintCommand(warmthValue : Float, tintValue : Float) : String{
        return "@adjust whitebalance $warmthValue $tintValue "
    }

}