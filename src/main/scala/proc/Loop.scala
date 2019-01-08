package proc

import processing.core.{PApplet, PImage}

class Loop extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(400,300  )
  }
  var x: Float = 0
  override def setup(): Unit = {


  }

  override def draw(): Unit = {
  background(0)

    x = 0
   while ( x < width){
     if (mouseX < 1) {
      x = x + 1
     }else {
       x = x + mouseX
     }

     fill(101)
     stroke(255)
     ellipse (x, 150,16,16)}

  }
}

object Loop extends PApplication
