package com.e.app

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sport_services.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.security.NoSuchAlgorithmException
import javax.net.ssl.SSLContext

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
        val serviceTitle : TextView = findViewById(R.id.serviceTitle)

        buttonToJim.setOnClickListener(this::clickEvent)
        buttonToCardio.setOnClickListener(this::clickEvent)
        buttonToYoga.setOnClickListener(this::clickEvent)
        buttonToBrus.setOnClickListener(this::clickEvent)
        buttonToMMA.setOnClickListener(this::clickEvent)

        getServices()
    }

    private fun clickEvent(view: View){
        val myIntent = Intent(this, calendar::class.java)
        //myIntent.putExtra()


    }

    fun getServices() {
        App.service.getServices().enqueue(object : Callback<List<Services>> {
            override fun onFailure(call: Call<List<Services>>, t: Throwable) {
                Toast.makeText(this@sportServices, "${t.message}", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<List<Services>>, response: Response<List<Services>>) {
                Toast.makeText(this@sportServices, "${response.body()}", Toast.LENGTH_LONG).show()
                //response.body()?.let { adapter.bind(it) }
                response.body()?.let { buttontobar.text = it[0].rus }
                response.body()?.let { buttontobar.text = it[1].rus }
                response.body()?.let { buttontobar.text = it[2].rus }
                response.body()?.let { buttontobar.text = it[3].rus }
                response.body()?.let { buttontobar.text = it[4].rus }

            }
        })
    }







}
