package com.example.oopdemo

import android.util.Log

class MyCar : Car(), SpeedController {
    override fun start() {
        Log.i("MyTag","Meu carro está ligando... sua marca é ${getBrandID()}. Sua velocidade é $maxSpeed")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}