package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

//함수 이용해서 계산기 만들기.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
         *레이아웃 - 화면의 요소 및 위젯의 배치 및 정렬기준을 잡아주는 컨테이너
         *
         *(5,4)테이블 레이아웃(보이지 않는다.)
         *
         * stretcjcolums - 테이블 레이아웃의 해당 열이 테이블 레이아웃의 크기가 꽉차게 설정된다.
         *
         * layoutspan - 합치고자 하는 셀의 개수 지정
         *
         *  */
        //07.14 +부분 화면에 나오는 것 제대로 수정하기.
//수정할 것 /,*    10 + 20 / (0.5->숫자입력), 10+20*(200.0->숫자입력하는 것)
        //현재 연산자들은 연산자나열에는 제대로 나온다. 하지만 *,/와 -+같이 쓰면 다른 값이나온다.이것 수정하고 디자인 수정하기.
        var n: String = ""
        fun numbutton(i: String){
            n+=i
            num.text=n
        }
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
        //+/-/*/div/= 버튼
        var sum:Double=0.0
        //var bsum:Double
        var operators:String=""


        fun plus(){
            if (sum==0.0) {
                num.text=n
                sum+=n.toDouble()
                n=""
            }
            else {
                sum += n.toDouble()
                num.text = sum.toString()
                n = ""
            }
            operators ="+"
        }

        fun minus(){
            if (sum==0.0) {
                num.text=n
                sum+=n.toDouble()
                n=""
            }
            else {
                sum -= n.toDouble()
                num.text = sum.toString()
                n = ""
            }
            operators ="-"
        }

        fun mul(){
            if (sum==0.0) {
                num.text=n
                sum+=n.toDouble()
                n=""
            }
            else {
                sum *= n.toDouble()
                num.text = sum.toString()
                n = ""
            }
            operators ="*"
        }

        fun div(){
            if (sum==0.0) {
                num.text=n
                sum+=n.toDouble()
                n=""
            }
            else {
                sum /= n.toDouble()
                num.text = sum.toString()
                n = ""
            }
            operators="/"
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
        fun oequl(){
            when (operators){
                "+"->plus()
                "-"->minus()
                "*"->mul()
                "/"->div()
            }
            sum=0.0
        }
        buttone.setOnClickListener {
            oequl()
            }
        //ac버튼
        buttonac.setOnClickListener {
            sum=0.0
            n=""
            operators=""
            num.text=""
            }

        }
    }

