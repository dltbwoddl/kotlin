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
    print("str1:$str1,num:$num")
    print("str1:$str1, length:${str1?.length}")
}
//str1:null,num:null str1:null, length:null