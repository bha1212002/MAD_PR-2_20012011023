package com.example.mad_pr_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "onCreate:Function called ")
        Toast.makeText(this, "onCreate:Function called", Toast.LENGTH_SHORT).show()

        Snackbar.make(mycl,"onCreate:Function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onCreate:Function called ")
        Toast.makeText(this, "onCreate:Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onCreate:Function called",Snackbar.LENGTH_LONG).show()
    }
}