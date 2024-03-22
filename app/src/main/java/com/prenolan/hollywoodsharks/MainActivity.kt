package com.prenolan.hollywoodsharks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {


    //declare variables
    //the keywords latenit allows us to initalize at a later stage
    private lateinit var  openbutton:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //making use of the find view by ID method
        //intializing the variable by getting reference to the button
        //get reference by using ID name



        openbutton = findViewById(R.id.button2)

        openbutton.setOnClickListener {


            //create a variable
            val intent = Intent(this,Screen2Activity::class.java)
            startActivity(intent)

        }
    }
}