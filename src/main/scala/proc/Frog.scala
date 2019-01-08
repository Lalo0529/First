
package proc

import processing.core.{PApplet, PImage}
import processing.core.PApplet._
import processing.core.PConstants._

class Frog extends PApplet {
  val ScreenDimension = 1080

  var frog = null
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {


    loadPixels()
    var X = 0
    while ( {
      X < width
    }) {
      var Y = 0
      while ( {
        Y < height
      }) {
        val d = dist(X, Y, width / 2, height / 2)
        val loc = X + Y * width
        pixels(loc) = color(d)

        {
          Y += 1; Y - 1
        }
      }

      {
        X += 1; X - 1
      }
    }
    updatePixels()
  }
}

object Frog extends PApplication
