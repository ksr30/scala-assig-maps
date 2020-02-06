import sun.awt.SunHints.Key

//Q2. Input:
//val map = Map(
//  1 -> List(“Sunil”, “Laxmi”),
//2 -> List(“Bhavya”, “Sangeeta”),
//3 -> List(“Arun”, “Sushmita”),
//4 -> List(“Jamwant”)
//)
//Output:
//val map = Map(
//  1 -> List(“Sodd”, “Lodd”),
//2 -> List(“Beven”, “Seven”),
//3 -> List(“Aodd”, “Sodd”),
//4 -> List(“Jeven”)
//)
@scala.annotation.tailrec
def modifyList(key: Int, lst: List[String], newLst: List[String]): List[String] = {
  lst match {
    case Nil => newLst
    case head :: rest => if (key % 2 == 0) modifyList(key, rest, newLst ::: List(head(0) + "even")) else modifyList(key, rest, newLst ::: List(head(0) + "odd"))
  }
}

@scala.annotation.tailrec
def modifyMap(oldMap: Map[Int, List[String]], newMap: Map[Int, List[String]]): Map[Int, List[String]] = {
  if (oldMap.isEmpty) newMap
  else {
    modifyMap(oldMap.-(oldMap.head._1), newMap.++(Map(oldMap.head._1 -> modifyList(oldMap.head._1, oldMap.head._2, List()))))
  }
}

val map = Map(
  1 -> List("Sunil", "Laxmi"),
  2 -> List("Bhavya", "Sangeeta"),
  3 -> List("Arun", "Sushmita"),
  4 -> List("Jamwant")
)
print(modifyMap(map, Map()))
