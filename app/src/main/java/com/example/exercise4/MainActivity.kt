package com.example.exercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.exercise4.databinding.ActivityMainBinding
import android.app.DatePickerDialog
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance()
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val month = calendar.get(Calendar.MONTH)
        var year = calendar.get(Calendar.YEAR)
    }


//            textView2.setText("Min. Basic Saving = " + age)
        fun calculate(year: Int) {


        //val yearNow = Year.now().value
        val age = (2020 - year) -1

        var saving = 0
        if(age in 16..20)
            saving = 5000
        else if(age in 21..25)
            saving = 14000
        else if(age in 26..30)
            saving = 29000
        else if(age in 31..35)
             saving = 50000
        else if(age in 36..40)
            saving = 78000
        else if(age in 41..45)
            saving = 116000
        else if(age in 46..50)
            saving = 165000
        else if(age in 51..55)
            saving = 228000
        else
            saving = 0

        val ageTxt = findViewById<TextView>(R.id.age)
        val minTxt = findViewById<TextView>(R.id.minSaving)
        val maxTxt = findViewById<TextView>(R.id.maxTrans)
        val total = saving*0.30
        ageTxt.setText("Age :" + age)
        minTxt.setText("Min. Basic Saving : RM" + saving)
        maxTxt.setText("Maximum Transfer : RM" + total)
    }
}


