package com.example.cs541_prj4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fightbtn.setOnClickListener{fight()}
        towelbtn.setOnClickListener{quit()}
    }

    fun fight() {
        val animtime: CountDownTimer
        animtime = object : CountDownTimer(250, 50)    {
            override fun onTick(millisuntilFinished: Long) {}
            override fun onFinish() {p1img.setImageResource(R.mipmap.boxer_foreground)}
        }

        p1img.setImageResource(R.mipmap.bigboxer_foreground)
        animtime.start()
    }

    fun quit(){
        return
    }
}