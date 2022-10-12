scalaVersion := "2.12.13"
organization := "com.example"
name := "snowpark-docker-sample"
resolvers += "OSGeo Release Repository" at "https://repo.osgeo.org/repository/release/"
libraryDependencies ++= Seq(
    "com.snowflake" % "snowpark" % "0.6.0" ,  
    "org.apache.spark" %% "spark-mllib" % "3.3.0" % "provided" , 
)
enablePlugins(JavaAppPackaging)
