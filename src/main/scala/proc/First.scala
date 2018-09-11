package proc

import java.text.NumberFormat

import processing.core.PApplet

class First extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {

    def drawRedCircle(circleX: Float, circleY: Float, circleDiameter: Float): Unit = {
      fill(255, 0, 0)
      ellipse(circleX, circleY, circleDiameter, circleDiameter)
    }
    drawRedCircle(100, 200, 50)


  }

}

object First extends App {
  PApplet.main("proc.First")
}







