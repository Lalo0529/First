package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class DinoRun extends PApplet {
  val ScreenDimension = 1080
   var dino: Dino = null
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(800,400)

  }

  override def setup(): Unit = {
    dino = new Dino
  }

  override def draw(): Unit = {
background(255)
    background(255)
    dino.move()
    dino.show()
  }

 override def keyPressed(): Unit = {
    key match {
      case ' ' =>
        dino.velY = 10
    }
  }






  class Dino () {
    var posy = 0
    var velY = 0
    val gravity = 10
    val speed = 5
    val size = 20

    def show(): Unit = {
      fill(0)
      rectMode(CENTER)
      rect(50, height - (posy + size / 2), size, size * 2)
    }

    def move(): Unit = {
      posy += velY
      if (posy > 0) velY -= gravity
      else {
        velY = 0
        posy = 0
      }
    }
  }
}




object DinoRun extends PApplication
