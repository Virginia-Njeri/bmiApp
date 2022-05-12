package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class calculateBmiActivity : AppCompatActivity() {
    lateinit var sendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmi)
        sendMoney=findViewById(R.id.btnsendmoney)
        sendMoney.setOnClickListener {
            val intent=Intent(this,sendMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}