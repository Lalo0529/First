
package proc

import processing.core.PApplet

class While_Grid extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(400,300)
  }
  var x: Float = 0
  var y: Float = 0
  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    background(0)

    stroke(255)
    strokeWeight(2)

    x = 50
    while (x < width) {
      line(x,0,x,height)
      x = x + 50
    }

    y = 50
    while (y < width){
      line(0,y,width,y)
      y = y + 50
    }



  }
}

object While_Grid extends PApplication
