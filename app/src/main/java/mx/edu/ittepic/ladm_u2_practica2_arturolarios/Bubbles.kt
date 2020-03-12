package mx.edu.ittepic.ladm_u2_practica2_arturolarios

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class Bubbles
{
    var color = arrayOf(0, 0, 0)
    var x = 0
    var y = 0
    var radio = 0

    var velocityX = 0
    var velocityY = 0

    private val sMax = 200
    private val vMin = 2

    private val sign = arrayOf(1, -1)

    constructor()
    {
        color[0] = (0 until 255).random()
        color[1] = (0 until 255).random()
        color[2] = (0 until 255).random()

        radio = (5..200).random()
        x = (radio until 600).random()
        y = (radio until 600).random()

        velocityX = sMax * vMin / radio
        velocityX *= sign[(0..1).random()]
        velocityY = velocityX
    }

    fun drawBubble(canvas : Canvas, p : Paint)
    {
        p.color = Color.rgb(color[0], color[1], color[2])
        canvas.drawCircle(x.toFloat(), y.toFloat(), radio.toFloat(), p)
    }

    fun rebound(width : Int, height : Int)
    {
        x += velocityX
        if(x < radio || x > width - radio)
            velocityX *= -1

        y += velocityY
        if(y < radio || y > height - radio)
            velocityY *= -1
    }
}