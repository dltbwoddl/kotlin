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

//val add:(Int,Int)->Int=fun(a,b)=a+b
//val result =add(10,2)
//println(result)
//익명함수를 사용하는 이유는 return, break, continue등이 사용가능하기 때문이다.
//람다식에서는 사용이 어렵다.

// 인라인 함수, 함수가 호출괴는 곳에 내용을 모두 복사
//함수의 분기 없이 처리-)성능 증가.
// inline fun.....
//함수를 많이 불러오는 경우 코드의 사이즈가 커질 수 있다.