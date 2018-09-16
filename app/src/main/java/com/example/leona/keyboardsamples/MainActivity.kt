package com.example.leona.keyboardsamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val editText_main=findViewById<EditText>(R.id.editText_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showText(v: View)
    {
        if (editText_main != null)
        {
            val showString= editText_main.text.toString()
            Toast.makeText(this,showString, Toast.LENGTH_SHORT).show()
        }
    }

}
