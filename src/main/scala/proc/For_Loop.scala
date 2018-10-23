package proc

import processing.core.PApplet

class For_Loop extends PApplet {
  val ScreenDimension = 1080

  var spacing: Float = 20
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
        x <- 0 until width   by 20
      }{
        line (x,0,x,height )
      }




    for {
      y <- 0 until height  by 20
    } {
      line(0, y, width, y)
    }
  }
}

object For_Loop extends PApplication
