package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myapplication.R.id.tvHello

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MYTAG","MainActivity : OnCreate") //Para checar no Log Cat se está funcionando

        val greetingTextView = findViewById<TextView>(tvHello) //Instancia variável para a caixa de texto
        val inputField = findViewById<EditText>(R.id.etName) // Instancia variável para a caixa de entrada de texto
        val submitButton = findViewById<Button>(R.id.btnSubmit) //Instancia variável para o botão de login
        val offersButton = findViewById<Button>(R.id.btnOffers) // Instancia variavel para botão de ofertas
        var enteredName =""//Var pode ser mudado, Val é constante

        submitButton.setOnClickListener { //Função que diz o que acontece ao apertar o botão
             enteredName = inputField.text.toString()
            if (enteredName ==""){
                offersButton.visibility= INVISIBLE
                greetingTextView.text= getString(R.string.ola_mensagem) //chama a string ola_mensagem
                Toast.makeText(this@MainActivity, "Please, enter your name", Toast.LENGTH_SHORT).show() // Toast é uma caixa de texto temporária
            }else {
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputField.text.clear()
                offersButton.visibility= VISIBLE
            }
        }
        offersButton.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","MainActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity : OnResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity : OnPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity : OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","MainActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity : OnRestart")

    }
}