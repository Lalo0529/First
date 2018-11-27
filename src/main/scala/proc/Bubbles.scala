package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Bubbles extends PApplet {

  var b1: Bubble = null
  var b2: Bubble = null
  val bubbles = new Array[Bubble](2)

  val ScreenDimension = 1080
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640,360)
  }

  override def setup(): Unit = {
    var i = 0
    while ( {
      i < 2
    }) {
      bubbles(i) = new Bubble(64)

      {
        i += 1; i - 1
      }
    }

  }

  override def draw(): Unit = {
    background(255)
    stroke(1)
    var i = 0
    while ( i < 2 ) {
      bubbles(i).ascend()
      bubbles(i).display()
      bubbles(i).top()
      i += 1; i - 1
    }

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

object Bubbles extends PApplication