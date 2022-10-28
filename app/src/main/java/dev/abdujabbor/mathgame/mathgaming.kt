package dev.abdujabbor.mathgame

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_mathgaming.*
import kotlinx.android.synthetic.main.activity_sumactivity.*
import kotlinx.android.synthetic.main.activity_sumactivity.btn_submit
import kotlinx.android.synthetic.main.activity_sumactivity.edt_1
import java.util.*

class mathgaming : AppCompatActivity() {
    var number1 = 0
    var number2 = 0
    var amal = 0
    var javob = 0
    var userenteranswer = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mathgaming)
        random()
        btn_submit.setOnClickListener {
            userenteranswer = edt_1.text.toString().toInt()
           edt_1.text.clear()
            if (userenteranswer==javob){
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
            }
            random()
        }




        }





    private fun random(){

        number1 = Random().nextInt(100)
        number2 = Random().nextInt(100)
        amal = Random().nextInt(4)


        ekrangaCiqar()

    }




    private fun ekrangaCiqar() {
        when (amal) {
            0 -> {
                javob = number1 + number2
                txt_2.text = "$number1 + $number2 = ${Random().nextInt(100)}"
            }
            1 -> {
                if (number1<number2){
                random()
                    }
                else
                {
                javob = number1 - number2
                txt_2.text = "$number1 - $number2 = "
            }
            }
            2 -> {
                javob = number1*number2
                txt_2.text = "$number1* $number2 = "
            }
            3 -> {
                try {
                    javob = number1 / number2
                    if (number1 % number2 == 0) {
                        txt_2.text = "$number1 / $number2"
                    } else {
                        throw ArithmeticException()
                    }
                } catch (e: ArithmeticException) {
                    random()
                }

            }


        }

    }






}