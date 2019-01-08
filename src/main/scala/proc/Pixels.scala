package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Pixels extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(600, 400)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
   background(0)
  //  var X = 0
    //while (X < width) {
      //set(X, 200, color(255, 0, 0))
      //X += 1
    //}
    loadPixels()
    var i = 0
    while ( {
      i < pixels.length
    }) {
      pixels(i) = color(random(255), 0, random(50, 200))

      {
        i += 1; i - 1
      }
    }
    updatePixels()

  }
}

object Pixels extends PApplication
