package chap02.section3
//fun main_1(){
//    var str1 : String ="hi"
//    str1=null
//    print("str1:$str1")
//}
//Error:(5, 10) Kotlin: Null can not be a value of a non-null type String

//fun main_2(){
//    var str1 : String? ="hi"
//    var num:Int?=null
//    str1=null
//    print("str1:$str1,num:$num")
//}
//str1:null,num:null

//fun main_3(){
//    var str1 : String? ="hi"
//    var num:Int?=null
//    str1=null
//    print("str1:$str1,num:$num")
//    print("str1:$str1, length:${str1.length}")
//}
//Error:(20, 37) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

fun main(){
    var str1 : String? ="hi"
    var num:Int?=null
    str1=null
    print("str1:$str1,num:$num /")
    print("str1:$str1, length:${str1?.length?:-1} /")
    val len= if(str1 !=null)str1.length else -1// ==str1?.length ?:-1 엘비스 연산자
    println("str1: $str1, length: ${len}")
}
//str1:null,num:null str1:null, length:null

//npe:사용할 수 없는 null인 변수에 접근하면서 발생하는 예외
// ?= null일 경우 여기서 끝 아니면 실행, !! =non null-npe발생 가능. so 실제 프로젝트에서 많이 쓰지 않는 것이 좋다.
//
