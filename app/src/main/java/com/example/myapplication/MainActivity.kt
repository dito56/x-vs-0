package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity() : AppCompatActivity(), View.OnClickListener, Parcelable {
    private lateinit var textViewPlayer2: Any
    private lateinit var textViewPlayer1: Any
    private lateinit var button1 :Button
    private lateinit var button2 :Button
    private lateinit var button3 :Button
    private lateinit var button4 :Button
    private lateinit var button5 :Button
    private lateinit var button6 :Button
    private lateinit var button7 :Button
    private lateinit var button8 :Button
    private lateinit var button9 :Button
    private lateinit var resButton: Button

    constructor(parcel: Parcel) : this() {

    }
    private  int{}
    private var actvePlayer=1
    private var firstPlayer = ArrayList<int>()
    private var secondPlayer = ArrayList<int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }
    private fun int(){
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        resButton = findViewById(R.id.resButton)
        textViewPlayer1 = findViewById(R.id.player1)
        textViewPlayer2= findViewById(R.id.player2)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
    }


    override fun onClick(clickedView: View?) {

        if (clickedView is Button){

            var buttonNumber = 0

            when(clickedView.id) {
                R.id.button1 -> buttonNumber = 1
                R.id.button2 -> buttonNumber = 2
                R.id.button3 -> buttonNumber = 3
                R.id.button4 -> buttonNumber = 4
                R.id.button5 -> buttonNumber = 5
                R.id.button6 -> buttonNumber = 6
                R.id.button7 -> buttonNumber = 7
                R.id.button8 -> buttonNumber = 8
                R.id.button9 -> buttonNumber = 9
            }
            if (buttonNumber !=0) {
                playGame(clickedView,buttonNumber)
            }
    }


}

    private fun playGame(clickedView: Button, buttonNumber: Int) {
        if (actvePlayer == 1) {
            clickedView.text = "x"
            clickedView.setBackgroundColor(Color.BLUE)
            firstPlayer.add(buttonNumber)
            actvePlayer = 2
        } else {
            clickedView.text = "0"
            clickedView.setBackgroundColor(Color.GRAY)
            secondPlayer.add(buttonNumber)
            actvePlayer = 1
        }
        clickedView.isEnabled = false
        check()

    }
    private fun check() {

        var winnerPlayer = 0
        if (firstPlayer.contains(1) && firstPlayer.contains(2) && firstPlayer.contains(3)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(2) && secondPlayer.contains(3)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(4) && firstPlayer.contains(5) && firstPlayer.contains(6)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(4) && secondPlayer.contains(5) && secondPlayer.contains(6)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(7) && firstPlayer.contains(8) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(7) && secondPlayer.contains(8) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(5) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(5) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(5) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(5) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(1) && firstPlayer.contains(4) && firstPlayer.contains(7)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(1) && secondPlayer.contains(4) && secondPlayer.contains(7)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(2) && firstPlayer.contains(5) && firstPlayer.contains(8)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(2) && secondPlayer.contains(5) && secondPlayer.contains(8)) {
            winnerPlayer = 2
        }
        if (firstPlayer.contains(3) && firstPlayer.contains(6) && firstPlayer.contains(9)) {
            winnerPlayer = 1
        }
        if (secondPlayer.contains(3) && secondPlayer.contains(6) && secondPlayer.contains(9)) {
            winnerPlayer = 2
        }

        if (winnerPlayer == 1 ){
            Toast.makeText(this,"111",Toast.LENGTH_SHORT ).show()
            updatePointsText()
            resetBoard()
        } else if (winnerPlayer ==2 ) {
            Toast.makeText(this, "222", Toast.LENGTH_SHORT).show()
            resetBoard()
            updatePointsText()
        }



        }
    private fun player1Wins() {
        player1points++
        Toast.makeText(this,"x იგებს", Toast.LENGTH_SHORT).show()
        updatePointsText()
        resetBoard()

    }
    private fun player2Wins() {
        Toast.makeText(this,"0 იგებს", Toast.LENGTH_SHORT).show()
        resetBoard()
    }
    private fun player2Wins() {
        Toast.makeText(this,"ფრე", Toast.LENGTH_SHORT).show()
        resetBoard()
    }


    }

    private fun resetBoard() {

}
