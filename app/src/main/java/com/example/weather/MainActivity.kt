package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weather.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager //запускаем наш фрагмент

            .beginTransaction() //Запускаем транзакцию
            .replace(
                R.id.playsHolder,
                MainFragment.newInstance()
            )//Замяем существующий фрагмент, который был добавлен в контейнер
            .commit() //выполняем фиксацию после сохранения состояния действия
    }
}