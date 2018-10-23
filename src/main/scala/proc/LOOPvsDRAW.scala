package proc

import processing.core.PApplet

class LOOPvsDRAW extends PApplet {
  val ScreenDimension = 1080

  var x: Float = 0
  var spacing : Float = 20
  var endX: Float = 0
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(400,300)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    background(0)
    strokeWeight(2 )
    stroke(225)

    x = 0
    while (x < endX ){
      line(x,0,x,height)
      x = x + spacing}

    endX = endX + 1
  }
}

object LOOPvsDRAW extends PApplication
