package chap03.section4


fun main(){
    val s="hello world"
    val t="kotlinkotlinkotlin"
    println(s.getls(t))
}
fun String.getls(t:String):String=
        if (this.length>t.length) this else t
//String에 getls라는 확장함수 추가해 사용한 것.