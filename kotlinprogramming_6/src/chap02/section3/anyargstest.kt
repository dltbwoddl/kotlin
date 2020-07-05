package chap02.section3

fun main(){
    checkArg(x="hello")
    checkArg(x=5)
}
fun checkArg(x:Any){
    if(x is String){
        println("x is string: $x")
    }
    if(x is Int){
        println("x is Int: $x")
    }
}
//x is string: hello
//x is Int: 5
//코틀린에서 기본적으로 사용하는 자료형은 null허용하지 않는다.
//null을 허용하기 위해서는 ?를 넣어준다.
//주의해야 할 것은 int와 ?int는 완전히 다른 자료형이다.
//int는 jvm상에서 기본형으로 바뀌지만 ?int는 참조형으로 남아있다.
//캐시 -128~127은 캐시에 저장된다. so === 실행시 다른 결과가 나올 수 있다.
//!!은 npe 주의 , ?.