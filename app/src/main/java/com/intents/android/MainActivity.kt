package com.intents.android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),
View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMoveActivity: Button =
            findViewById(R.id.btn_move)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithdataActivity: Button =
            findViewById(R.id.btn_move_with_data2)
        btnMoveWithdataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial)
        btnDialPhone.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move -> {
                val moveIntent = Intent(
                    this@MainActivity,
                    MoveActivity::class.java
                )
                startActivity(moveIntent)
            }

            R.id.btn_move_with_data2 -> {
                val movewithDataIntent = Intent(
                    this@MainActivity,
                    MoveWithDataActivity::class.java
                )
                movewithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Radan")
                movewithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 16)
                movewithDataIntent.putExtra(MoveWithDataActivity.EXTRA_ADDRESS,"Poncokusumo")
                movewithDataIntent.putExtra(MoveWithDataActivity.EXTRA_GENDER,"Laki-Laki")
                startActivity(movewithDataIntent)
            }

            R.id.btn_dial -> {
                val phoneNumber = "085706055637"
                val dialPhoneIntent = Intent(
                    Intent.ACTION_DIAL,
                    Uri.parse("tel:$phoneNumber")
                )
                startActivity(dialPhoneIntent)
            }
        }
    }
}