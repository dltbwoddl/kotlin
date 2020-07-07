package chap03.section3.funarg
//같은 패키지에 같은 이름의 함수 있으면 경고창 뜸 그럴 때는 패키지 이름을 조금 수정하면된다.

fun sum(a:Int, b:Int)=a+b

fun mul(a:Int, b:Int)=a*b

fun main(){
    val result =sum(10,3)
    val result2=mul(sum(3,3),2)
    println("$result, $result2")
    //println(result, result2)는 오류
    println(funcfun())
}
fun funcfun():Int{
    return sum(2,2)
}