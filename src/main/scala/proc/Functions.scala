package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Functions extends PApplet {
  val ScreenDimension = 1080

  var x: Float = 0
  var y: Float = 0
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640,360)
  }

  override def setup(): Unit = {

  }

    override def draw(): Unit = {
      background(51)
      star(mouseX,mouseY)
  }

  def star(x:Float,y:Float): Unit  = {
  fill(127)
    stroke(255)
    strokeWeight(2)

    beginShape()
    vertex(x,y-50)
    vertex(x+14,y-20)
    vertex(x+47,y-25)
    vertex(x+23,y+7)
    vertex(x+29,y+40)
    vertex(x,y+25)
    vertex(x-29,y+40)
    vertex(x-23,y+7)
    vertex(x-47,y-15)
    vertex(x-14,y-20)
    endShape(CLOSE)

  }
}

object Functions extends PApplication
