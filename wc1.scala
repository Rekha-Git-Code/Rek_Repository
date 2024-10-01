val sparkConf = new SparkConf()
  sparkConf.set("spark.appname", "ReadWriteFile")
  sparkConf.set("spark.master", "local[*]")

  val spark = SparkSession.builder()
    .config(sparkConf)
    .enableHiveSupport()
    .getOrCreate()