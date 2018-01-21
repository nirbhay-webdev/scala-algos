package search

/**
  * Created by nirbhaygupta on 1/21/18.
  */
object LinearSearch {
  def search(input: Array[Int], value: Int): Int = {
    val output = for(x <- input if x == value)
      yield x
    output match {
      case Array() => -1
      case Array(_) => output(0)
    }
  }

}
