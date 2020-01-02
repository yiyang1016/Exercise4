package com.example.exercise4

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_date_picker.*
import java.util.*

class DatePicker : Fragment() {

    lateinit var calBtn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView = inflater.inflate(R.layout.fragment_date_picker, container, false)
        calBtn = rootView.findViewById(R.id.button)
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        var year = c.get(Calendar.YEAR)

        calBtn.setOnClickListener {
            val dpd = DatePickerDialog(activity!!,
                DatePickerDialog.OnDateSetListener
                { view, myear, monthOfYear, dayOfMonth ->
                    textView.text = "$dayOfMonth, $monthOfYear $year"
                    year = myear
                    (activity as MainActivity?)?.calculate(myear)
                }, year,month,day)

        //show datepicker
        dpd.show()
    }
        return rootView
}
}
