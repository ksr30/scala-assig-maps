//Find the last element of a list
//Sample declaration of method: last(list: List[Int]): Int
//Input: last(List(1, 1, 2, 3, 5, 8))
//output: Int = 8

def last(lst:List[Int]):Int= {
  lst.foldLeft(0){(acc,i)=>if(i==Nil) acc else i}
}
val lst=List(1, 1, 2, 3, 5, 8)
print(last(lst))