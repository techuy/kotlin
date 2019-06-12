import java.util.Scanner;
fun main(arge:Array<String>)
{
    val st = StudentTest()
    val scan = Scanner(System.`in`)
    println("enter id,name,age")
    st.id =10
    st.name="Uy"
    st.age=15
    println("Name : ${st.name} Age: ${st.age} ID ${st.id}" )
}
class StudentTest
{
    var id=0
    var name =""
    var age = 0
}