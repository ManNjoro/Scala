object SumOfAnyInt {
    def main(args: Array[String]): Unit = {
        val sum: Int = sumOfInt(args)
        println(s"Sum of all integer arguments: $sum")
    }

    def sumOfInt(args: Array[String]): Int = {
        var sum: Int = 0; var i: Int = 0;
        for(arg <- args) {
            try {
                val num: Int = arg.toInt
                sum += num
                i += 1
            } catch {
                case _ => println(s"Invalid input: $arg")
            }
        }
        return sum
    }
}