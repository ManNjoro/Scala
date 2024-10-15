object Case extends App {
    def sum(m1:Int,m2:Int,m3:Int): Int={ m1+m2+m3}
    def grade(mark:Int): String={
        if( mark >= 70 )"A" else if( mark >= 60 )"B" else if( mark >= 50 )"C"else
        if( mark >= 40 )"D" else "F"
    }

    case class StMarks(name: String, gender: String, cat1: Int, cat2: Int, exam: Int)
    val stMarks = List(
    StMarks("Faith", "F", 9, 11, 33),
    StMarks("Joyce", "F", 5, 18, 35),
    StMarks("John", "M", 7, 8, 28),
    StMarks("Joseph", "M", 8, 12, 38),
    StMarks("Michael", "M", 6, 10, 32),
    StMarks("David", "M", 9, 9, 29),
    StMarks("Sarah", "F", 7, 11, 31),
    StMarks("Eve", "F", 8, 13, 34),
    StMarks("Paul", "M", 10, 15, 40),
    StMarks("Mary", "F", 6, 9, 30)
    )

    stMarks.foreach(m=>println(m.name+"\t"+sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt)+"\t"+grade(sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt))))

    val stMarksSet = Set(
    StMarks("Faith", "F", 9, 11, 33),
    StMarks("Joyce", "F", 5, 18, 35),
    StMarks("John", "M", 7, 8, 28),
    StMarks("Joseph", "M", 8, 12, 38),
    StMarks("Michael", "M", 6, 10, 32),
    StMarks("David", "M", 9, 9, 29),
    StMarks("Sarah", "F", 7, 11, 31),
    StMarks("Eve", "F", 8, 13, 34),
    StMarks("Paul", "M", 10, 15, 40),
    StMarks("Mary", "F", 6, 9, 30)
    )

    println("---Set of Students---")
    stMarksSet.foreach(m=>println(m.name+"\t"+sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt)+"\t"+grade(sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt))))

    val stMarksSeq = Seq(
    StMarks("Faith", "F", 9, 11, 33),
    StMarks("Joyce", "F", 5, 18, 35),
    StMarks("John", "M", 7, 8, 28),
    StMarks("Joseph", "M", 8, 12, 38),
    StMarks("Michael", "M", 6, 10, 32),
    StMarks("David", "M", 9, 9, 29),
    StMarks("Sarah", "F", 7, 11, 31),
    StMarks("Eve", "F", 8, 13, 34),
    StMarks("Paul", "M", 10, 15, 40),
    StMarks("Mary", "F", 6, 9, 30)
    )

    println("---Seq of Students---")
    stMarksSeq.foreach(m=>println(m.name+"\t"+sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt)+"\t"+grade(sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt))))

    val stMarksMap = Map(
    1 -> StMarks("Faith", "F", 9, 11, 33),
    2 -> StMarks("Joyce", "F", 5, 18, 35),
    3 -> StMarks("John", "M", 7, 8, 28),
    4 -> StMarks("Joseph", "M", 8, 12, 38),
    5 -> StMarks("Michael", "M", 6, 10, 32),
    6 -> StMarks("David", "M", 9, 9, 29),
    7 -> StMarks("Sarah", "F", 7, 11, 31),
    8 -> StMarks("Eve", "F", 8, 13, 34),
    9 -> StMarks("Paul", "M", 10, 15, 40),
    10 -> StMarks("Mary", "F", 6, 9, 30)
    )

    println("---Map of Students---")
    stMarksMap.values.foreach(m=>println(m.name+"\t"+sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt)+"\t"+grade(sum(m.cat1.toInt,m.cat2.toInt,m.exam.toInt))))

}