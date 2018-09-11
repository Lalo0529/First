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

    def drawTarget(targetX: Float, targetY: Float, targetSize: Float): Unit = {
      fill(255, 0, 0)
      ellipse(targetX, targetY, targetSize, targetSize)
      fill(255, 255, 255)
      ellipse(targetX, targetY, targetSize * .75f, targetSize * .75f)
      fill(255, 0, 0)
      ellipse(targetX, targetY, targetSize / 2, targetSize / 2)
    }
   background(200)
    drawTarget(mouseX, mouseY, 100)


  }

}



object First extends App {
  PApplet.main("proc.First")
}







