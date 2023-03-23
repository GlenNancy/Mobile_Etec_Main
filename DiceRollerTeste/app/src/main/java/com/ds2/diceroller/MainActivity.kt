package com.ds2.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btnRollDice)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Rolou o dado!", Toast.LENGTH_SHORT).show()
            val resultTextView: TextView = findViewById(R.id.textView)
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resulTextView: TextView = findViewById(R.id.textView)
        resulTextView.text = diceRoll.toString()
    }
}
class Dice (private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}