import algos._


/**
  * Created by nirbhaygupta on 1/21/18.
  */
object Main extends App {
  println("This will be the main class which will execute the entire project")
  val output = MergeSort.sort(Array(3,2,4, 5 ,6 ,7,1, 3, 1))
  println(output.deep.mkString(" "))
}
