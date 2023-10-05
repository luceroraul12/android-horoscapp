package com.example.horoscapp.domain.model

import com.example.horoscapp.R

sealed class HoroscopeInfo(val name: Int, val image: Int) {
    object Aries: HoroscopeInfo(R.string.aries, R.drawable.aries)
    object Aquario: HoroscopeInfo(R.string.aquario, R.drawable.aquario)
    object Cancer: HoroscopeInfo(R.string.cancer, R.drawable.cancer)
    object Capricornio: HoroscopeInfo(R.string.carpicornio, R.drawable.capricornio)
    object Escorpio: HoroscopeInfo(R.string.escorpio, R.drawable.escorpio)
    object Geminis: HoroscopeInfo(R.string.geminis, R.drawable.geminis)
    object Leo: HoroscopeInfo(R.string.leo, R.drawable.leo)
    object Libra: HoroscopeInfo(R.string.libra, R.drawable.libra)
    object Piscis: HoroscopeInfo(R.string.piscis, R.drawable.piscis)
    object Sagitario: HoroscopeInfo(R.string.sagitario, R.drawable.sagitario)
    object Tauro: HoroscopeInfo(R.string.tauro, R.drawable.tauro)
}