object Payee extends App{
    val getTaxPayable = (paye: Int) => {
        var tax: Double = 0;
        if (paye <= 20000) {
            tax = 0
        } else if (paye > 20000 && paye <=30000) {
            tax = paye * 0.1
        } else if (paye > 30000 && paye <= 40000) {
            tax = paye * 0.2
        } else if (paye > 40000 && paye <= 50000) {
            tax = paye * 0.3
        } else if (paye > 50000) {
            tax = paye * 0.4
        }
        tax
    }
    
    // if (args.isEmpty) {
    //     println("Usage: Payee <Paye Earnings>")
    //     System.exit(1)
    // }
    // println(f"Tax paid: ${getTaxPayable(args(0).toInt)}")

    def getIncomeAndTax(args: Array[String]) = {
        var i: Int = 0;
        while (i < args.length) {
            val gross = args(i).toInt
            val tax = getTaxPayable(gross)
            val netIncome = gross - tax
            println(s"Employee ${i+1} Gross Income: $gross, Tax Paid: $tax, Net Income: $netIncome")
            i += 1
        }
    }

    // if (args.length != 10) println("Please enter the income for 10 employees\nUsage: Payee <Taxable income Earnings>")
    // getIncomeAndTax(args)

    def getIncomeAndTaxRandom() = {
        var i = 0
        while (i < 10) {
            val gross = Math.ceil(Math.random() * 100000 + 3000)
            val tax = getTaxPayable(gross.toInt)
            val netIncome = gross - tax
            println(s"Employee ${i+1} Gross Income: $gross, Tax Paid: $tax, Net Income: $netIncome")
            i += 1
        }
    }
    // getIncomeAndTaxRandom()

    def getIncomeAndTaxForEach(args: Array[String]) = {
        var i: Int = 0;
        args.foreach(arg => {
            val gross = arg.toInt
            val tax = getTaxPayable(gross)
            val netIncome = gross - tax
            println(s"Employee ${i+1} Gross Income: $gross, Tax Paid: $tax, Net Income: $netIncome")
            i+=1
        })
    }

    // getIncomeAndTaxForEach(args)

    def checkMultiple(number: Int) = {
        if (number % 3 == 0) {
            println("Multiple of 3")
        } else if(number % 7 == 0) {
            println("Multiple of 7")
        } else if(number % 11 == 0) {
            println("Multiple of 11")
        } else println("Neither a multiple of 3, 7 nor 11 ")
    }
    // checkMultiple(33)

    def checkGender(name: Char) = if (name == 'M') println("Male") else println("Female")
    checkGender('F')

    // def checkRange(num1: Int, num2: Int) = if (num1. || num2)
}