package com.oddinstitute.pathtextdrawing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.FrameLayout

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val drawView = DrawView(this)
        findViewById<FrameLayout>(R.id.canvasId).addView(drawView)




    }
}