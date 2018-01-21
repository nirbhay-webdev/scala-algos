import sort._
import search._


/**
  * Created by nirbhaygupta on 1/21/18.
  */
object Main extends App {
  println("This will be the main class which will execute the entire project")
//  val output = QuickSort.sort(Array(3,2,4, 5 ,6 ,7,1, 3, 1))
  val search = LinearSearch.search(Array(3,2,4,5), 1)
  val search2 = LinearSearch.search(Array(3,2,4,5), 3)
  println("Linear",search, search2)
}
