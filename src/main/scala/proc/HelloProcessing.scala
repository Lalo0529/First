package proc

import processing.core.PApplet

class HelloProcessing extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(500, 400)
  }

  override def setup(): Unit = {
    background(35,11,79)

  }

  override def draw(): Unit = {
    fill(134, 141, 88)
    stroke(255)
    ellipse(mouseX, mouseY, 125, 125)

    rect(mouseX, mouseY, 69, 96)

    ellipse(mouseX, mouseY, 24, 128)

    rect(mouseX, mouseY, 96, 69)

    if (mousePressed) ellipse(mouseX, mouseY, 125, 125)
    else ellipse(mouseX, mouseY, 24, 128)


  }
}

object HelloProcessing extends PApplication
