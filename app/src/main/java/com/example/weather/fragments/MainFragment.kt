package com.example.weather.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weather.R
import com.example.weather.databinding.FragmentMainBinding


class MainFragment : Fragment() {
//Создём переменную в которой будет храниться эту инстанцию
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //кладем в нашу переменную Фрагмент
        binding = FragmentMainBinding.inflate(inflater,container,false)
//передаем root(это и есть наше view)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainFragment()
    }
}