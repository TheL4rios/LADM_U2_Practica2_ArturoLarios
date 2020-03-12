package mx.edu.ittepic.ladm_u2_practica2_arturolarios

import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Canvas(main : MainActivity) : View(main)
{
    var bubble = Array<Bubbles>(20) {Bubbles()}

    override fun onDraw(canvas: Canvas)
    {
        super.onDraw(canvas)

        var p = Paint()

        (0 until 19).forEach {
            bubble[it].drawBubble(canvas, p)
        }
    }

    fun rebound()
    {
        (0 until 19).forEach {
            bubble[it].rebound(width, height)
        }
        invalidate()
    }
}