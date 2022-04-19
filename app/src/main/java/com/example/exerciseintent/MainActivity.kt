package com.example.exerciseintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exerciseintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val name:String = "Bryan"
    val age:Int = 24
    val email:String = "bryanrantung98@gmail.com"
    val domicile:String = "Manado"
    val status:Boolean = true
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        binding!!.btnIntent.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("age",age)
            intent.putExtra("email",email)
            intent.putExtra("domicile",domicile)
            intent.putExtra("status",status)
            startActivity(intent)
        }

    }

}