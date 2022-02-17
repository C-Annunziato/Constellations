package com.example.constellations.data

import com.example.constellations.R
import com.example.constellations.model.ZodiacSigns

class DataSourceZodiacSigns {


    fun loadZodiacSigns(): List<ZodiacSigns>{
        return listOf<ZodiacSigns>(

            ZodiacSigns(R.string.aquarius_horo),
            ZodiacSigns(R.string.pisces_horo),
            ZodiacSigns(R.string.aries_horo),
            ZodiacSigns(R.string.taurus_horo),
            ZodiacSigns(R.string.gemini_horo),
            ZodiacSigns(R.string.cancer_horo),
            ZodiacSigns(R.string.leo_horo),
            ZodiacSigns(R.string.virgo_horo),
            ZodiacSigns(R.string.libra_horo),
            ZodiacSigns(R.string.scorpio_horo),
            ZodiacSigns(R.string.sagittarius_horo),
            ZodiacSigns(R.string.capricorn_horo),


        )
    }

}