package chap02.section4
//비트연산자 inv는 반전 shl은 왼쪽으로 땡기기 *
//shr은 오른쪽으로 땡기기 /
fun main(){
    var x = 4//100
    var y = 0b000_1010 //1010
    var z = 0x0F //1111

    println("x.shl 2->${x shl 2}")//x=10000
    println("x.inv->${x.inv()}")
    println("y.inv->${y.inv()}")

    println("y shr 2-> ${y/4}, ${y shr 2}")
    println("x shl 4-> ${x*16}, ${x shl 4}")
    println("z shl 2-> ${z*16}, ${z shl 4}")

    x=64
    println("x shr 4 -> ${x/4}, ${x shr 2}")
}