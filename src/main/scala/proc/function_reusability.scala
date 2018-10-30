package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class function_reusability extends PApplet {
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
    background(225)
    star(100,100)
    star(200,200)
    star(300,300)
    star(400,360)
  }

  def star( x: Float  ,y: Float  ): Unit = {
    fill(127,0,0)
    stroke(25)
    strokeWeight(2)

    beginShape()
    vertex(100,50)
    vertex(114,80)
    vertex(147,85)
    vertex(123,107)
    vertex(129, 140)
    vertex(100,125)
    vertex(71,140)
    vertex(77,107)
    vertex(53,85)
    vertex (86,80)
    endShape(CLOSE)
  }
}

object function_reusability extends PApplication
