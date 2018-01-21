import sort._
import search._


/**
  * Created by nirbhaygupta on 1/21/18.
  */
object Main extends App {
  println("This will be the main class which will execute the entire project")
//  val output = QuickSort.sort(Array(3,2,4, 5 ,6 ,7,1, 3, 1))
  val search = BinarySearch.search(Array(3,2,4,5), 1)
  val search2 = JumpySearch.search(Array(1,1,2), 2, 2)
  println("Linear",search.deep.mkString(" "), search2)
}
