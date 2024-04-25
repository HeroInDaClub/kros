package com.example.krossword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager

class Question1 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_question1, container, false)
        val textView = view.findViewById<TextView>(R.id.textView)
        val value = arguments?.getInt("value")
        if (value == 1) {
            textView.text = "Какая система настраивается в соответствии с требованиями заказчика и на особенности информационного поля заказчика?"
        }else if(value == 2){
            textView.text = "Какая система может выполняться в виде каркаса, содержащего базовые модули, и дополняться в соответствии с требованиями изменяющейся внешней и внутренней среды?"
        }else if(value == 3){
            textView.text = "Какая система может эффективно функционировать в территориально удаленных подразделениях и филиалах предприятия?"
        }else if(value == 4){
            textView.text = "Какое хранилище информации, связанной с проектом разработки программного продукта в течение всего его жизненного цикла?"
        }else if(value == 5){
            textView.text = "Что обеспечивает полноту данных?"
        }
        return view
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<ImageView>(R.id.imageBut)
        button.setOnClickListener {
            val mainActivity = activity as MainActivity
            mainActivity.act()
            mainActivity.vvod()
         //закрытие фрагмента
        }

        val button1 = view.findViewById<Button>(R.id.button3)
        val editText = view.findViewById<EditText>(R.id.editTextText68)
        editText.requestFocus()
        button1.setOnClickListener {
            val answer = editText.text.toString().trim().toLowerCase()
            var correct = false
            when (arguments?.getInt("value")) {
                1 -> correct = answer == "адаптируемость"
                2 -> correct = answer == "масштабируемость"
                3 -> correct = answer == "распределенность"
                4 -> correct = answer == "репозитории"
                5 -> correct = answer == "интегрируемость"
            }
            if (correct) {
                editText.background = ContextCompat.getDrawable(requireContext(), R.drawable.true_input_bg)

            } else {
                val podskaz = view.findViewById<TextView>(R.id.podskaz)
                podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
            }
        }
    }


    companion object {
        fun newInstance(value: Int): Question1 {
            val fragment = Question1()
            val args = Bundle()
            args.putInt("value", value)
            fragment.arguments = args
            return fragment
        }
    }

}
