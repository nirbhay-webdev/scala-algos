package sort

/**
  * Created by nirbhaygupta on 1/21/18.
  */
object BubbleSort {
  def sort(input: Array[Int]): Array[Int] = {
    input match {
      case Array(_*) => {
        val arrayLength: Int = input.length
        var minValueIndex: Int = arrayLength - 1
        for (i <- 0 to arrayLength - 2) {
          for (j <- arrayLength - 1 to i by -1) {
            if (input(j) < input(minValueIndex)) {
              minValueIndex = j
            }
          }
          val interim = input(i)
          input(i) = input(minValueIndex)
          input(minValueIndex) = interim
        }
      }
      case _ => println("Its not")
    }
    println(input.deep.mkString(" "))
    input
  }
}
