package com.example.exerciseintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var bundle :Bundle ?=intent.extras
        var name = bundle!!.getString("name")
        var email = bundle!!.getString("email")
        var domicile = bundle!!.getString("domicile")
        var age = bundle!!.getInt("age")
        var status = bundle!!.getBoolean("status")

        findViewById<TextView>(R.id.textintent).apply{
            text = name.toString()
        }

        findViewById<TextView>(R.id.textintent2).apply{
            text = email.toString()
        }

        findViewById<TextView>(R.id.textintent3).apply{
            text = domicile.toString()
        }

        findViewById<TextView>(R.id.textintent4).apply{
            text = age.toInt().toString()
        }

        findViewById<TextView>(R.id.textintent5).apply{
            if(status == true){
                text = "Menikah"
            } else {
                text = "belum menikah"
            }
        }
    }

}


