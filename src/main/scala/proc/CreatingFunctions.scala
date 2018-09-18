package proc

import processing.core.PApplet

class CreatingFunctions extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(150,150)
  }



  override def setup(): Unit = {


  }
  def drawTarget(targetX: Float, targetY: Float, targetSize: Float): Unit = {

    fill(255, 0, 0)
    ellipse(targetX, targetY, targetSize, targetSize)
    fill(255, 255, 255)
    ellipse(targetX, targetY, targetSize * .75f, targetSize * .75f)
    fill(255, 0, 0)
    ellipse(targetX, targetY, targetSize / 2, targetSize / 2)
  }







  override def draw(): Unit = {
drawTarget(random(0, width), random(0, height), random(25, 100))
  }
}




object CreatingFunctions extends PApplication











