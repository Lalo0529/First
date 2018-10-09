package proc

import processing.core.PApplet

class Quadrants extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640,360)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {

    background(0)

    if (mouseX > 320){
      fill(255,255,125)
      rect(320,.5f,321,180)
    }else if (mouseX < 320){
      fill(0,255,125)
      rect(0.5f,180,320,180)
    }

    if (mouseY > 180){
      fill(255,0,125)
      rect(320,180,320,180)} else if (mouseY < 180){
        fill(15,125,125)
        rect(.5f,.5f,320,180)
      }

     stroke(255,255,255)
    line(320,0,320,height)
    line(0,180,width,180)
    }
}

object Quadrants extends PApplication
