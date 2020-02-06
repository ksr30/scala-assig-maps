//Q1. Write a function:
//def sumConditional(map: Map[String, Int], str: String): Int
//Takes: a map of name -> age and returns the sum of ages for which the name contains the str
//  Sample input:
//val map = Map("anurag" -> 24, "daniel" -> 23, "anushka" -> 30)
//val str = "anu"
//sumConditional(map, str) should return 54


@scala.annotation.tailrec
def innerSumConditional(map: Map[String, Int], str: String, sum: Int): Int = {
  if (map.isEmpty) sum
  else {
    if (map.head._1.contains(str)) {
      innerSumConditional(map.-(map.head._1), str, sum + map.head._2)
    }
    else innerSumConditional(map.-(map.head._1), str, sum)
  }
}
val map = Map("anurag" -> 24, "daniel" -> 23, "anushka" -> 30)
val str = "anu"
print(innerSumConditional(map,"anu",0))
