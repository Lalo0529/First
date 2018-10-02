package proc

import processing.core.PApplet
import processing.core.PConstants._

class BuiltInVariables extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640,360)
  }

  override def setup(): Unit = {
    background(50)
  }

  override def draw(): Unit = {


    fill(150)
    stroke(255)
    line(pmouseX,pmouseY,mouseX,mouseY)


  }





}

object BuiltInVariables extends PApplication
