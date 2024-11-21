import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession
object RDD extends App {
    val conf = new SparkConf().setAppName("SimpleRDDApp").setMaster("local[1]")
    val sc = new SparkContext(conf)
    val spark = SparkSession.builder().master("local[1]").appName("myApp").getOrCreate()
    val rdd1 = spark.sparkContext.parallelize(Seq("the", "cow", "has"))
    val rdd = sc.parallelize(Array(1,2,3,4,5,6,7,8))
    rdd.foreach(println)
    val rdd = sc.textFile("path")
    val wc = rdd.flatMap(line => line.split(",")).map(word => (word, 1)).reduceByKey(_+_)
    wc.first()
    wc.take(5)
}