package com.example.oopdemo

import android.util.Log

class Driver (var nome : String, credit : Int) { //Construtor em Kotlin é assim
    private var totalCredit = 50
    private val car = Car()
    //private var diverName = nome/ Para caso não usásemos o VAR após o nome da classe
    //lateinit var diverName : String/ se quisermos instanciar variáveis apenas quando criarmos o init

    init{ //O que ocorrerá quando a instância for criada. É um "construtor"
        totalCredit +=credit
        car.maxSpeed=150
        car.start()
    }

    fun showDetails(){
        Log.i("MyTag","Name of the driver is $nome with $totalCredit credits")

    }
}