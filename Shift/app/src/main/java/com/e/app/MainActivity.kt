package com.e.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttontojim : Button =  findViewById(R.id.buttontojim)

        //buttontojim.setOnClickListener(this::clickEvent)
        buttontojim.setOnClickListener{
            val myIntent = Intent(this, sportServices::class.java)
            //myIntent.putExtra()
            startActivity(myIntent)
        }
    }



    private fun clickEvent(view: View){
        val myIntent = Intent(this, sportServices::class.java)
        //myIntent.putExtra()
        startActivity(myIntent)


    }

}
