 package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class OOP extends PApplet {

  var b1: Bubble = null
  var b2: Bubble = null
  var diameter: Unit = null

  val ScreenDimension = 1080
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640,360)
  }

  override def setup(): Unit = {
    b1= new Bubble(64)
    b2 = new Bubble(16)
  }

  override def draw(): Unit = {
  background(255)
    stroke(1)
    b1.ascend()
    b1.display()
    b1.top()

      b2.ascend()
      b2.display()
      b2.top()
  }
  class Bubble(tempD:Float) {

    var x: Float = width/2
    var y: Float = height
    var diameter: Float = tempD

    def ascend(): Unit = {
      y-= 1
      x = x + random (-2,2)
    }


    def display(): Unit = {

      stroke(0)
      fill(127)
      ellipse(x,y, diameter ,diameter)

    }

    def top(): Unit = {
      if (y < diameter/2 ){
        y = diameter/2
      }
    }

  }

}

object OOP extends PApplication