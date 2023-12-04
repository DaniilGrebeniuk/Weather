package com.example.weather

//создали дата класс с переменными в которые будет передаваться и храниться информация
data class DayItem(

    val city: String, //переменная города
    val time: String, //переменная времени
    val condition: String, //переменная описания погоды
    val imageUrl: String, //переменная картинка погоды
    val currentTemp: String, //температура в настоящее время
    val maxTemp: String,// максимальная температура
    val minTemp: String, //минимальная температура
    val hours: String //переменная для отдельных часов


)
