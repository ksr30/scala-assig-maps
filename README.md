1. Write a function: 
def sumConditional(map: Map[String, Int], str: String): Int
Takes: a map of name -> age and returns the sum of ages for which the name contains the str
Sample input: 
val map = Map("anurag" -> 24, "daniel" -> 23, "anushka" -> 30)
val str = "anu"
sumConditional(map, str) should return 54


Q2. Input:
val map = Map(
 1 -> List(“Sunil”, “Laxmi”),
 2 -> List(“Bhavya”, “Sangeeta”),
 3 -> List(“Arun”, “Sushmita”),
 4 -> List(“Jamwant”)
)
Output:
val map = Map(
 1 -> List(“Sodd”, “Lodd”),
 2 -> List(“Beven”, “Seven”),
 3 -> List(“Aodd”, “Sodd”),
 4 -> List(“Jeven”)
)


Using FoldLeft

Q3. Find the last element of a list
Sample declaration of method: last(list: List[Int]): Int
Input: last(List(1, 1, 2, 3, 5, 8))
output: Int = 8

