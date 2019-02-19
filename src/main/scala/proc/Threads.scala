package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Threads extends PApplet {
  val ScreenDimension = 1080

  var x: Int = 0

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  }

  override def setup(): Unit = {
    loadData()
  }

  override def draw(): Unit = {
    background(0)
    stroke(255)
    strokeWeight(4)
    line(x, 0, x, height)

    x = x + 10
    if (x > width) x = 0
  }

  def loadData(): Unit = {
    println("GOT DATA")
    delay(1000)
  }
}

object Threads extends PApplication
