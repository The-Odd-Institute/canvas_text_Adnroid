package com.oddinstitute.pathtextdrawing

import android.content.Context
import android.graphics.*
import android.view.View
import android.text.TextPaint
import androidx.core.content.res.ResourcesCompat

import android.graphics.Typeface

import android.os.Build







class DrawView(context: Context) : View(context)
{
    var paint: Paint = Paint()
    var path: Path = Path()

    val textPaint = TextPaint(Paint.ANTI_ALIAS_FLAG)

    init
    {
        textPaint.color = Color.GREEN
        textPaint.textSize = 150f
        textPaint.textAlign = Paint.Align.CENTER

        textPaint.typeface = Typeface.create("Arial", Typeface.BOLD);


        // customize fonts
        // https://proandroiddev.com/android-downloadable-fonts-8e60d3e146b7
        // and
        // https://stackoverflow.com/questions/23112169/creating-font-and-text-styles-in-android-with-paint-object
//        val typeface: Typeface? = if (Build.VERSION.SDK_INT >= 28)
//        { // This does only works from SDK 28 and higher
//            val typefaceA = ResourcesCompat.getFont(context, R.font.font_resource)
//            Typeface.create(typefaceA, 700, false)
//        }
//        else
//        { // This always works (Whole name without .ttf)
//            ResourcesCompat.getFont(context, R.font.opensans_bolditalic)
//        }
//        textPaint.typeface = typeface
    }


    override fun onDraw(canvas: Canvas)
    {
        paint.color = Color.RED
        paint.style = Paint.Style.FILL


        path.moveTo(20f, 20f)
        path.lineTo(200f, 200f)

        path.lineTo(200f, 300f)

        path.close()

        canvas.drawPath(path, paint)



        canvas.drawText("Amir", 300f, 400f, textPaint)

        //        this.invalidate()
    }
}
























