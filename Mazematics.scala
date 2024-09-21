import scala.io.StdIn.readInt
object Mazematics {
    def main(args: Array[String]): Unit = {
        println("Hello")
        // rectangle()
        // triangle()
        // circle()
        // cylinder()
        squarePrism()
    }

    def rectangle() = {
        println("Enter the length:")
        val l = readInt() // Prompt user for length
        println("Enter the width:")
        val w = readInt()
        println(s"Area: ${l*w}\nPerimeter: ${2*(l+w)}")
    } 

    def triangle() = {
        println("Enter the length:")
        val l = readInt()
        val halfBase = (l/2)
        println(halfBase)
        val hypotenuseSq = Math.pow(l, 2)
        val halfBaseSq = Math.pow(halfBase, 2)
        println(s"hypotenuse square: $hypotenuseSq\nhalfBaseSq: $halfBaseSq")
        val res = hypotenuseSq - halfBaseSq
        println(s"res: $res")
        val h = Math.sqrt(res)
        println(s"height: $h")
        println(s"Area: ${halfBase*h}\nPerimeter: ${l*3}")
    }

    def circle() = {
        println("Enter the radius:")
        val r = readInt()
        val PI = 3.14
        val area = PI * Math.pow(r, 2)
        val perimeter = PI * 2 * r
        println(s"r: $r\npi: $PI\narea: $area\nPerimeter $perimeter")
    }
    def cylinder() = {
        println("Enter the radius:")
        val r = readInt()
        println("Enter the height:")
        val h = readInt()
        val PI = 3.142
        val xsarea = PI * Math.pow(r, 2)
        val rectarea = r*2 * h
        val totalSA = xsarea * 2 + rectarea
        val volume = PI * Math.pow(r, 2) * h
        val perimeter = PI * 2 * r
        println(s"r: $r\nh: $h\npi: $PI\nvolume: $volume\nxsarea: $xsarea\nrectarea: $rectarea\ntotalSA: $totalSA")
    }

    def squarePrism() = {
        println("Enter the length:")
        val l = readInt()
        val xsarea = l*l
        val totalSA = xsarea * 6
        val volume = xsarea * l
        println(s"l: $l\nvolume: $volume\nxsarea: $xsarea\ntotalSA: $totalSA")
    }
    
}