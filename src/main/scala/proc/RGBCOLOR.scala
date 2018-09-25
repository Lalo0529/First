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
    background(156,240,159)
    stroke(0,0,255)
    line(110,50,20,250)

    stroke(0, 0, 255)
    line(110,50,200,250)

    stroke(0, 0, 255)
    line(20,250,200,250)

    stroke(0, 0, 255)
    line(270,50,200,250)

    stroke(0, 0, 255)
    line(110,50,270,50)


  }





}

object RGBCOLOR extends PApplication
