
package chap03.section1
//함수를 실행문 뒤에 선언하더라도 오류가 나지 않는다.
//파이썬과는 조금 다르다.
fun main(){
    val result1 =sum(a=3,b=2)
    val result2 = sum(a=6, b=7)
    println(result1)
    println(result2)
    printsum(7,7)
    abs(1,2,3,4)
}

fun sum(a:Int, b:Int): Int{
    val sum = a+b
    return sum
}
//fun sum(a:Int,b:Int) = a+b
//=fun sum(a:Int, b:Int): Int = a+b

//{}안에 있는 변수는 지역변수로 스택에 들어간다.
//자료형 변환이 없다면 unit
//main함수는 진입점이다.
//sum 함수의 위치는 상관없다.
// 스택메모리는 프로그램이 끝나면 pop으로 메모리 해제
//무한 반복으로 스택이 꽉차면 stackoverflow발생
//힙 메모리는 gc로 해제
// 참조가 제거되지 않아 힙 메모리 꽉차면 oom발생(out of memory)

fun printsum(a:Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

//매개변수, default 값 넣을 수 있다.
//(a: String="default")
//가변적인 매개변수 처리하기
fun abs(vararg counts:Int){
    for(num in counts){
        println("$num")
    }
    println("\n")
}
//정리
//함수는 프레임이라는 단위로 스택에 쌓인다.
//각각의 함수 인자, 매개변수는 참조되는 것이 아니라 복사해 넘어간다.
//가변인자 varargs
//스택오버플로우 oom 조심
//함수 매개변수의 기본값과 이름있는 매개변수