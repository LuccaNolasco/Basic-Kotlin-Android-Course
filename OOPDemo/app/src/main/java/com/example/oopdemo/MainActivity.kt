package com.example.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val motora = Driver("Pedro",28)
        //motora.showDetails()

        val myCar = MyCar()
        myCar.maxSpeed=999
        myCar.start()
    }
}