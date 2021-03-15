package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var diceImage: ImageView? = null// data member
   // or lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        super.onCreate(savedInstanceState)
        // load
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener { rollDice() }

    }
        private fun rollDice(){

            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            //Toast= popup message
            //  is a chaining call
            //val resultText: TextView = findViewById(R.id.result_text)
            val diceImage: ImageView= findViewById(R.id.dice_image)
            val randomInt = (1..6).random()
            val drawableResource = when (randomInt){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            //set image resource
            diceImage?.setImageResource(drawableResource)
            //resultText.text =randomInt.toString()


        }
}