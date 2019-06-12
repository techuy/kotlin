fun main(args: Array<String>)
{
    var arr = Array<Int>(5){0}
    arr[0]=58
    arr[1]=123
    arr.set(2,12)
    arr.set(3,5)
    arr[4]=100

//    for(i in arr)
//    {
//        println(i)
//    }
    for(i in 0..(arr.size-1))
    {
        println(arr[i])
        println(arr.get(i))
    }
println("-----------------------------")
    val a1: Array<Int> = arrayOf(2,5,4,3)

    a1[0]=55
    a1[2]=54

    for (i in a1)
    {
        println(i)
    }
    println("=======================")
    var arr2 = IntArray(19)
    var arr3 = FloatArray(4)
    var arr4 = intArrayOf(2)
}