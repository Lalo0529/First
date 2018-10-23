package proc

import processing.core.PApplet

class Nested_loops extends PApplet {
  val ScreenDimension = 1080

  var x: Float = 0
  var y: Float = 0
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(400,300)
    noLoop()
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    background(0)
    strokeWeight(2)
    stroke(255)


    for {
      x <- 0 until width by 20
      y <- 0 until height  by 20
    }{
      fill(random(255))
      rect(x,y,20,20)

    }


  }
}

object Nested_loops extends PApplication
