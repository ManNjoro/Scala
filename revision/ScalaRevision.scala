class Student(var firstName: String, var lastName: String){
    println("Starting...")
    override def toString():String = s"$firstName $lastName"
    def printDetails(): Unit = println(s"$firstName $lastName")
    println("Finishing...")
}

object ScalaRevision extends App{
    new Student("Eli", "Gachago").printDetails()
    
}