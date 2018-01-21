package algos

/**
  * Created by nirbhaygupta on 1/21/18.
  */
object MergeSort {

  def sort(input: Array[Int]): Array[Int] = input match {
      case Array(_) => input
      case Array(_*) => {
        val length = input.length;

//        print(input.deep.mkString(" "))
        val splitTuple = input.splitAt(length/2)
        val arr1 = sort(splitTuple._1)
        val arr2 = sort(splitTuple._2)
        val output = merge(arr1, arr2)
        println(output.deep.mkString(" "), input.deep.mkString(" "))
        output
      }
      case _ => {
        println("Not an acceptable type")
        input
      }
    }

  private def merge(arr1: Array[Int], arr2: Array[Int]): Array[Int] = {
    val mergedArray = new Array[Int](arr1.length + arr2.length);
    var right = 0;
    var left = 0;
    for(i <- 0 until (arr1.length + arr2.length)) {
      if(left == arr1.length) {
        mergedArray(i) = arr2(right);
        right = right + 1;
      } else if(right == arr2.length) {
        mergedArray(i) = arr1(left);
        left = left + 1;
      } else if(arr1(left) < arr2(right)) {
        mergedArray(i) = arr1(left);
        left = left + 1;
      } else {
        mergedArray(i) = arr2(right);
        right = right + 1;
      }
    }
    mergedArray
  }
}
