import java.util.*

fun main(args:Array<String>)
{
//    var num:Int = 0
//    print("Enter a number between 2 to 31")
//    var inp =Scanner(System.`in`)
//    num = inp.nextInt()
//    when(num)
//    {
//        in 1..8-> println("Start of the month")
//        in 9..25-> println("middle of the month")
//        in 25..31 -> println("end of the month")
//
//        else ->{
//            println("Invalid number")}
//    }
//
//    print("\n Enter a name")
//    var name:String=inp.next()
//    when(name)
//    {
//        "Yuriko","Eko","Ichigo" -> {
//            println("Hello Japanese Student, Welcome to Cambodia")
//            println("Enjoy Kirirom")
//        }
//        "Vignesh","Dinesh","Leo"->{
//            println("Hello, you are from india.Welcome to Cambodia")
//            println("Enjoy Kirirom")
//        }
//        "TechUy","Visal","Songheng"->{
//            println("Hello, Kadom jok, Heang nov khmer srab hery")
//            println("Enjoy Kirirom")
//        }
//        else -> {
//            println("Who the F are you guys??")}
//    }
    var s:Int = Int.MAX_VALUE
//    for(i in s downTo 3 step 1000)
//        println(i)
//    for(i in 1..100 step 2)
//    {
//        println("$i")
//        if(item==35)
//        {
//            break
//        }
//    }
    var arr:Array<Int> = arrayOf(30,40,50,10)
    for(item in arr)
    {
        println("$item")

    }
    println("-----------")
    outer@ for(j in 1..5)
    {
        inner@ for(i in 10 downTo 1)
        {
            println(" $i")
            if(i==3)
            {
                break@outer
            }
            else if(i%2==0)
            {
                continue@inner
            }
            println("the value of i is neither 3 or even")
        }
        println("************ $j")

    }
}