import java.util.*

fun main(a: Array<String>)
{
    var intVar:Int = 255
    var longVar:Long
    var byteNum:Byte

    longVar = intVar.toLong()
    byteNum = intVar.toByte()
    println(byteNum)
    println(longVar)

    println("ENter name age and salary")
    val scan = Scanner(System.`in`)
    val name = scan.next() // a string with no space
    val age = scan.nextInt() // get integer
    //val desc = scan.nextLine() // get input until "enter" key is clicked
    val salary = scan.nextFloat() // get float
    println(name + " "+age + " "+salary)

    println("enter 3 numbers  ::")
    var num1 = scan.nextInt()
    var num2 = scan.nextInt()
    var num3 = scan.nextInt()

    var res = if(num1>num2)
    {
        var max = if(num1>num3)
        {
            num1
        }
        else
        {
            num3
        }
        println("in if block $max")
    }
    else
    {
        var max = if(num2>num3)
        {
            num2
        }
        else
        {
            num3
        }

    }
    println(" largest number $res")
}
