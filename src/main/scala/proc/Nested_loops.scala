package proc

import processing.core.PApplet
import processing.core.PApplet._

class Nested_loops extends PApplet {
  val ScreenDimension = 1080

  var x: Float = 0
  var y: Float = 0
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(400,300)

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
      fill(dist(mouseX,mouseY,x,y ))
      rect(x,y,20,20)


    }


  }
}

object Nested_loops extends PApplication
