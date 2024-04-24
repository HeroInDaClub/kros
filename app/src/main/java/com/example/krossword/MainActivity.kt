package com.example.krossword

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.white)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.white)

            // Изменение цвета иконки часов и других элементов статус бара на серый
            val windowFlags = window.decorView.systemUiVisibility
            window.decorView.systemUiVisibility = windowFlags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }

        val editText1 = findViewById<EditText>(R.id.editTextText2)
        val editText3 = findViewById<EditText>(R.id.editTextText4)
        val editText4 = findViewById<EditText>(R.id.editTextText5)
        val editText5 = findViewById<EditText>(R.id.editTextText6)
        val editText6 = findViewById<EditText>(R.id.editTextText7)
        val editText7 = findViewById<EditText>(R.id.editTextText8)
        val editText8 = findViewById<EditText>(R.id.editTextText9)
        val editText11 = findViewById<EditText>(R.id.editTextText12)
        val editText12 = findViewById<EditText>(R.id.editTextText13)
        val editText13 = findViewById<EditText>(R.id.editTextText14)
        val editText14 = findViewById<EditText>(R.id.editTextText15)
        val editText16 = findViewById<EditText>(R.id.editTextText17)
        val editText17 = findViewById<EditText>(R.id.editTextText18)
        val editText18 = findViewById<EditText>(R.id.editTextText19)
        val editText19 = findViewById<EditText>(R.id.editTextText20)
        val editText20 = findViewById<EditText>(R.id.editTextText21)
        val editText21 = findViewById<EditText>(R.id.editTextText22)
        val editText22 = findViewById<EditText>(R.id.editTextText23)
        val editText23 = findViewById<EditText>(R.id.editTextText24)
        val editText24 = findViewById<EditText>(R.id.editTextText25)
        val editText25 = findViewById<EditText>(R.id.editTextText26)
        val editText26 = findViewById<EditText>(R.id.editTextText27)
        val editText27 = findViewById<EditText>(R.id.editTextText28)
        val editText28 = findViewById<EditText>(R.id.editTextText29)
        val editText29 = findViewById<EditText>(R.id.editTextText30)
        val editText30 = findViewById<EditText>(R.id.editTextText31)
        val editText31 = findViewById<EditText>(R.id.editTextText32)
        val editText32 = findViewById<EditText>(R.id.editTextText33)
        val editText33 = findViewById<EditText>(R.id.editTextText34)
        val editText34 = findViewById<EditText>(R.id.editTextText35)
        val editText35 = findViewById<EditText>(R.id.editTextText36)
        val editText36 = findViewById<EditText>(R.id.editTextText37)
        val editText37 = findViewById<EditText>(R.id.editTextText38)
        val editText38 = findViewById<EditText>(R.id.editTextText39)
        val editText39 = findViewById<EditText>(R.id.editTextText40)
        val editText40 = findViewById<EditText>(R.id.editTextText41)
        val editText41 = findViewById<EditText>(R.id.editTextText42)
        val editText42 = findViewById<EditText>(R.id.editTextText43)
        val editText43 = findViewById<EditText>(R.id.editTextText44)
        val editText44 = findViewById<EditText>(R.id.editTextText45)
        val editText45 = findViewById<EditText>(R.id.editTextText46)
        val editText46 = findViewById<EditText>(R.id.editTextText47)
        val editText47 = findViewById<EditText>(R.id.editTextText48)
        val editText48 = findViewById<EditText>(R.id.editTextText49)
        val editText49 = findViewById<EditText>(R.id.editTextText50)
        val editText50 = findViewById<EditText>(R.id.editTextText51)
        val editText51 = findViewById<EditText>(R.id.editTextText52)
        val editText52 = findViewById<EditText>(R.id.editTextText53)
        val editText53 = findViewById<EditText>(R.id.editTextText54)
        val editText54 = findViewById<EditText>(R.id.editTextText55)
        val editText55 = findViewById<EditText>(R.id.editTextText56)
        val editText56 = findViewById<EditText>(R.id.editTextText57)
        val editText57 = findViewById<EditText>(R.id.editTextText58)
        val editText58 = findViewById<EditText>(R.id.editTextText59)
        val editText59 = findViewById<EditText>(R.id.editTextText60)
        val editText60 = findViewById<EditText>(R.id.editTextText61)
        val editText61 = findViewById<EditText>(R.id.editTextText62)
        val editText62 = findViewById<EditText>(R.id.editTextText63)
        val editText63 = findViewById<EditText>(R.id.editTextText64)
        val editText64 = findViewById<EditText>(R.id.editTextText65)
        val editText65 = findViewById<EditText>(R.id.editTextText66)
        val editText66 = findViewById<EditText>(R.id.editTextText67)
        val editText67 = findViewById<EditText>(R.id.editTextText777)



        val editTexts = arrayOf(
            editText1,
            editText3,
            editText4,
            editText5,
            editText6,
            editText7,
            editText8,
            editText11,
            editText12,
            editText13,
            editText14,
            editText16,
            editText17,
            editText18,
            editText19,
            editText20,
            editText21,
            editText22,
            editText23,
            editText24,
            editText25,
            editText26,
            editText27,
            editText28,
            editText29,
            editText30,
            editText31,
            editText32,
            editText33,
            editText34,
            editText35,
            editText36,
            editText37,
            editText38,
            editText39,
            editText40,
            editText41,
            editText42,
            editText43,
            editText44,
            editText45,
            editText46,
            editText47,
            editText48,
            editText49,
            editText50,
            editText51,
            editText52,
            editText53,
            editText54,
            editText55,
            editText56,
            editText57,
            editText58,
            editText59,
            editText60,
            editText61,
            editText62,
            editText63,
            editText64,
            editText65,
            editText66,
            editText67
        )
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.isEnabled =false
        }


        vvod()


        var countTextView = findViewById<TextView>(R.id.count)
        val countText = countTextView.text.toString()
        val count = countText.toInt()

        val lvl2But = findViewById<Button>(R.id.button)
        if (count<10){
            lvl2But.setOnClickListener{
                    Toast.makeText(applicationContext, "Слишком лох чтобы перейти дальше(", Toast.LENGTH_SHORT).show()
            }
        } else{
            lvl2But.setOnClickListener {
                startActivity(Intent(this, Level2::class.java))
            }
        }


    }




    fun act(){
        val fragmentManager = supportFragmentManager
        val fragments = fragmentManager.fragments

        for (fragment in fragments) {
            fragmentManager.beginTransaction().remove(fragment).commit()
        }
        val que1 = findViewById<EditText>(R.id.editTextText1)
        val que2 = findViewById<EditText>(R.id.editTextText3)
        val que3 = findViewById<EditText>(R.id.editTextText16)
        val que4 = findViewById<EditText>(R.id.editTextText10)
        val que5 = findViewById<EditText>(R.id.editTextText11)
        que1.isEnabled =true
        que2.isEnabled =true
        que3.isEnabled =true
        que4.isEnabled =true
        que5.isEnabled =true
    }


    fun vvod(){
        val que1 = findViewById<EditText>(R.id.editTextText1)
        val que2 = findViewById<EditText>(R.id.editTextText3)
        val que3 = findViewById<EditText>(R.id.editTextText16)
        val que4 = findViewById<EditText>(R.id.editTextText10)
        val que5 = findViewById<EditText>(R.id.editTextText11)
        val onFocusChangeListener1 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame, Question1.newInstance(1)).addToBackStack(null).commit()
                que1.isEnabled =false
                que2.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
            }
        }
        que1.setOnFocusChangeListener(onFocusChangeListener1)



        val onFocusChangeListener2 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame, Question1.newInstance(2)).addToBackStack(null).commit()
                que1.isEnabled =false
                que2.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
            }
        }
        que2.setOnFocusChangeListener(onFocusChangeListener2)

        val onFocusChangeListener3 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame, Question1.newInstance(3)).addToBackStack(null).commit()
                que2.isEnabled =false
                que1.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
            }
        }
        que3.setOnFocusChangeListener(onFocusChangeListener3)

        val onFocusChangeListener4 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame, Question1.newInstance(4)).addToBackStack(null).commit()
                que2.isEnabled =false
                que3.isEnabled =false
                que1.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
            }
        }
        que4.setOnFocusChangeListener(onFocusChangeListener4)


        val onFocusChangeListener5 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame, Question1.newInstance(5)).addToBackStack(null).commit()
                que1.isEnabled =false
                que2.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
            }
        }
        que5.setOnFocusChangeListener(onFocusChangeListener5)
    }
}



