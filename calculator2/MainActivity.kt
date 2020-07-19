package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//고생하셨습니다
//우선 코드 컨벤션을 구글링하셔서 코드를 깔끔히 작성하는 규칙에대한 글을 읽어보시면 도움이 될것입니다.

//1 + - 버튼을 누르면 앱이 종료되는 문제
//즉, 연산자를 연속으로 2번 누르면 생기는 문제
//0/1 의 문제

//추후에 코드컨벤션을 적용하여 깔끔한 형태 및 버그 수정 및 +/-, %, . 추가 기능을 구현한다면
//자신에게 자산이 될것입니다.

//다른 사람코드 만지기.

//전체 피드백 : btnlistener만들기.
//계산기에 대한 이해를 확실히 하고 만들기.
//함수내에서 전역변수 바꾸는 것은 바람직하지 않다.
//그림으로 흐름만들어서 논리흐름 따라가본다.


//percent부분 수정하기 오류 많다.
class MainActivity : AppCompatActivity() {
    //0~9 버튼 함수
    var n: String = "0"
    var p: String = ""
    var b: Boolean = true
    fun numbutton(i: String) {
        if (n == "0") {
            if (i == ".") {
                n += i
                num.text = n
            } else {
                n = ""
                n += i
                num.text = n
            }
        } else {
            n += i
            num.text = n
        }
    }

    var sum: Double = 0.0
    var summd: Double = 1.0
    var operators: String = ""

    //+버튼 함수
    fun plus() {
        if (n == "") {
            when (operators) {
                "%" -> {
                    sum = p.toDouble()
                    operators = "+"
                }
                "/" -> {
                    ac()
                    num.text = "+/는 올바른 연산자가 아닙니다."
                }
                "=" -> {
                    operators = "+"
                }
            }
        } else {
            when (operators) {
                "" -> {
                    num.text = n
                    sum += n.toDouble()
                    n = ""
                }
                "+" -> {
                    sum += n.toDouble()
                    num.text = sum.toString()
                    n = ""
                }
                "*" -> {
                    mul()
                    sum += summd
                    num.text = sum.toString()
                    summd = 1.0
                }
                "/" -> {
                    div()
                    sum += summd
                    num.text = sum.toString()
                    summd = 1.0
                }
            }
            operators = "+"
        }

    }

    //-버튼 함수
    fun minus() {
        if (n == "") {
            when (operators) {
                "%" -> {
                    sum = p.toDouble()
                    operators = "-"
                }
                "+" -> operators = "-"
                "-" -> operators = "+"
                "*" -> {
                    operators = "*"
                    summd = -summd
                }
                "/" -> {
                    operators = "/"
                    summd = -summd
                }
                "=" -> {
                    operators = "-"
                }
            }
        } else {
            when (operators) {
                "" -> {
                    num.text = n
                    sum += n.toDouble()
                    n = ""
                }
                "+" -> {
                    sum += n.toDouble()
                    num.text = sum.toString()
                    n = ""
                }
                "-" -> {
                    sum -= n.toDouble()
                    num.text = sum.toString()
                    n = ""
                }
                "*" -> {
                    mul()
                    sum += summd
                    num.text = sum.toString()
                    summd = 1.0
                }
                "/" -> {
                    div()
                    sum += summd
                    num.text = sum.toString()
                    summd = 1.0
                }
            }
            operators = "-"
        }

    }

    //*버튼 함수
    fun mul() {
        if (n == "") {
            when (operators) {
                "%" -> {
                    summd = p.toDouble()
                    operators = "*"
                }
                "+" -> {
                    ac()
                    num.text = "+*는 올바른 연산자가 아닙니다."
                }
                "-" -> {
                    ac()
                    num.text = "-*은 올바른 연산자가 아닙니다."
                }
                "*" -> {
                    ac()
                    num.text = "/*은 올바른 연산자가 아닙니다."
                }
                "/" -> {
                    ac()
                    num.text = "/*은 올바른 연산자가 아닙니다."
                }
                "=" -> {
                    summd = sum
                    sum = 0.0
                    operators = "*"
                }
            }
        } else {
            when (operators) {
                "" -> {
                    num.text = n
                    summd = n.toDouble()
                    n = ""
                }
                "*" -> {
                    summd *= n.toDouble()
                    num.text = (summd + sum).toString()
                    n = ""
                }
                "/" -> {
                    summd /= n.toDouble()
                    num.text = (summd + sum).toString()
                    n = ""
                }
                "+" -> {
                    summd *= n.toDouble()
                    n = ""
                }
                "-" -> {
                    summd *= -n.toDouble()
                    n = ""
                }
                "=" -> {
                    summd = sum
                    sum = 0.0
                }
            }
        }
        operators = "*"
    }

    //버튼 / 함수
    fun div() {
        if (n == "") {
            when (operators) {
                "%" -> {
                    summd = p.toDouble()
                    operators = "/"
                }
                "*" -> {
                    ac()
                    num.text = "*/은 올바른 연산자가 아닙니다."
                }
                "/" -> {
                    ac()
                    num.text = "//은 올바른 연산자가 아닙니다."
                }
                "=" -> {
                    summd = sum
                    sum = 0.0
                    operators = "/"
                }
            }
        } else {
            when (operators) {
                "" -> {
                    num.text = n
                    summd = n.toDouble()
                    n = ""
                }
                "/" -> {
                    summd /= n.toDouble()
                    num.text = (summd + sum).toString()
                    n = ""
                }
                "*" -> {
                    summd *= n.toDouble()
                    num.text = (summd + sum).toString()
                    n = ""
                }
                "+" -> {
                    summd *= n.toDouble()
                    n = ""
                }
                "-" -> {
                    summd *= -n.toDouble()
                    n = ""
                }
                "=" -> {
                    summd = sum
                    sum = 0.0
                }
            }
        }
        operators = "/"
    }
    //10*10%=이거 제대로 나오도록 하기.
    fun percent() {
        if (operators == "=") {
            p = (sum / 100).toString()
            num.text = p
            operators = "%"
            n = ""
        } else if(operators=="*"){
            n=(n.toDouble()/100).toString()
            mul()
        }
             else {
            p = (n.toDouble() / 100).toString()
            num.text = p
            operators = "%"
            n = ""
        }
    }

    //=버튼
    fun oequal() {
        when (operators) {
            "+" -> plus()
            "-" -> minus()
            "*" -> {
                mul()
                sum += summd
                num.text = sum.toString()
            }
            "/" -> {
                div()
                sum += summd
                num.text = sum.toString()
            }
        }
        summd = 1.0
        operators = "="
    }

    fun ac() {
        sum = 0.0
        summd = 1.0
        n = "0"
        operators = ""
        num.text = n
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button0.setOnClickListener {
            if (n == "0") {
            } else {
                numbutton("0")
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
        buttondot.setOnClickListener {
            if ("." in n) {
            } else {
                numbutton(".")
            }
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
            oequal()
        }
        //ac버튼
        buttonac.setOnClickListener {
            ac()
        }
        buttonper.setOnClickListener {
            percent()
        }
        buttonpm.setOnClickListener {
            if (b) {
                plus()
                b = false
            } else {
                minus()
                b = true
            }
        }

    }
}