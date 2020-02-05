package com.e.app

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class sportServices : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_services)


        val image : ImageView = findViewById(R.id.serviceImage)
        val buttonToJim : Button = findViewById(R.id.buttonToJimService)
        val buttonToCardio : Button = findViewById(R.id.buttonToCardio)
        val buttonToYoga : Button = findViewById(R.id.buttonToYoga)
        val buttonToBrus : Button = findViewById(R.id.buttonToBrusya)
        val buttonToMMA : Button = findViewById(R.id.buttonToMMA)

        buttonToJim.setOnClickListener(this::clickEvent)
        buttonToCardio.setOnClickListener(this::clickEvent)
        buttonToYoga.setOnClickListener(this::clickEvent)
        buttonToBrus.setOnClickListener(this::clickEvent)
        buttonToMMA.setOnClickListener(this::clickEvent)
    }

    private fun clickEvent(view: View){
        val myIntent = Intent(this, calendar::class.java)
        //myIntent.putExtra()

    }




    val myIntent = Intent(this, calendar::class.java)


}
