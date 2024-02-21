package com.example.oopdemo

import android.util.Log

open class Car {  //Open é uma palavra chave que indica que a classe pode ter
    var maxSpeed = 30
    open fun start(){
        Log.i("MyTag","Car is starting...")
        Log.i("MyTag","My maximum speed is $maxSpeed")
    }
}