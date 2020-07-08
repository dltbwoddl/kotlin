package chap03.section3.localreturn


//비지역 반환
fun main(){
    func(3){
        println("a:$it")
        return}
    func(5){ println("a:$it")}
}

inline fun func(a:Int, out:(Int)-> Unit){
    println("1")
    out(a)
    println("2")
}


