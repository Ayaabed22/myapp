package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Number1 = findViewById<EditText>(R.id.et_number1)
        val Number2 = findViewById<EditText>(R.id.et_number2)
        val Total = findViewById<EditText>(R.id.et_total)
        val btnadd = findViewById<Button>(R.id.btn_Add)
        val btnsub = findViewById<Button>(R.id.btn_sub)
        val btnmul = findViewById<Button>(R.id.btn_mul)
        val btnmod = findViewById<Button>(R.id.btn_mod)

        btnadd.setOnClickListener {
            val var1 = Number1.text.toString().toInt()
            val var2 = Number2.text.toString().toInt()

            if (var1 != null && var2 != null) {

                val result = var1 + var2
                Total.setText(result.toString())
                Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()


            } else {
                println("$var1+$var2")

                Toast.makeText(this@MainActivity, "Worng Number", Toast.LENGTH_LONG).show()
            }



            btnsub.setOnClickListener {
                val var1 = Number1.text.toString().toInt()
                val var2 = Number2.text.toString().toInt()

                val result = var1 - var2

                Total.setText(result.toString())


            }
            btnmul.setOnClickListener {
                val var1 = Number1.text.toString().toInt()
                val var2 = Number2.text.toString().toInt()

                val result = var1 * var2

                Total.setText(result.toString())


            }
            btnmod.setOnClickListener {
                val var1 = Number1.text.toString().toInt()
                val var2 = Number2.text.toString().toInt()

                val result = var1 % var2

                Total.setText(result.toString())
            }
        }
    }
}


