package com.example.weather.fragments

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

//функция на проверку есть ли уже разрешение на использование гео
fun Fragment.isPermissionGranted(p : String) : Boolean {
    return ContextCompat.checkSelfPermission(activity as AppCompatActivity,p) == PackageManager.PERMISSION_GRANTED
}