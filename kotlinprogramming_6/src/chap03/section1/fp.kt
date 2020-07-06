package chap03.section1

//순수함수: 같은 인자에 대해 항상 같은 값 반환
//함수 외부의 어떤 상태도 바꾸지 않는다.
//외부의 어떤 것을 사용하면 안된다.
// 입력과 내용을 분리하고 모듈화할 수 있다. 그래서 여러가지 함수들을 조합해도 부작용이 없다.
//테스트와 디버깅에 유리하다.

//람다식: 익명함수를 생성하기 위한 식으로 객체 지향 언어보다 함수지향 언어에 가깝다.
//{x,y->x+y}
//고차함수에서 사용

//일급 객체
//함수는 1급 객체
//인자로 전달 가능, 반환값에 사용가능, 변수에 담을 수 있다.

//고차함수
//함수내에 함수를 사용하는 것(람다식이 사용됨.)
fun main(){
    println(hfunc({x,y->x-y},10,20))
}
fun hfunc(sfun:(Int, Int)->Int,a:Int,b:Int):Int{
    return sfun(a,b)
}

//함수형 프로그래밍,
//모듈화가 쉽다. 디버깅, 테스트가 쉬움.
//간략한 표현식 사용-) 생산성 up
//람다식과 고차함수를 사용하여 함수를 조합하여 사용할 수 있다.

//함수형 프로그래밍은 순수함수를 조합해 상태 데이터 변경이나 부작용이
//없게 함수 형태의 하나인 람다식을 이용해 함수를 변수처럼 매개변수, 인자,
//반환값 등에 활용되는 고차 함수를 구성해 생산성이 높은 프로그래밍 방법.
