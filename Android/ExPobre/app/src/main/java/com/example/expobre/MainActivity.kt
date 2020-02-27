package com.example.expobre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var tvNumeros: TextView
    private lateinit var btNovo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvNumeros = findViewById(R.id.tvNumeros)
        this.btNovo = findViewById(R.id.btNovo)

        // forma 1
        //this.gerarNovoJogo(null)

        //forma 2
        //this.btNovo.setOnClickListener( { gerarNovoJogo(it) } )

        //forma 3
        //this.btNovo.setOnClickListener {
        //  this.gerarNovoJogo(null )
        // }
        this.btNovo.setOnClickListener(OnClickBotao())

    }


    /*fun gerarNovoJogo(view: View?){
        this.tvNumeros.text = Megasena.getInstance().joinToString(" ")

    }
    */
    inner class OnClickBotao : View.OnClickListener{
        override fun onClick(p0: View?) {
            this@MainActivity.tvNumeros.text = Megasena.getInstance().joinToString(" ")

        }
    }

}
