package chap03.section4

//자기 자신을 다시 참조
// 무한 호출에 빠지지 않도록 탈출 조건 만들기.
//스택 영역을 이용하므로 호출 수를 무리하게 많이 지정하면 스택오버플로우 발생 가능
//꼬리 재귀함수 tailrec 스택에 계속 쌓이는 방식이 함수가 계속 씌워지는 꼬리를 무는 형태
 fun main(){
    val number = 10
    println("factorial:$number->${factorial(number)}")
}
tailrec fun factorial(n:Int, run:Int=1):Long{
    return if(n==1) run.toLong() else factorial(n-1,run*n)
}
//스택오버플로우가 발생하지 않는다.
//루프문이 된다.

//익명함수:람다식에서는 return, continue,break 쓰기 어렵다. so 사용하기 더 편하다.
//인라인함수: 분기를 줄여 기능 향상, 코드 너무 무거워 질 수 있다. 비지역반환 주의(crossline으로 극복가능)
//확장함수: 클래스에 함수 추가해서 사용가능
//중위함수: 함수 사용을 직관적으로 가능하도록 한다.
//꼬리물기재귀함수: 스택 쌓이는 것을 방지하고 루프를 만들어 계산위주로 처리한다.