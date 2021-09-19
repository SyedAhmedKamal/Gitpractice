package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("this is second dummy commit")
        println("Last commit so far.")
        println("Change 1")
        println("Commit from another developer.")
    }
}