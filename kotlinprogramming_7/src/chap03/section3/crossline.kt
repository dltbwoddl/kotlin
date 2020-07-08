package chap03.section3.crossinline

fun main(){
    func(3){
        println("a:$it")
        }
    func(5){ println("a:$it")}
}

inline fun func(a:Int, crossinline out:(Int)-> Unit){
    println("1")
    nfunc { out(a)}
    println("2")
}
fun nfunc(body:()->Unit){
    body()
}
//비지역 반환 방지를 위한 crossline 사용.
//cross로 return 금지
//람다식 함수로 만들어진 이유는 function이라는 인터페이스로 만들어진 객체
//람다식 많이 만든다는 것은 객체 많이 만든다는 것,so 메모리 많이 잡아먹는다.
//inline을 통해 이런 문제를 어느정도 해결할 수 있다.