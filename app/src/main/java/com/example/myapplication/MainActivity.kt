package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TokenWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Number1 = findViewById<EditText>(R.id.et_number1)
        val Number2 = findViewById<EditText>(R.id.et_number2)
        val Total = findViewById<TextView>(R.id.tv_total)
        val btnadd = findViewById<Button>(R.id.btn_Add)
        val btnsub = findViewById<Button>(R.id.btn_sub)
        val btnmul = findViewById<Button>(R.id.btn_mul)
        val btnmod = findViewById<Button>(R.id.btn_mod)


        btnadd.setOnClickListener {
            val var1 = Number1.text.toString().toLongOrNull()
            val var2 = Number2.text.toString().toLongOrNull()
            if (var1 == null || var2 == null) {
                Toast.makeText(this@MainActivity, "Worng Number", Toast.LENGTH_LONG).show()
            }
                else {
                    val result = var1 + var2
                    Total.setText(result.toString())
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()
                }
        }

            btnsub.setOnClickListener {

                val var1 = Number1.text.toString().toLongOrNull()
                val var2 = Number2.text.toString().toLongOrNull()

                if (var1 == null || var2 == null) {
                    Toast.makeText(this@MainActivity, "Worng Number", Toast.LENGTH_LONG).show()
                } else {
                    val result = var1 - var2
                    Total.setText(result.toString())
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()

                }
            }
            btnmul.setOnClickListener {

                val var1 = Number1.text.toString().toLongOrNull()
                val var2 = Number2.text.toString().toLongOrNull()

                if (var1 == null || var2 == null) {
                    Toast.makeText(this@MainActivity, "Worng Number", Toast.LENGTH_LONG).show()
                } else {
                    val result = var1 * var2
                    Total.setText(result.toString())
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()
                }
            }
            btnmod.setOnClickListener {

                val var1 = Number1.text.toString().toLongOrNull()
                val var2 = Number2.text.toString().toLongOrNull()

                if (var1 == null || var2 == null) {
                    Toast.makeText(this@MainActivity, "Worng Number", Toast.LENGTH_LONG).show()
                } else {
                    val result = var1 % var2
                    Total.setText(result.toString())
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()
                }
            }
        }
    }









