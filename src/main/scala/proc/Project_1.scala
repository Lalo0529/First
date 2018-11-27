package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Project_1 extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    fullScreen()
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
  background(0)
    fill(5,25,40)
    strokeWeight(2)

    rect(mouseX,mouseY,160,90)

    fill(24,64,47)
    ellipse(mouseX,mouseY,160,90)

    fill(72,64,81)
    rect(mouseX,mouseY,64,64)

    fill(63,94,159)
    rect(mouseX,mouseY,height,width)

    fill(23,23,23)
    ellipse(2,2,2,2)



  }




}

object Project_1 extends PApplication
