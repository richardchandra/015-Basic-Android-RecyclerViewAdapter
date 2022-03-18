package com.example.a015recyclerview

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast:Button = findViewById(R.id.btnShowToast)
        btnShowToast.setOnClickListener{
            Log.i(TAG, "Button was clicked!")
            showToast(resources.getString(R.string.btn_was_clicked), Toast.LENGTH_LONG)
        }
    }


}