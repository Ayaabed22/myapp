package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() , View.OnClickListener{
    private lateinit var number1:EditText
    private lateinit var number2:EditText
    private lateinit var total:TextView
    private lateinit var btnAdd:Button
    private lateinit var btnSub:Button
    private lateinit var btnMul:Button
    private lateinit var btnMod:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()


    }

    private fun initViews(){
        number1 = findViewById(R.id.et_number1)
        number2 = findViewById(R.id.et_number2)
        total = findViewById(R.id.et_total)
        btnAdd = findViewById(R.id.btn_Add)
        btnSub = findViewById(R.id.btn_sub)
        btnMul = findViewById(R.id.btn_mul)
        btnMod = findViewById(R.id.btn_mod)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMul.setOnClickListener(this)
        btnMod.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_Add -> {
                val var1 = number1.text.toString().toLongOrNull()
                val var2 = number2.text.toString().toLongOrNull()

                if (var1 != null && var2 != null) {

                    val result = var1 + var2
                    total.text = result.toString()
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()


                } else {
                    println("$var1+$var2")

                    Toast.makeText(this@MainActivity, "Wong Number", Toast.LENGTH_LONG).show()
                }
            }
            R.id.btn_sub -> {
                val var1 = number1.text.toString().toLongOrNull()
                val var2 = number2.text.toString().toLongOrNull()

                if (var1 != null && var2 != null) {

                    val result = var1 - var2
                    total.text = result.toString()
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()


                } else {
                    println("$var1-$var2")

                    Toast.makeText(this@MainActivity, "Wong Number", Toast.LENGTH_LONG).show()
                }
            }

            R.id.btn_mul ->{
                val var1 = number1.text.toString().toLongOrNull()
                val var2 = number2.text.toString().toLongOrNull()

                if (var1 != null && var2 != null) {

                    val result = var1 * var2
                    total.text = result.toString()
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()


                } else {
                    println("$var1*$var2")

                    Toast.makeText(this@MainActivity, "Wong Number", Toast.LENGTH_LONG).show()
                }
            }

            R.id.btn_mod -> {
                val var1 = number1.text.toString().toLongOrNull()
                val var2 = number2.text.toString().toLongOrNull()

                if (var1 != null && var2 != null) {

                    val result = var1 % var2
                    total.text = result.toString()
                    Toast.makeText(this@MainActivity, "$result", Toast.LENGTH_LONG).show()


                } else {
                    println("$var1%$var2")

                    Toast.makeText(this@MainActivity, "Wong Number", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}


