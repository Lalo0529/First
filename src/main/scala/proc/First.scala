package proc

import java.text.NumberFormat

import processing.core.PApplet

class First extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(400, 400)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {

    fill(255, 0, 0)
    ellipse(width/2, height/2, width, height)

    fill(255, 255, 255)
    ellipse(width/2, height/2, width*.75f, height*.75f)

    fill(255, 0, 0)
    ellipse(width/2, height/2, width/2, height/2)
  }

}

object First extends App {
  PApplet.main("proc.First")
}