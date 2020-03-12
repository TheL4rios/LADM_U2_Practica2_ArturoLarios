package mx.edu.ittepic.ladm_u2_practica2_arturolarios

import java.lang.Thread

class Thread(main : MainActivity) : Thread()
{
    var m = main

    override fun run()
    {
        super.run()

        while(true)
        {
            sleep(10)
            m.runOnUiThread {
                m.canvas!!.rebound()
            }
        }
    }
}