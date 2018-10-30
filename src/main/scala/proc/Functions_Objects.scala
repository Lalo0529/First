package proc

import processing.core.PApplet

class Functions_Objects extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(360,240)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    background(0)
    rect(0,0,0,100)
    flower()
  }
  def flower(): Unit = {
  fill(225,0,0)
    ellipse(100,100,20,20)
  }
}

object Functions_Objects extends PApplication
