package chap02.section3
//구체적으로 명시되지 않은 자료형을 자동변환
//number는 숫자를 저장하기 위한 특수한 자료형으로 스마트 캐스트 됨.
fun main(){
    var test: Number =12.2
    println("$test")

    test=12
    println("$test")

    test=120L
    println("$test")

    test+=12.0f
    println("$test")
}