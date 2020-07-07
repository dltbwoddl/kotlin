package chap02.section4

fun main(){

    val number1 =12 //1100
    val number2 =25 //11001
    val result:Int

    result = number1 or number2//01100 or 11001
    println(result)//29 11101
}
//나머지 연산자 중요.
//비트연산자 --임베디드 시스템에서 사용.