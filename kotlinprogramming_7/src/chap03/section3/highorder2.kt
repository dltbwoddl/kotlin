package chap03.section3.high2

fun main(){
    var result:Int//Error:(4, 5) Kotlin: Unresolved reference: result
    // 이 부분 없으면 오류 나옴. 선언과 할당 중 선언을 안했기 때문에
    result= hifu(::sum, 10, 20)
    println(result)
    val sum2=::sum
    println(sum2(10,30))
}
fun hifu(func:(Int,Int)->Int,a:Int,b:Int):Int{
    return func(a,b)
}
//return의 자료형을 선언하지 않으면 오류발생.

// 기존의 만들어진 함수, 함수 인자로 참조하기.
fun sum(a:Int,b:Int):Int=a+b
//이대로 hifu의 함수 인자로 넣으면 오류가 발생한다.
//이유는 람다식이 아니기 때문이다.
//::sum으로 넣어 람다식 형태로 넣는다.