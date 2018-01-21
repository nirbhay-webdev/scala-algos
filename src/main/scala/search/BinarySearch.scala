package search

/**
  * Created by nirbhaygupta on 1/22/18.
  */
object BinarySearch {
  def search(input:Array[Int], el: Int): Array[Int] = {
    input match {
      case Array(_) => {
        if(input(0) == el) {
          Array(el)
        } else  {
          Array[Int]()
        }
      }
      case Array(_*) => {
        val arrayTuple = partition(input);
        val leftArray  = search(arrayTuple._1, el)
        val rightArray = search(arrayTuple._2, el)
        join(leftArray, rightArray)
      }
    }
  }
//
  def partition(input: Array[Int]): (Array[Int], Array[Int]) = {
    val size = input.length
    var midpoint = size/2
    if(size % 2 == 1) {
      midpoint = midpoint + 1
    }
    val arrayTuple = input.splitAt(midpoint)
    val leftArray = arrayTuple._1
    val rightArray = arrayTuple._2
    (leftArray, rightArray)
  }

  def join(left: Array[Int],right: Array[Int]): Array[Int] = {
    val joinedArray = new Array[Int](left.length + right.length)
    var joinCounter = 0

    while(joinCounter < joinedArray.length) {
      if(joinCounter < left.length) {
        joinedArray(joinCounter) = left(joinCounter)
      } else {
        joinedArray(joinCounter) = right(joinCounter - left.length)
      }
      joinCounter = joinCounter + 1
    }
    joinedArray
  }

}
