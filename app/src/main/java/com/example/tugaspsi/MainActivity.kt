package com.example.tugaspsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.textView);
        val btn = findViewById<Button>(R.id.button);

        tv1.setOnClickListener{
            Toast.makeText(applicationContext, "WAW KAMU BERHASIL MENEKAN TEXT", Toast.LENGTH_SHORT).show()
            tv1.setText("TEXT INI TELAH BERUBAH!!!");
        }
        btn.setOnLongClickListener {
            Toast.makeText(applicationContext, "HASIL DARI BTN", Toast.LENGTH_SHORT).show()
            true
        }
        btn.setOnClickListener {
            val Intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}