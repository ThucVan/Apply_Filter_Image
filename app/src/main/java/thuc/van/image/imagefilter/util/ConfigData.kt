package thuc.van.image.imagefilter.util

import thuc.van.image.imagefilter.FilterModel
import thuc.van.image.imagefilter.R

object ConfigData {
    internal const val ID_TRENDING : Int = -1
    internal const val ID_SPRING_BOOM : Int = 1
    internal const val ID_SUNSET_GLOW : Int = 2
    internal const val ID_CARNIVAL_FUN : Int = 3
    internal const val ID_MOONLIGHT_MAGIC : Int = 4
    internal const val ID_TOKYO_NIGHTS : Int = 5
    internal const val ID_POLAROID_MEMORIES : Int = 6
    internal const val ID_FILM_NOIR : Int = 7
    internal const val ID_FIREFLY_NIGHT : Int = 8

    val defaultAdjustmentList = listOf(
        AdjustConfig(R.string.app_name, R.drawable.ic_launcher_background, -0.5f, 0.5f,0f,0.5f, AdjustType.BRIGHTNESS, true),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, 0.5f, 1.5f,1.0f,0.5f,
            AdjustType.CONTRAST, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, 0f, 2f,1f,0.5f,
            AdjustType.SATURATION, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, -50f, 50f,0f,0.5f,
            AdjustType.HIGHLIGHT, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, -50f, 50f,0f,0.5f,
            AdjustType.SHADOWS, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, -0.5f,0.5f,0f,0.5f,
            AdjustType.WARMTH, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, 0f, 1f,0.5f,0.5f,
            AdjustType.VIGNETTE, false),
        AdjustConfig(R.string.app_name, R.drawable.ic_launcher_background, 0f, 6.28f,0f,0f, AdjustType.HUE, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, 1f, 2.5f,1.0f,0f,
            AdjustType.SHARPEN, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, 0f, 50f,0f,0f,
            AdjustType.GRAIN, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, 0f, 2f,1f,0.5f,
            AdjustType.TINT, false),
        AdjustConfig(
            R.string.app_name, R.drawable.ic_launcher_background, 0f, 60f,30f,0.5f,
            AdjustType.FADE, false)
    )

    fun getAllFilterModel(): MutableList<FilterModel> {
        val placeholderTrending = R.drawable.ic_launcher_background
        val assetFilterTrending = "trending.webp"

        val placeholderSpringBoom = R.drawable.ic_launcher_background
        val assetFilterSpringBoom = "spring_boom.webp"

        val placeholderSunSetGlow = R.drawable.ic_launcher_background
        val assetFilterSunSetGlow = "sunset_glow.webp"

        val placeholderCarnivalFun = R.drawable.ic_launcher_background
        val assetFilterCarnivalFun = "carnival_fun.webp"

        val placeholderMoonlightMagic = R.drawable.ic_launcher_background
        val assetFilterMoonlightMagic = "moonlight_magic.webp"

        val placeholderTokyoNights = R.drawable.ic_launcher_background
        val assetFilterTokyoNights = "tokyo_nights.webp"

        val placeholderPolaroidMemories = R.drawable.ic_launcher_background
        val assetFilterPolaroidMemories = "polaroid_memories.webp"

        val placeholderFilmNoir = R.drawable.ic_launcher_background
        val assetFilterFilmNoir = "film_noir.webp"

        val placeholderFireflyNight = R.drawable.ic_launcher_background
        val assetFilterFireflyNight = "firefly_night.webp"

        return arrayListOf(
            //trending
            FilterModel(0, "None", "filters/trending/NONE.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(1, "P1", "filters/trending/P1.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(2, "P2", "filters/trending/P2.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(3, "P3", "filters/trending/P3.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(4, "P4", "filters/trending/P4.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(5, "P5", "filters/trending/P5.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(6, "P6", "filters/trending/P6.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(7, "P7", "filters/trending/P7.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(8, "P8", "filters/trending/P8.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(9, "P9", "filters/trending/P9.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),

            //film noir
            FilterModel(10, "P10", "filters/trending/P10.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(11, "P11", "filters/trending/P11.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(12, "P12", "filters/trending/P12.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(13, "P13", "filters/trending/P13.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(14, "P14", "filters/trending/P14.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(15, "P15", "filters/trending/P15.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(16, "P16", "filters/trending/P16.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(17, "P17", "filters/trending/P17.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(18, "P18", "filters/trending/P18.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),
            FilterModel(19, "P19", "filters/trending/P19.jpg", placeholder = placeholderFilmNoir, assetFilter = assetFilterFilmNoir),

            //firefly_night
            FilterModel(20, "P20", "filters/trending/P20.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(21, "P21", "filters/trending/P21.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(22, "P22", "filters/trending/P22.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(23, "P23", "filters/trending/P23.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(24, "P24", "filters/trending/P24.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(25, "P25", "filters/trending/P25.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(26, "P26", "filters/trending/P26.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(27, "P27", "filters/trending/P27.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(28, "P28", "filters/trending/P28.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(29, "P29", "filters/trending/P29.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(30, "P30", "filters/trending/P30.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(31, "P31", "filters/trending/P31.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(32, "P32", "filters/trending/P32.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(33, "P33", "filters/trending/P33.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(34, "P34", "filters/trending/P34.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),
            FilterModel(35, "P35", "filters/trending/P35.jpg", placeholder = placeholderFireflyNight, assetFilter = assetFilterFireflyNight),

            //trending2
            FilterModel(36, "P36", "filters/trending/P36.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(37, "P37", "filters/trending/P37.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(38, "P38", "filters/trending/P38.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(39, "P39", "filters/trending/P39.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(40, "P40", "filters/trending/P40.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(41, "P41", "filters/trending/P41.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(42, "P42", "filters/trending/P42.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(43, "P43", "filters/trending/P43.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(44, "P44", "filters/trending/P44.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(45, "P45", "filters/trending/P45.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),
            FilterModel(46, "P46", "filters/trending/P46.jpg", placeholder = placeholderTrending, assetFilter = assetFilterTrending),

            FilterModel(47, "A1", "filters/spring_boom/A1.jpg", placeholder = placeholderSpringBoom, assetFilter = assetFilterSpringBoom),
            FilterModel(48, "A2", "filters/spring_boom/A2.jpg", placeholder = placeholderSpringBoom, assetFilter = assetFilterSpringBoom),
            FilterModel(49, "A3", "filters/spring_boom/A3.jpg", placeholder = placeholderSpringBoom, assetFilter = assetFilterSpringBoom),
            FilterModel(50, "A4", "filters/spring_boom/A4.jpg", placeholder = placeholderSpringBoom, assetFilter = assetFilterSpringBoom),
            FilterModel(51, "A5", "filters/spring_boom/A5.jpg", placeholder = placeholderSpringBoom, assetFilter = assetFilterSpringBoom),


            FilterModel(52, "B1", "filters/sunset_glow/B1.jpg", placeholder = placeholderSunSetGlow, assetFilter = assetFilterSunSetGlow),
            FilterModel(53, "B2", "filters/sunset_glow/B2.jpg", placeholder = placeholderSunSetGlow, assetFilter = assetFilterSunSetGlow),
            FilterModel(54, "B3", "filters/sunset_glow/B3.jpg", placeholder = placeholderSunSetGlow, assetFilter = assetFilterSunSetGlow),
            FilterModel(55, "B4", "filters/sunset_glow/B4.jpg", placeholder = placeholderSunSetGlow, assetFilter = assetFilterSunSetGlow),


            FilterModel(56, "C1", "filters/polaroid_memories/C1.jpg", placeholder = placeholderPolaroidMemories, assetFilter = assetFilterPolaroidMemories),
            FilterModel(57, "C2", "filters/polaroid_memories/C2.jpg", placeholder = placeholderPolaroidMemories, assetFilter = assetFilterPolaroidMemories),
            FilterModel(58, "C3", "filters/polaroid_memories/C3.jpg", placeholder = placeholderPolaroidMemories, assetFilter = assetFilterPolaroidMemories),
            FilterModel(59, "C4", "filters/polaroid_memories/C4.jpg", placeholder = placeholderPolaroidMemories, assetFilter = assetFilterPolaroidMemories),

            FilterModel(60, "F1", "filters/tokyo_nights/F1.jpg", placeholder = placeholderTokyoNights, assetFilter = assetFilterTokyoNights),
            FilterModel(61, "F2", "filters/tokyo_nights/F2.jpg", placeholder = placeholderTokyoNights, assetFilter = assetFilterTokyoNights),
            FilterModel(62, "F3", "filters/tokyo_nights/F3.jpg", placeholder = placeholderTokyoNights, assetFilter = assetFilterTokyoNights),
            FilterModel(63, "F4", "filters/tokyo_nights/F4.jpg", placeholder = placeholderTokyoNights, assetFilter = assetFilterTokyoNights),
            FilterModel(64, "F5", "filters/tokyo_nights/F5.jpg", placeholder = placeholderTokyoNights, assetFilter = assetFilterTokyoNights),

            FilterModel(65, "R1", "filters/carnival_fun/R1.jpg", placeholder = placeholderCarnivalFun, assetFilter = assetFilterCarnivalFun),
            FilterModel(66, "R2", "filters/carnival_fun/R2.jpg", placeholder = placeholderCarnivalFun, assetFilter = assetFilterCarnivalFun),
            FilterModel(67, "R3", "filters/carnival_fun/R3.jpg", placeholder = placeholderCarnivalFun, assetFilter = assetFilterCarnivalFun),
            FilterModel(68, "R4", "filters/carnival_fun/R4.jpg", placeholder = placeholderCarnivalFun, assetFilter = assetFilterCarnivalFun),

            FilterModel(69, "V1", "filters/moonlight_magic/V1.jpg", placeholder = placeholderMoonlightMagic, assetFilter = assetFilterMoonlightMagic),
            FilterModel(70, "V2", "filters/moonlight_magic/V2.jpg", placeholder = placeholderMoonlightMagic, assetFilter = assetFilterMoonlightMagic),
            FilterModel(71, "V3", "filters/moonlight_magic/V3.jpg", placeholder = placeholderMoonlightMagic, assetFilter = assetFilterMoonlightMagic),
            FilterModel(72, "V4", "filters/moonlight_magic/V4.jpg", placeholder = placeholderMoonlightMagic, assetFilter = assetFilterMoonlightMagic)
        )
    }

    fun getFilterListByCategoryID(categoryID: Int): List<FilterModel> {
        val allFilterModel = getAllFilterModel()

        return when (categoryID) {
            ID_TRENDING -> {
                listOf(
                    allFilterModel[0],
                    allFilterModel[1],
                    allFilterModel[2],
                    allFilterModel[3],
                    allFilterModel[4],
                    allFilterModel[5],
                    allFilterModel[6],
                    allFilterModel[7],
                    allFilterModel[8],
                    allFilterModel[9],
                    allFilterModel[36],
                    allFilterModel[37],
                    allFilterModel[38],
                    allFilterModel[39],
                    allFilterModel[40],
                    allFilterModel[41],
                    allFilterModel[42],
                    allFilterModel[43],
                    allFilterModel[44],
                    allFilterModel[45],
                    allFilterModel[46],
                )
            }

            ID_SPRING_BOOM -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "spring_boom.webp"),
                    allFilterModel[47],
                    allFilterModel[48],
                    allFilterModel[49],
                    allFilterModel[50],
                    allFilterModel[51]
                )
            }

            ID_SUNSET_GLOW -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "sunset_glow.webp"),
                    allFilterModel[52],
                    allFilterModel[53],
                    allFilterModel[54],
                    allFilterModel[55]
                )
            }

            ID_POLAROID_MEMORIES -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "polaroid_memories.webp"),
                    allFilterModel[56],
                    allFilterModel[57],
                    allFilterModel[58],
                    allFilterModel[59]
                )
            }

            ID_TOKYO_NIGHTS -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "tokyo_nights.webp"),
                    allFilterModel[60],
                    allFilterModel[61],
                    allFilterModel[62],
                    allFilterModel[63],
                    allFilterModel[64]
                )
            }
            ID_CARNIVAL_FUN -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "carnival_fun.webp"),
                    allFilterModel[65],
                    allFilterModel[66],
                    allFilterModel[67],
                    allFilterModel[68]
                )
            }
            ID_MOONLIGHT_MAGIC -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "moonlight_magic.webp"),
                    allFilterModel[69],
                    allFilterModel[70],
                    allFilterModel[71],
                    allFilterModel[72]
                )
            }

            ID_FILM_NOIR -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "film_noir.webp"),
                    allFilterModel[10],
                    allFilterModel[11],
                    allFilterModel[12],
                    allFilterModel[13],
                    allFilterModel[14],
                    allFilterModel[15],
                    allFilterModel[16],
                    allFilterModel[17],
                    allFilterModel[18],
                    allFilterModel[19],
                )
            }

            ID_FIREFLY_NIGHT -> {
                listOf(
                    FilterModel(0,"None", "filters/NONE.jpg", placeholder = R.drawable.ic_launcher_background, assetFilter = "firefly_night.webp"),
                    allFilterModel[20],
                    allFilterModel[21],
                    allFilterModel[22],
                    allFilterModel[23],
                    allFilterModel[24],
                    allFilterModel[25],
                    allFilterModel[26],
                    allFilterModel[27],
                    allFilterModel[28],
                    allFilterModel[29],
                    allFilterModel[30],
                    allFilterModel[31],
                    allFilterModel[32],
                    allFilterModel[33],
                    allFilterModel[34],
                    allFilterModel[35],
                )
            }

            else -> emptyList()
        }
    }
}