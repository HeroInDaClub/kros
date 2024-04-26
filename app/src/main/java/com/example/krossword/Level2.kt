package com.example.krossword

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class Level2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level2)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.white)
            window.navigationBarColor = ContextCompat.getColor(this, R.color.white)

            // Изменение цвета иконки часов и других элементов статус бара на серый
            val windowFlags = window.decorView.systemUiVisibility
            window.decorView.systemUiVisibility = windowFlags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }


        val editText3 = findViewById<EditText>(R.id.editTextText3)
        val editText5 = findViewById<EditText>(R.id.editTextText5)
        val editText6 = findViewById<EditText>(R.id.editTextText6)
        val editText7 = findViewById<EditText>(R.id.editTextText7)
        val editText8 = findViewById<EditText>(R.id.editTextText8)
        val editText9 = findViewById<EditText>(R.id.editTextText9)
        val editText10 = findViewById<EditText>(R.id.editTextText10)
        val editText11 = findViewById<EditText>(R.id.editTextText11)
        val editText12 = findViewById<EditText>(R.id.editTextText12)
        val editText13 = findViewById<EditText>(R.id.editTextText13)
        val editText14 = findViewById<EditText>(R.id.editTextText14)
        val editText15 = findViewById<EditText>(R.id.editTextText15)
        val editText17 = findViewById<EditText>(R.id.editTextText17)
        val editText18 = findViewById<EditText>(R.id.editTextText18)
        val editText19 = findViewById<EditText>(R.id.editTextText19)
        val editText20 = findViewById<EditText>(R.id.editTextText20)
        val editText21 = findViewById<EditText>(R.id.editTextText21)
        val editText22 = findViewById<EditText>(R.id.editTextText22)
        val editText24 = findViewById<EditText>(R.id.editTextText24)
        val editText25 = findViewById<EditText>(R.id.editTextText25)
        val editText26 = findViewById<EditText>(R.id.editTextText26)
        val editText27 = findViewById<EditText>(R.id.editTextText27)
        val editText28 = findViewById<EditText>(R.id.editTextText28)
        val editText29 = findViewById<EditText>(R.id.editTextText29)
        val editText30 = findViewById<EditText>(R.id.editTextText30)
        val editText31 = findViewById<EditText>(R.id.editTextText31)
        val editText33 = findViewById<EditText>(R.id.editTextText33)
        val editText34 = findViewById<EditText>(R.id.editTextText34)
        val editText35 = findViewById<EditText>(R.id.editTextText35)
        val editText36 = findViewById<EditText>(R.id.editTextText36)
        val editText37 = findViewById<EditText>(R.id.editTextText37)
        val editText38 = findViewById<EditText>(R.id.editTextText38)
        val editText39 = findViewById<EditText>(R.id.editTextText39)







        val editTexts = arrayOf(
            editText3,
            editText5,
            editText6,
            editText7,
            editText8,
            editText9,
            editText10,
            editText11,
            editText12,
            editText13,
            editText14,
            editText15,
            editText17,
            editText18,
            editText19,
            editText20,
            editText21,
            editText22,
            editText24,
            editText25,
            editText26,
            editText27,
            editText28,
            editText29,
            editText30,
            editText31,
            editText33,
            editText34,
            editText35,
            editText36,
            editText37,
            editText38,
            editText39)
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.isEnabled =false
        }

        vvod()


    }

    fun showKeyboard(view: View) {
        val inputMethodManager = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
    }
    //функция скрытия клавы (как входной параметр можешь указать любой EditText вообще без разницы)
    fun hideKeyboard(view: View) {
        val inputMethodManager = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    var a = 0


    //это короче функция для перехода на след экран
    // типо считает верные ответы
    fun progress(){
        a+=1
        if(a==5){
            val lvl2But = findViewById<Button>(R.id.button)
            lvl2But.setOnClickListener {
                startActivity(Intent(this, Level2::class.java))
            }
        }
    }

    fun vvod(){
        val que1 = findViewById<EditText>(R.id.editTextText1)
        val que2 = findViewById<EditText>(R.id.editTextText2)
        val que3 = findViewById<EditText>(R.id.editTextText4)
        val que4 = findViewById<EditText>(R.id.editTextText16)
        val que5 = findViewById<EditText>(R.id.editTextText23)
        val que6 = findViewById<EditText>(R.id.editTextText32)
        val onFocusChangeListener1 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {

                supportFragmentManager.beginTransaction().replace(R.id.frame2, Question2.newInstance(1)).addToBackStack(null).commit()

                que1.isEnabled =false
                que2.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
                que6.isEnabled =false
            }
        }
        que1.setOnFocusChangeListener(onFocusChangeListener1)



        val onFocusChangeListener2 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame2, Question2.newInstance(2)).addToBackStack(null).commit()
                que1.isEnabled =false
                que2.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
                que6.isEnabled =false
            }
        }
        que2.setOnFocusChangeListener(onFocusChangeListener2)

        val onFocusChangeListener3 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame2, Question2.newInstance(3)).addToBackStack(null).commit()
                que2.isEnabled =false
                que1.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
                que6.isEnabled =false
            }
        }
        que3.setOnFocusChangeListener(onFocusChangeListener3)

        val onFocusChangeListener4 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame2, Question2.newInstance(4)).addToBackStack(null).commit()
                que2.isEnabled =false
                que3.isEnabled =false
                que1.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
                que6.isEnabled =false
            }
        }
        que4.setOnFocusChangeListener(onFocusChangeListener4)


        val onFocusChangeListener5 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                supportFragmentManager.beginTransaction().replace(R.id.frame2, Question2.newInstance(5)).addToBackStack(null).commit()
                que1.isEnabled =false
                que2.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
                que6.isEnabled =false
            }
        }
        que5.setOnFocusChangeListener(onFocusChangeListener5)

        val onFocusChangeListener6 = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {

                supportFragmentManager.beginTransaction().replace(R.id.frame2, Question2.newInstance(6)).addToBackStack(null).commit()

                que1.isEnabled =false
                que2.isEnabled =false
                que3.isEnabled =false
                que4.isEnabled =false
                que5.isEnabled =false
                que6.isEnabled =false
            }
        }
        que6.setOnFocusChangeListener(onFocusChangeListener6)
    }
    fun act(){
        val que1 = findViewById<EditText>(R.id.editTextText1)
        val que2 = findViewById<EditText>(R.id.editTextText2)
        val que3 = findViewById<EditText>(R.id.editTextText4)
        val que4 = findViewById<EditText>(R.id.editTextText16)
        val que5 = findViewById<EditText>(R.id.editTextText23)
        val que6 = findViewById<EditText>(R.id.editTextText32)
        que1.isEnabled =true
        que2.isEnabled =true
        que3.isEnabled =true
        que4.isEnabled =true
        que5.isEnabled =true
        que6.isEnabled =true
    }

    fun lastCounter(count:Int){
        var countTextView = findViewById<TextView>(R.id.count)
        val countText = countTextView.text.toString()
        var count = countText.toInt()
        countTextView.text = count.toString()
    }

    fun counter(a:Int, b:Int){
        var countTextView = findViewById<TextView>(R.id.count)
        val countText = countTextView.text.toString()
        var count = countText.toInt()

        if(b == 1){
            count+= a
            countTextView.text = count.toString()
        }else if(b == 2){
            count-= a
            countTextView.text = count.toString()
        }


    }

    fun firstAnsw(){
        val editText1 = findViewById<EditText>(R.id.editTextText1)
        val editText2 = findViewById<EditText>(R.id.editTextText3)
        val editText3 = findViewById<EditText>(R.id.editTextText12)
        val editText4 = findViewById<EditText>(R.id.editTextText14)
        val editText5 = findViewById<EditText>(R.id.editTextText17)
        val editText6 = findViewById<EditText>(R.id.editTextText26)
        val editText7 = findViewById<EditText>(R.id.editTextText29)
        val editText8 = findViewById<EditText>(R.id.editTextText29)
        val editTexts = arrayOf(
            editText1,
            editText2,
            editText3,
            editText4,
            editText5,
            editText6,
            editText7,
            editText8,)
        // Заполняем слово "адаптируемость"
        val word = "команда"
        var index = 0
        editTexts.forEach { editText ->
            if (index < word.length) {
                editText.setText(word[index].toString())
            } else {
                editText.setText("")
            }
            index++
        }
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.background = ContextCompat.getDrawable(this, R.drawable.true_input_bg)
        }
        hideKeyboard(editText1)
        counter(15,1)

    }
    //Функция отображения уже верного овета
    fun secondAnsw() {
        val editText1 = findViewById<EditText>(R.id.editTextText2)
        val editText2 = findViewById<EditText>(R.id.editTextText4)
        val editText3 = findViewById<EditText>(R.id.editTextText13)
        val editText4 = findViewById<EditText>(R.id.editTextText15)
        val editText5 = findViewById<EditText>(R.id.editTextText21)
        val editText6 = findViewById<EditText>(R.id.editTextText27)
        val editTexts = arrayOf(
            editText1,
            editText2,
            editText3,
            editText4,
            editText5,
            editText6)
        // Заполняем слово "адаптируемость"
        val word = "акцепт"
        var index = 0
        editTexts.forEach { editText ->
            if (index < word.length) {
                editText.setText(word[index].toString())
            } else {
                editText.setText("")
            }
            index++
        }
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.background = ContextCompat.getDrawable(this, R.drawable.true_input_bg)
        }
        hideKeyboard(editText1)
        counter(16,1)
    }
    //Функция отображения уже верного овета
    fun thirdAnsw() {
        val editText1 = findViewById<EditText>(R.id.editTextText16)
        val editText2 = findViewById<EditText>(R.id.editTextText17)
        val editText3 = findViewById<EditText>(R.id.editTextText18)
        val editText4 = findViewById<EditText>(R.id.editTextText19)
        val editText5 = findViewById<EditText>(R.id.editTextText20)
        val editText6 = findViewById<EditText>(R.id.editTextText21)
        val editText7 = findViewById<EditText>(R.id.editTextText22)
        val editText8 = findViewById<EditText>(R.id.editTextText23)
        val editText9 = findViewById<EditText>(R.id.editTextText24)
        val editText10 = findViewById<EditText>(R.id.editTextText25)
        val editTexts = arrayOf(
            editText1,
            editText2,
            editText3,
            editText4,
            editText5,
            editText6,
            editText7,
            editText8,
            editText9,
            editText10)
        // Заполняем слово "адаптируемость"
        val word = "энтерпрайз"
        var index = 0
        editTexts.forEach { editText ->
            if (index < word.length) {
                editText.setText(word[index].toString())
            } else {
                editText.setText("")
            }
            index++
        }
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.background = ContextCompat.getDrawable(this, R.drawable.true_input_bg)
        }
        hideKeyboard(editText1)
        counter(16, 1)
    }
    //Функция отображения уже верного овета
    fun fourthAnsw() {
        val editText1 = findViewById<EditText>(R.id.editTextText4)
        val editText2 = findViewById<EditText>(R.id.editTextText5)
        val editText3 = findViewById<EditText>(R.id.editTextText6)
        val editText4 = findViewById<EditText>(R.id.editTextText7)
        val editText5 = findViewById<EditText>(R.id.editTextText8)
        val editText6 = findViewById<EditText>(R.id.editTextText9)
        val editText7 = findViewById<EditText>(R.id.editTextText10)
        val editText8 = findViewById<EditText>(R.id.editTextText11)
        val editTexts = arrayOf(
            editText1,
            editText2,
            editText3,
            editText4,
            editText5,
            editText6,
            editText7,
            editText8)
        // Заполняем слово "адаптируемость"
        val word = "коллабор"
        var index = 0
        editTexts.forEach { editText ->
            if (index < word.length) {
                editText.setText(word[index].toString())
            } else {
                editText.setText("")
            }
            index++
        }
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.background = ContextCompat.getDrawable(this, R.drawable.true_input_bg)
        }
        hideKeyboard(editText1)
        counter(16,1)
    }
    //Функция отображения уже верного овета
    fun fiveAnsw() {
        val editText1 = findViewById<EditText>(R.id.editTextText23)
        val editText2 = findViewById<EditText>(R.id.editTextText28)
        val editText3 = findViewById<EditText>(R.id.editTextText30)
        val editText4 = findViewById<EditText>(R.id.editTextText31)
        val editText5 = findViewById<EditText>(R.id.editTextText33)
        val editText6 = findViewById<EditText>(R.id.editTextText39)

        val editTexts = arrayOf(
            editText1,
            editText2,
            editText3,
            editText4,
            editText5,
            editText6)
        // Заполняем слово "адаптируемость"
        val word = "анализ"
        var index = 0
        editTexts.forEach { editText ->
            if (index < word.length) {
                editText.setText(word[index].toString())
            } else {
                editText.setText("")
            }
            index++
        }
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.background = ContextCompat.getDrawable(this, R.drawable.true_input_bg)
        }
        hideKeyboard(editText1)
        counter(16,1)
    }

    fun sixAnsw() {
        val editText1 = findViewById<EditText>(R.id.editTextText32)
        val editText2 = findViewById<EditText>(R.id.editTextText33)
        val editText3 = findViewById<EditText>(R.id.editTextText34)
        val editText4 = findViewById<EditText>(R.id.editTextText35)
        val editText5 = findViewById<EditText>(R.id.editTextText36)
        val editText6 = findViewById<EditText>(R.id.editTextText37)
        val editText7 = findViewById<EditText>(R.id.editTextText38)

        val editTexts = arrayOf(
            editText1,
            editText2,
            editText3,
            editText4,
            editText5,
            editText6,
            editText7)
        // Заполняем слово "адаптируемость"
        val word = "финансы"
        var index = 0
        editTexts.forEach { editText ->
            if (index < word.length) {
                editText.setText(word[index].toString())
            } else {
                editText.setText("")
            }
            index++
        }
        for (i in editTexts.indices) {
            val editText = editTexts[i]
            editText.background = ContextCompat.getDrawable(this, R.drawable.true_input_bg)
        }
        hideKeyboard(editText1)
        counter(16,1)
    }
}