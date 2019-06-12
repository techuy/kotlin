abstract class animal
{
    abstract fun eat();
    fun drink()
    {
        println("Drink water")
    }
}

class Deer:animal()
{
    override fun eat()
    {
        println("eat veggg")
    }
}

class Lion : animal()
{
    override fun eat()
    {
        println("i eat meat")
    }
}

fun main(args: Array<String>)
{
    var deer = Deer()
    deer.eat()
    deer.drink()

    var lion = Lion()
    lion.eat()
    lion.drink()
}