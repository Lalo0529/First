package proc

import processing.core.PApplet

class ConditionalStatement extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640,360)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    background(0)

    if (mouseX > 500){
    background(255,0,0)
    } else if (mouseX > 400){
    background(255,255,0)
    }else if (mouseX > 300){
    background(255,0,255)
    }else if (mouseX > 200){
    background(0,255,0)
    }else if (mouseX > 100){
      background(255,255,125)

    }

    stroke(255)
    line(100,0,100,height )
    line(500,0,500,height)
    line(200,0,200,height)
    line(300,0,300,height )
    line(400,0,400,height)





  }
}

object ConditionalStatement extends PApplication
