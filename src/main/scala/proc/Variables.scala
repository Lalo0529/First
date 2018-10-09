package proc

import processing.core.PApplet

class   Variables extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  size(640,360)
  }
  var circleX: Float =  random(0,width)

  var circleY: Float = random(0, height)


  override def setup(): Unit = {


  }

  override def draw(): Unit = {

   // Variables
    circleX = random (width)
    circleY = random(height)

    //Drawing Stuff
    background(50)
    fill(255)
    ellipse(circleX,circleY,24,24)




  }



}

object Variables extends PApplication
