package com.example.tugaspsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv2 = findViewById<TextView>(R.id.textView2);
        val btn2 = findViewById<Button>(R.id.button2)

        tv2.setOnClickListener{
            Toast.makeText(applicationContext, "CLIK TEXT SUCCESS", Toast.LENGTH_SHORT).show()
        }
        btn2.setOnLongClickListener {
            Toast.makeText(applicationContext, "HASIL DARI BTN", Toast.LENGTH_SHORT).show()
            true
        }
        btn2.setOnClickListener {
            tv2.setText("BTN TELAH DITEKAN!!");
        }
    }
}