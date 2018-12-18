package proc

import processing.core.{PApplet, PImage}
import processing.core.PApplet._
import processing.core.PConstants._

class Images extends PApplet {
  val ScreenDimension = 1080

 var hog:PImage = null
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(600,400)
  }

  override def setup(): Unit = {

    hog = loadImage("hog.jpg")
  }

  override def draw(): Unit = {
  background(0)
    tint(255, mouseX, mouseY)
    image (hog,0,0,mouseX,mouseY)
  }
}

object Images extends PApplication
