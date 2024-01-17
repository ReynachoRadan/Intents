package com.intents.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity(),
View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val btnBackActivity: Button =
            findViewById(R.id.btn_back_data)
        btnBackActivity.setOnClickListener(this)

        val tvDataReceived: TextView =
            findViewById(R.id.tv_data_recieved)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val address = intent.getStringExtra(EXTRA_ADDRESS)
        val Gender = intent.getStringExtra(EXTRA_GENDER)
        val text = "Name : $name, Your Age : $age, Address : $address, Gender : $Gender"
        tvDataReceived.text = text
    }
    companion object{
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_GENDER = "extra_gender"
    }

    override fun onClick(v: View){
        when(v.id){
            R.id.btn_back_data -> {
                val backintent = Intent(
                    this@MoveWithDataActivity,
                    MainActivity::class.java
                )
                startActivity(backintent)
            }
        }
    }
}