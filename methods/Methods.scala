object Methods extends App {
    val lst = List(1, 2, 3, 4, 5)
    // val res = lst.reduceLeft(_+_)
    val res = lst.reduceLeft((x,y)=> {x+y})
    val res2 = lst.map((x) => x*2)
    val res3 = lst.filter((x) => x>2)
    println(res)
    println(res2)
    println(res3)

}