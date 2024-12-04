import java.io.{File, PrintWriter}
import scala.io.Source

object Write extends App {
    val writer = new PrintWriter(new File("Write.txt"))
    writer.write("Hello Developer\n")
    writer.write("Did you code today?\n")
    writer.write("Ama You decided to rest?\n")
    writer.close()
    Source.fromFile("Write.txt").foreach(println)
}