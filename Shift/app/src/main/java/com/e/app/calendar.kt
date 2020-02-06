package com.e.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calendar.*
import kotlinx.android.synthetic.main.activity_sport_services.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class calendar : AppCompatActivity() {

    var service : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
    }

    override fun onStart() {
        super.onStart()

        val intent : Intent = getIntent()
        service = intent.getStringExtra("service")!!

        when(service){
            "MMA" -> serviceTitle.text = "MMA ринг"
            "Brusya" -> serviceTitle.text = "Брусья"
            "gym" -> serviceTitle.text = "Качалка"
            "cardio" -> serviceTitle.text = "Беговая дорожка"
            "yoga" -> serviceTitle.text = "Йога"
        }
        getReservation()
    }

    fun getReservation() {
        App.service.getReservation(service,calendarView.date).enqueue(object : Callback<List<ReservationEnity>> {
            override fun onFailure(call: Call<List<ReservationEnity>>, t: Throwable) {
                Toast.makeText(this@calendar, "${t.message}", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<ReservationEnity>>, response: Response<List<ReservationEnity>>) {
                //Log.e("myLog","$response")
                //Toast.makeText(this@calendar, "${response.body()}", Toast.LENGTH_LONG).show()
                //response.body()?.let { adapter.bind(it) }


            }
        })
    }
}
