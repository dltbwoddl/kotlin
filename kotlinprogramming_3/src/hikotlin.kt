import com.example.edu.person as user
fun main(){
    println("hello kotlin!")

    val persons = user(name = "lim", age = 20)

    val person2 = person(no= 123,name = "lim",jobtitle = "programmer")

    println(persons)
    println(persons.name)
    println(persons.age)
}



class person(val no:Int, val name: String ,val jobtitle: String)
