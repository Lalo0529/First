package proc

import java.text.NumberFormat

import processing.core.PApplet

class First extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(200, 200)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {

    fill(255, 0, 0 )
    ellipse(50, 50 ,100, 100)

    fill(0, 255, 0)
    ellipse(150, 50, 100, 100)

    fill(0, 0, 255)
    ellipse(50, 150, 100, 100)

    fill(255, 255, 0)
    ellipse(150, 150, 100, 100)
  }

}

object First extends App {
  PApplet.main("proc.First")
}