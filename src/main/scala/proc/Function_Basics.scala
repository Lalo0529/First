package proc

import processing.core.PApplet

class Function_Basics extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(320,240)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
  background(0)
    flower()
  }


   def flower(): Unit = {
    fill(255,0,0)
    ellipse(100,100,20,20)

  }
}

object Function_Basics extends PApplication
