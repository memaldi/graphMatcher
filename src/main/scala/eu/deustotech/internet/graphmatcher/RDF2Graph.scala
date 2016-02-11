package eu.deustotech.internet.graphmatcher

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

/**
  * Created by mikel on 11/02/16.
  */
object RDF2Graph {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("RDF2Graph")
    val sc = new SparkContext(conf)

  }
}
