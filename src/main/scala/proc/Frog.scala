
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
    image(frog, 0, 0)
    loadPixels()
    frog.loadPixels()
    var x = 0
    while ( {
      x < width
    }) {
      var y = 0
      while ( {
        y < height
      }) {
        val loc = x + y * width
        val r = red(frog.pixels(loc))
        val g = green(frog.pixels(loc))
        val b = blue(frog.pixels(loc))
        val d = dist(mouseX, mouseY, x, y)
        val factor = map(d, 0, 200, 2, 0)
        pixels(loc) = color(r * factor, g * factor, b * factor)

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
