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

    // Using StructType & StructField
    import org.apache.spark.sql.types._
    import org.apache.spark.sql.Row
    val mySchema = StructType(Array(
        StructField("Name",StringType,true),
        StructField("Position",StringType,true),
        StructField("Gender", StringType, true),
        StructField("Age",IntegerType,true),
        ))
    val myData=Seq(Row("John","Manager","Male",38),
            Row("Mary", "Director","Female", 45),
            Row("Sally", "Engineer","Female", 30),
            Row("Okelo", "Clerk","Male", 30),
            Row("Wiclife", "Trainers","Male", 60),
            Row("Wallace", "Clerk","Male", 40),
            Row("Eunice", "Trainer","Female", 35),
            Row("Barack", "Trainer","Male", 30),
            Row("Simon", "Trainer", "Male", 55)
            )
    val mydf = spark.createDataFrame(spark.sparkContext.parallelize(myData),mySchema)
    val bksds2 =
    bksds.agg(sum("Stock"),max("Stock"),
    min("Yopb")).show()
    
}