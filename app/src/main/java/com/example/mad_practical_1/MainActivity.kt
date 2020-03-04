package com.example.mad_practical_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val addButton: Button = findViewById(R.id.add_button)

        diceImage = findViewById(R.id.dice_image)

        rollButton.setOnClickListener { rollDice() }
            //addButton.setOnClickListener{ add() }
    }
    private fun rollDice() {
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    /*private fun add(){
        val resultText: TextView = findViewById(R.id.result_text)
        val value = resultText.text.toString().toIntOrNull()
        if(value == null){
            resultText.text = 1.toString()
        }
        else if(value < 6) {
            resultText.text = (value + 1).toString()
        }
    }*/


}
