package dev.abdujabbor.mathgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sumactivity.*
import java.util.Random

class sumactivity : AppCompatActivity() {
    var number1 = 0
    var number2 = 0
    var amal = 0
    var javob = 0
    var userenteranswer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumactivity)
random()
       btn_submit.setOnClickListener {
            userenteranswer = edt_1.text.toString().toInt()

            if (userenteranswer==javob){
                Toast.makeText(this, "True", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "False", Toast.LENGTH_SHORT).show()
            }
           random()
        }
    }





    fun random(){

        number1 = Random().nextInt(20)
        number2 = Random().nextInt(20)

        amal = Random().nextInt(4)

        ekrangaCiqar()

    }

    fun ekrangaCiqar() {
        when (amal) {
            0 -> {
                javob == number1 + number2
                txt_1.text == "$number1 + $number2 = "
            }
            1 -> {
                javob == number1 - number2
                txt_1.text == "$number1 - $number2 = "
            }
            2 -> {
                javob == number1 * number2
                txt_1.text == "$number1 * $number2 = "
            }
            3 -> {
                try {
                    javob = number1 / number2
                    if (number1 % number2 == 0) {
                        txt_1.text = "$number1 / $number2"
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



