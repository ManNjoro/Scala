object LastDigitChecker extends App{
  def hasSameLastDigit(num1: Int, num2: Int): Boolean = {
        num1 % 10 == num2 % 10
  }
  if (!args.isEmpty) println(s"${args(0)} and ${args(1)} have the last same digit? ${hasSameLastDigit(args(0).toInt, args(0).toInt)}")
}
