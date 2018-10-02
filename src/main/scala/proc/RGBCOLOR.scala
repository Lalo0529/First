package proc

import processing.core.PApplet

class RGBCOLOR extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  size(640,360)

  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    fill(255)
    ellipse(100,70,60,60)

    fill(0)
    ellipse(81,70,16,32)
    ellipse(119,70,16,32)

    stroke(0)
    line(90,150,80,160)
    line(110,150,120,160)

    fill(155)
    rect(90,100,20,50)

  }





}

object RGBCOLOR extends PApplication
