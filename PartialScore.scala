object PartialScore{
    def main(args: Array[String]): Unit = {
        
        val scoreCard = printScore("1045994", "Doe",_:String);
        scoreCard("Apache Spark")
        scoreCard("Python for Data Science")
        scoreCard("Introduction to Data Science")
        scoreCard("OOP 1")
        scoreCard("OOP 2")
        scoreCard("Integral Calculus")
        scoreCard("Differential Calculus")
        scoreCard("Database systems")
    }

    def printScore(stNum: String, stName: String,unitName: String) = {
        val cat1: Int = Math.ceil(Math.random() * 10).toInt
        val cat2: Int = Math.ceil(Math.random() * 20).toInt
        val exam: Int = Math.ceil(Math.random() * 70).toInt
        val score: Int = cat1 + cat2 + exam;
        println(s"$stNum\t$stName\t$unitName\t$cat1\t$cat2\t$exam\t${grade(score)}")


        def grade(score: Int): Char = {
            if(score >= 70 && score <= 100){
                return 'A'
            } else if(score >= 60 && score < 70){
                return 'B'
            } else if(score >= 50 && score < 60){
                return 'C'
            } else if(score >= 40 && score < 50){
                return 'D'
            } else 'F'

        }
    }
}