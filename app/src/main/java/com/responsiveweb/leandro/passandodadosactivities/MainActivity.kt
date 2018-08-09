package com.responsiveweb.leandro.passandodadosactivities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_passar_dados.setOnClickListener {

            val intent = Intent(this, SegundaActivity::class.java)

            //Passar dados

            intent.putExtra("nome", "Leandro")
            intent.putExtra("idade", 30)

            startActivity(intent)
        }
    }
}
