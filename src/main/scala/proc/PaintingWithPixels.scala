package proc

import processing.core.{PApplet, PImage}
import processing.core.PApplet._
import processing.core.PConstants._

class PaintingWithPixels extends PApplet {
  val ScreenDimension = 1080

   var frog: PImage = null

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(858,536)
  }

  override def setup(): Unit = {
    frog = loadImage("frog.jpg")
    background(0)

  }

  override def draw(): Unit = {
   // image(frog, 0, 0)
    var i = 0
    while ( {i < 100}) {
      val x = random(width)
      val y = random(height)
      val c = frog.get(x.toInt, y.toInt)
      fill(c)
      noStroke()
      ellipse(x, y, 16, 16)
      i += 1; i - 1
    }
    updatePixels()
  }
}

object PaintingWithPixels extends PApplication
