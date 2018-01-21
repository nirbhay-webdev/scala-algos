package algos

/**
  * Created by nirbhaygupta on 1/21/18.
  */
object QuickSort {
  def sort(input: Array[Int]): Array[Int] = input match {
      case Array()  => input
      case Array(_) => input
      case Array(_*) => {
        val arrayTuple = partition(input)
        val leftArray  = sort(arrayTuple._1)
        val rightArray = sort(arrayTuple._2)
        join(leftArray, rightArray, arrayTuple._3)
      }
    }


  // Partition function takes the last element as pivot
  private def partition(input: Array[Int]): (Array[Int], Array[Int], Int) = {
    val size = input.length
    val pivot = input(size - 1)

    var leftArray  = new Array[Int](0)
    var left = 0
    var right = 0
    var rightArray = new Array[Int](0)
    var partitionCounter = 0

    while(partitionCounter < size - 1) {
      if(input(partitionCounter) <= pivot) {
        leftArray = leftArray :+ input(partitionCounter)
        left = left + 1
      } else {
        rightArray = rightArray :+ input(partitionCounter)
        right = right + 1
      }
      partitionCounter = partitionCounter + 1
    }

    (leftArray, rightArray, pivot)
  }

  private def join(arr1: Array[Int], arr2: Array[Int], pivot: Int): Array[Int] = {
    val joinedArray = new Array[Int](arr1.length + arr2.length + 1);
    var joinCounter = 0
    while(joinCounter < joinedArray.length) {
      if(joinCounter < arr1.length && arr1.length !=0) {
        joinedArray(joinCounter) = arr1(joinCounter)
        joinCounter = joinCounter + 1
      } else if(joinCounter == arr1.length){
        joinedArray(joinCounter) = pivot
        joinCounter = joinCounter + 1
      } else if(arr2.length != 0){
        joinedArray(joinCounter) = arr2(joinCounter - arr1.length - 1)
        joinCounter = joinCounter + 1
      }
    }
    joinedArray
  }

}
