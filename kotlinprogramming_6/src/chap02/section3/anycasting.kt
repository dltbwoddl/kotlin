package chap02.section3
//any는 어떤 것이든 될 수있는 자료형, 묵시적 변환, 스마트캐스트.
//fun main(){
//    var a: String="asdf"
//    a=20L
//    println("a:$a type: ${a.javaClass}")
//
//}
//Error:(5, 7) Kotlin: The integer literal does not conform to the expected type String
fun main(){
    var a: Any="asdf"
    a=20L
    println("a:$a type: ${a.javaClass}")

}
//a:20 type: long