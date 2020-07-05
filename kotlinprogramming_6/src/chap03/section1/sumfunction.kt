
package chap03.section1
//함수를 실행문 뒤에 선언하더라도 오류가 나지 않는다.
//파이썬과는 조금 다르다.
fun main(){
    val result1 =sum(a=3,b=2)
    val result2 = sum(a=6, b=7)
    println(result1)
    println(result2)
}

fun sum(a:Int, b:Int): Int{
    var sum = a+b
    return sum
}
//=fun sum(a:Int, b:Int): Int = a+b