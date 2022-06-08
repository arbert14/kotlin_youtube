package com.example.kotlin_youtube

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kotlin_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val TAG : String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume called")
    }

    override fun onPause() {
        super.onPause()
        binding.relative.setBackgroundColor(Color.parseColor("#0064c8"))
        Log.d(TAG, "MainActivity - onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity - onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        binding.relative.setBackgroundResource(R.drawable.splash_bg_gradient)
        Log.d(TAG, "MainActivity - onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        
        Log.d(TAG, "MainActivity - onDestroy called")
    }
}