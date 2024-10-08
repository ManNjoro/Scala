object RangeChecker extends App {

  def isEitherInRange1_100(num1: Int, num2: Int): Boolean =  (1 to 100).contains(num1) || (1 to 100).contains(num2)
  def isEitherInRange20_70(num1: Int, num2: Int, num3: Int): Boolean =  (20 to 70).contains(num1) || (20 to 70).contains(num2) || (20 to 70).contains(num3)

  val num1 = 400; val num2 = 122; val num3 = 75;
  println(s"Either $num1 or $num2 is in range of 1-100: ${isEitherInRange1_100(num1, num2)}")
  println(s"Either $num1 or $num2 or $num3 is in range of 20-70: ${isEitherInRange20_70(num1, num2, num3)}")

}