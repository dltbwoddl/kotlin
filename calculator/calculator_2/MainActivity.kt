package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

//화면에 나오는 부분 /,*부분 위주로 다시 만들어보기.
//주석달기.
//숫자가 아래 나오도록 바꾸기.
class MainActivity : AppCompatActivity() {
    var n: String = ""
    fun oequal2(){
        when (operators){
            "+"->plus()
            "-"->minus()
            "*"->{mul()
                sum+=summd
                num.text=sum.toString()}
            "/"->{div()
                sum+=summd
                num.text=sum.toString()}
        }
        summd=1.0
        operators="="
    }
    fun numbutton(i: String){
        n+=i
        num.text=n
    }

    var sum:Double=0.0
    var summd:Double=1.0
    var operators:String=""

    fun plus(){
        when(operators){
            ""->{num.text=n
                sum+=n.toDouble()
                n=""}
            "+"->{sum += n.toDouble()
                num.text = sum.toString()
                n = ""}
            "*"->{mul()
                sum+=summd
                num.text=sum.toString()
                summd=1.0}
            "/"->{div()
                sum+=summd
                num.text=sum.toString()
                summd=1.0}
        }
        operators ="+"
    }

    fun minus(){
        when(operators){
            ""->{num.text=n
                sum+=n.toDouble()
                n=""}
            "+"->{sum += n.toDouble()
                num.text = sum.toString()
                n=""
            }
            "-"->{sum -= n.toDouble()
                num.text = sum.toString()
                n = ""}
            "*"->{mul()
                sum+=summd
                num.text=sum.toString()
                summd=1.0}
            "/"->{div()
                sum+=summd
                num.text=sum.toString()
                summd=1.0}
        }
        operators ="-"
    }

    fun mul(){
        when(operators){
            ""->{num.text=n
                summd=n.toDouble()
                n=""}
            "*"->{summd *= n.toDouble()
                num.text = (summd+sum).toString()
                n = ""}
            "/"->{summd /= n.toDouble()
                num.text = (summd+sum).toString()
                n = ""}
            "+"->{summd*=n.toDouble()
                n = ""}
            "-"-> {summd*=-n.toDouble()
                n = ""}
            "="->{summd=sum
                  sum=0.0}
        }
        operators ="*"
    }

    fun div(){
        when(operators) {
            "" -> {num.text = n
                summd = n.toDouble()
                n = ""}
            "/" -> {summd /= n.toDouble()
                num.text = (summd+sum).toString()
                n = ""}
            "*"->{summd *= n.toDouble()
                num.text = (summd+sum).toString()
                n = "" }
            "+" -> {summd *= n.toDouble()
                n = ""}
            "-" -> {summd *= -n.toDouble()
                n = ""}
            "="->{summd=sum
                  sum=0.0}
        }
        operators="/"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener {
            if (n.isNotEmpty()) {
                if(n[0].equals("0")) {

                }
                else{
                    numbutton("0")

                }
            }
        }
        button1.setOnClickListener {
            numbutton("1")
        }
        button2.setOnClickListener {
            numbutton("2")
        }
        button3.setOnClickListener {
            numbutton("3")
        }
        button4.setOnClickListener {
            numbutton("4")
        }
        button5.setOnClickListener {
            numbutton("5")
        }
        button6.setOnClickListener {
            numbutton("6")
        }
        button7.setOnClickListener {
            numbutton("7")
        }
        button8.setOnClickListener {
            numbutton("8")
        }
        button9.setOnClickListener {
            numbutton("9")
        }
        buttonp.setOnClickListener {
            plus()
            }
        buttonm.setOnClickListener {
            minus()
        }
        buttonmul.setOnClickListener {
            mul()
        }
        buttondiv.setOnClickListener {
            div()
        }
        //=버튼
        buttone.setOnClickListener {
            oequal2()
            }
        //ac버튼
        buttonac.setOnClickListener {
            sum=0.0
            summd=1.0
            n=""
            operators=""
            num.text=""
            }

        }
    }