package com.example.weather.fragments

import android.Manifest
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.example.weather.R
import com.example.weather.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    //Создали переменную для лаунчира
    private lateinit var pLauncher: ActivityResultLauncher<String>

    //Создём переменную в которой будет храниться эту инстанцию
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //кладем в нашу переменную Фрагмент
        binding = FragmentMainBinding.inflate(inflater, container, false)
//передаем root(это и есть наше view)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkPermission() //запускаем проверку
    }

    //Сщздаём функцию для лаунчира здесь будет прописанна логика в зависимости от выбора пользователя даёт/не даёт разрешение
    private fun permissionListener() {
        pLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) {

            Toast.makeText(activity, "Permision is $it", Toast.LENGTH_SHORT).show()
        }
    }
//функция запроса если разрешения нет, то выводим лаунчер с запросом
    private fun checkPermission() {
        if (!isPermissionGranted(Manifest.permission.ACCESS_FINE_LOCATION))
            permissionListener()
        pLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MainFragment()
    }
}