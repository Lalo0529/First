
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
  var spacing: Float = 20
  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    background(0)

    stroke(255)
    strokeWeight(2)

    x = 0
    while (x < width) {
      line(x,0,x,height)
      x = x + spacing
    }

    y = 0
    while (y < width){
      line(0,y,width,y)
      y = y + spacing
    }



  }
}

object While_Grid extends PApplication
