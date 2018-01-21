package search

import scala.util.control.Breaks.{ breakable, break }
/**
  * Created by nirbhaygupta on 1/22/18.
  */
object JumpySearch {
  def search(input: Array[Int], el: Int, step: Int): Int ={
    var left= 0
    var found = false
    while(left < input.length && !found) {
      var rightLimit = left + step
      if(rightLimit > input.length - 1) {
        rightLimit = input.length -1
      }
      if(el >= input(left) && el <= input(rightLimit)){
        found = true
      } else {
        left = left + step
      }
    }
    var index = -1
    breakable {
      for (i <- left to left + step) {
        if (i < input.length && input(i) == el) {
          index = i
          break
        }
      }
    }
    index
  }
}
