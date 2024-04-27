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

class Question2 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_question1, container, false)
        val textView = view.findViewById<TextView>(R.id.textView)
        val value = arguments?.getInt("value")
         if(value == 1){
            textView.text = "Группа людей, ответственных за проектирование, разработку и внедрение информационной системы, это"
        }else if(value == 2){
            textView.text = "Процесс тестирования и оценки информационной системы для обеспечения соответствия потребностям пользователей"
        }else if(value == 3){
            textView.text = "Вид программного обеспечения, автоматизирующий бизнес-процессы и рабочие потоки, такие как обработка заказов или управление запасами"
        }else if(value == 4){
            textView.text = "Вид информационной системы, поддерживающий коммуникацию и сотрудничество между отдельными лицами и группами"
        }else if(value == 5){
            textView.text = "Вид информационной системы, поддерживающий процессы принятия решений и предоставляющий инструменты анализа"
        }else if(value == 6){
            textView.text = "Вид информационной системы, поддерживающий автоматизацию финансовых транзакций и бухгалтерских процессов"
        }
        return view
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val lvl2 = activity as Level2

        val button1 = view.findViewById<Button>(R.id.button3)
        val editText = view.findViewById<EditText>(R.id.editTextText68)
        editText.requestFocus()
        lvl2.showKeyboard(editText)
        button1.setOnClickListener {
            val podskaz = view.findViewById<TextView>(R.id.podskaz)
            val help = view.findViewById<TextView>(R.id.podskazText)
            val answer = editText.text.toString().trim().toLowerCase()
            if (answer.isNotEmpty()) {
                help.text = ""
                when (arguments?.getInt("value")) {
                    1 -> {
                        if (answer == "команда") {
                            lvl2.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            lvl2.firstAnsw()
                            lvl2.vvod()
                            lvl2.act()
                            lvl2.progress()
                        } else {

                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "А _ _ _ т _ _ у _ _ _ _ т _"
                                lvl2.counter(5,2)
                            }
                        }
                    }
                    2 -> {
                        if (answer == "акцепт") {
                            lvl2.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            lvl2.secondAnsw()
                            lvl2.vvod()
                            lvl2.act()
                            lvl2.progress()
                        } else {
                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "М а _ _ _ _ _ _ р _ _ _ _ _ _ ь"
                                lvl2.counter(5,2)
                            }
                        }
                    }
                    3 -> {
                        if (answer == "энтерпрайз") {
                            lvl2.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            lvl2.thirdAnsw()
                            lvl2.vvod()
                            lvl2.act()
                            lvl2.progress()
                        } else {
                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "р _ _ _ _ е _ _ _ _ н _ _ _ т _"
                                lvl2.counter(5,2)
                            }
                        }
                    }
                    4 -> {
                        if (answer == "коллабор") {
                            lvl2.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            lvl2.fourthAnsw()
                            lvl2.vvod()
                            lvl2.act()
                            lvl2.progress()
                        } else {

                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "_ е _ _ _ _ т _ _ _ и"
                                lvl2.counter(5,2)
                            }
                        }
                    }
                    5 -> {
                        if (answer == "анализ") {
                            lvl2.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            lvl2.fiveAnsw()
                            lvl2.vvod()
                            lvl2.act()
                            lvl2.progress()
                        } else {

                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "_ н _ _ _ р _ _ _ е _ _ _ т _"
                                lvl2.counter(5,2)
                            }
                        }
                    }
                    6 -> {
                        if (answer == "финансы") {
                            lvl2.vvod()
                            parentFragmentManager.beginTransaction()
                                .hide(this)
                                .commit()
                            lvl2.sixAnsw()
                            lvl2.vvod()
                            lvl2.act()
                            lvl2.progress()
                        } else {

                            podskaz.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            podskaz.setOnClickListener {
                                help.text = "_ н _ _ _ р _ _ _ е _ _ _ т _"
                                lvl2.counter(5,2)
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
            lvl2.vvod()
            lvl2.act()
            parentFragmentManager.beginTransaction()
                .hide(this)
                .commit()
            lvl2.hideKeyboard(editText)
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
