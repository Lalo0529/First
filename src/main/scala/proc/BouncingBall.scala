package proc

import processing.core.PApplet

class BouncingBall extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640,360)
  }
var circleX: Float = 0
  var xspeed : Float = 10
  override def setup(): Unit = {
   circleX = 0
  }

  override def draw(): Unit = {
  background(51)
    fill(102)
    stroke(255)
    ellipse(circleX,height/2, 32,32)

    circleX = circleX + xspeed
    if (circleX > width || circleX < 0){
     // TURN AROUND!
      xspeed = xspeed * -1.1f
    }


  }
}

object BouncingBall extends PApplication
