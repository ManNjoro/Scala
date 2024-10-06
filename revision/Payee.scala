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
    
    if (args.isEmpty) {
        println("Usage: Payee <Paye Earnings>")
        System.exit(1)
    }
    // println(f"Tax paid: ${getTaxPayable(args(0).toInt)}")

    def getIncomeAndTax(args: Array[String]) = {
        var i: Int = 0;
        while (i < args.length) {
            val gross = args(i).toInt
            val tax = getTaxPayable(args(i).toInt)
            val netIncome = gross - tax
            println(s"Employee ${i+1} Gross Income: $gross, Tax Paid: $tax, Net Income: $netIncome")
            i += 1
        }
    }

    getIncomeAndTax(args)
}