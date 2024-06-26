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
         val mainActivity = activity as MainActivity

        val button1 = view.findViewById<Button>(R.id.button3)
        val editText = view.findViewById<EditText>(R.id.editTextText68)
        editText.requestFocus()
        mainActivity.showKeyboard(editText)
        button1.setOnClickListener {
            val podskaz = view.findViewById<TextView>(R.id.podskaz)
            val help = view.findViewById<TextView>(R.id.podskazText)
            val answer = editText.text.toString().trim().toLowerCase()
            if (answer.isNotEmpty()) {
                help.text = ""
                when (arguments?.getInt("value")) {
                    1 -> {
                        if (answer == "адаптируемость") {
                            mainActivity.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            mainActivity.firstAnsw()
                            mainActivity.vvod()
                            mainActivity.act()
                            mainActivity.progress()
                        } else {

                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "А _ _ _ т _ _ у _ _ _ _ т _"
                                mainActivity.counter(5,2)
                            }
                        }
                    }
                    2 -> {
                        if (answer == "масштабируемость") {
                            mainActivity.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            mainActivity.secondAnsw()
                            mainActivity.vvod()
                            mainActivity.act()
                            mainActivity.progress()
                        } else {
                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "М а _ _ _ _ _ _ р _ _ _ _ _ _ ь"
                                mainActivity.counter(5,2)
                            }
                        }
                    }
                    3 -> {
                        if (answer == "распределенность") {
                            mainActivity.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            mainActivity.thirdAnsw()
                            mainActivity.vvod()
                            mainActivity.act()
                            mainActivity.progress()
                        } else {
                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "р _ _ _ _ е _ _ _ _ н _ _ _ т _"
                                mainActivity.counter(5,2)
                            }
                        }
                    }
                    4 -> {
                        if (answer == "репозитории") {
                            mainActivity.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            mainActivity.fourthAnsw()
                            mainActivity.vvod()
                            mainActivity.act()
                            mainActivity.progress()
                        } else {

                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "_ е _ _ _ _ т _ _ _ и"
                                mainActivity.counter(5,2)
                            }
                        }
                    }
                    5 -> {
                        if (answer == "интегрируемость") {
                            mainActivity.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            mainActivity.fiveAnsw()
                            mainActivity.vvod()
                            mainActivity.act()
                            mainActivity.progress()
                        } else {

                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "_ н _ _ _ р _ _ _ е _ _ _ т _"
                                mainActivity.counter(5,2)
                            }
                        }
                    }
                }
            } else {
                help.text = "Поле ответ ничего не содержит, умно))))"
            }

        }
        val button = view.findViewById<ImageView>(R.id.imageBut)
        button.setOnClickListener {
            mainActivity.vvod()
            mainActivity.act()
            parentFragmentManager.beginTransaction()
                .hide(this)
                .commit()
            mainActivity.hideKeyboard(editText)
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
