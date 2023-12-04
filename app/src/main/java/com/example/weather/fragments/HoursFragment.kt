package com.example.weather.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weather.R
//Coздаем фрагмент в котором будет информация температуры по часам
class HoursFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hours, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HoursFragment()
    }
}
