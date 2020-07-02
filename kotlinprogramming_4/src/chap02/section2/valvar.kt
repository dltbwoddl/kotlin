package chap02.section2
//val과 var는 변수의 시작을 알리면서 변수가 불변(immutable type)인지 가변(mutable type)인지를 나타냅니다.
fun main(){
    val number:Int =10
    val number2 =20
    var language = "English"

    language = "korean"
    println("number: $number, number2:$number2")
    println("language: $language")
}

//npe(null point exception)

//var name1:String = null
//Error:(15, 20) Kotlin: Null can not be a value of a non-null type String
var name2:String? =null

