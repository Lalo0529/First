
package proc

import processing.core.{PApplet, PImage}
import processing.core.PApplet._
import processing.core.PConstants._

class Frog extends PApplet {
  val ScreenDimension = 1080

  var frog: PImage = null
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(907,510)
  }

  override def setup(): Unit = {

    frog = loadImage("frog.jpg")

  }

  override def draw(): Unit = {
    //image(frog, 0, 0)
    loadPixels()
    frog.loadPixels()
    var x = 0
    while ( {
      x < width - 1
    }) {
      var y = 0
      while ( {
        y < height
      }) {
        val loc1 = x + y * width
        val loc2 = (x + 1) + Y * width
        val b1 = frog.pixels(loc1)
        val b2 = frog.pixels(loc2)
        val diff = abs(b1 - b2)
        pixels(loc1) = color(diff)

        {
          y += 1; y - 1
        }
      }

      {
        x += 1; x - 1
      }
    }
    updatePixels()


  }

}

object Frog extends PApplication
