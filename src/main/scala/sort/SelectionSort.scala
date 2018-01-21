package sort

/**
  * Created by nirbhaygupta on 1/21/18.
  */
object SelectionSort {
  def sort(input: Array[Int]): Array[Int] = {
    var counter = 0;
    var output = input
    while (counter < input.length) {
      val minIndex = min(input, counter)
      output = replace(output, counter, minIndex)
      counter = counter + 1
    }
    output
  }

  private def replace(arr: Array[Int], left: Int, right: Int): Array[Int] = {
    val swap = arr(left)
    arr(left) = arr(right)
    arr(right) = swap
    arr
  }

  private def min(arr: Array[Int], startFrom: Int): Int = {
    var minIndex = startFrom;
    for (i <- startFrom until arr.length) {
      if (arr(i) < arr(minIndex)) {
        minIndex = i
      }
    }
    minIndex
  }

}
