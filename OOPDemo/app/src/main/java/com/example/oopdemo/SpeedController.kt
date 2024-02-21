package com.example.oopdemo

interface SpeedController {
    fun accelerate()
    fun decelerate()

    fun getBrandID() : String{
        return "ADSIAP#"
    }
}