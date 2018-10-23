package proc

import processing.core.PApplet

class Object_oriented_programming extends PApplet {
  val ScreenDimension = 1080

  var x: Float =0
  var y: Float = 0
  var xspeed:Float = 5
  var yspeed: Float = 2.3f
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(320, 240 )
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
   background(255)
    stroke(0)
    fill(127)
    ellipse(x,y,32,32)

    x = x + xspeed
    y = y + yspeed
    if (x > width || x < 0){
      xspeed = xspeed * -1
    }
    if (y > height || y < 0){
      yspeed = yspeed * -1
      }

  }
}

object Object_oriented_programming extends PApplication
