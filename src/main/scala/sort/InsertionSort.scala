package sort

/**
  * Created by nirbhaygupta on 1/21/18.
  */
object InsertionSort {

  def sort(input: Array[Int]): Array[Int] = {
    val length = input.length
    for (i <- 1 to length - 1) {
      var sortIndex = i;
      while (sortIndex > 0) {
        if (input(sortIndex) < input(sortIndex - 1)) {
          val swap = input(sortIndex);
          input(sortIndex) = input(sortIndex - 1)
          input(sortIndex - 1) = swap
        }
        println(input.deep.mkString(" "))
        sortIndex = sortIndex - 1
      }
    }
    input
  }

}
