package com.example.weather.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

//Создаем адаптер с помощью которого будем переключать наши два фрагмента
class VpAdapter(fa : FragmentActivity, private val  list: List<Fragment>) :FragmentStateAdapter(fa) {
    //так как мы наследуемся от FragmentStateAdapter нужно передать количество элементов мы
    //мы их передаем через переменную в конструкторе, вернув размер(size)
    override fun getItemCount(): Int {
        return list.size //возвращает сколько будет у нас фрагментов в адаптере
    }
//функция переключения
    override fun createFragment(position: Int): Fragment {
    return list[position] //переключение по позиции
    }
}