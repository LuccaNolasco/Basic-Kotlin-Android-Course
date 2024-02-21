package com.example.sharedpreferencesdemo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //Definidas fora da OnCreate para poder ser usada em outras funções
    private lateinit var nameText: EditText
    private lateinit var ageText: EditText
    //Define two reference variables, for Shared Preferences and Share Preferences Editor
    private lateinit var sf:SharedPreferences
    private lateinit var editor:SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Since I already defined the object type above, I don't need to define it again. Only use the find by id.
        nameText = findViewById(R.id.etName)
        ageText = findViewById(R.id.etAge)
        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        //"my_sf" is the name of the file, MODE_PRIVATE allow access only inside our app. ModeAppend will fuse with another shared reference
        editor = sf.edit()

    }

    override fun onPause() {
        super.onPause()
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        editor.apply {
            putString("sf_name",name) //Creating the "keys names" for each value, followed by the variable
            putInt("sf_age",age)
            commit() //To save the value
        }
    }

    override fun onResume() {
        super.onResume()
        //This sf is the one instantiated in line 22. Next is the variable key and the default value
        val name = sf.getString("sf_name",null)
        val age = sf.getInt("sf_age",0)
        nameText.setText(name)
        if(age!=0) { //To prevent showing a 0 the first time the app is run
            ageText.setText(age.toString())
        }
    }
}