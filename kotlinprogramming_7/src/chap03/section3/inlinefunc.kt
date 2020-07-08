package chap03.section3

fun main(){
    func(3){ println("a:$it")}
    func(5){ println("a:$it")}
}

inline fun func(a:Int, noinline out:(Int)-> Unit){
    println("1")
    out(a)
    println("2")
}
//인라인 함수는 코드를 직접 불러와 쓰는 함수
//함수의 분기가 없기 때문에 성능이 좋아진다.
//내용이 많거나 많이 사용되는 함수의 경우 인라인할 경우 코드의 양이 방대해 질 수 있다.
//일부 람다식 함수를 인라인 하지 않기 위해, noinline 키워드 사용해야 한다.

