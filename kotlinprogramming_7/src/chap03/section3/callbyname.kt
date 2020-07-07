package chap03.section3

fun main(){
    val result = callbyname(ol)//()을 사용하면 값을 바로 호춣
    //하지만 이름만 사용했을 경우에는 람다식 자체가 이동
    //즉 이름 호출로 즉시 실행이 필요없는 코드를 작성할 수 있다.
    println(result)
}

fun callbyname(b:()->Boolean): Boolean{
    println(1)
    return b()// b에는 ol람다식이 그대로 오고 여기서 실행된다.
}
val ol:()->Boolean={
    println(2)
    true
}