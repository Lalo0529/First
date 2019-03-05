package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Assignment1 extends PApplet {
  val ScreenDimension = 1080
   val down: Float = 0
   val up = 0
   val gravity: Float = .5f
   var ground: Float = 700
   var currentVelocity: Float = 0
  var yPos: Float = 0
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  size(600,340)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    yPos = yPos - currentVelocity
    currentVelocity = currentVelocity - 1
    if (yPos >=0)currentVelocity = 0
    Dino()



  }

  def Dino(): Unit = {
    background(255)
    fill(0)
    rect(20,280+yPos,30,30)
  }

  override def keyPressed(): Unit = {
    if(yPos >=0)
    currentVelocity = 10

  }



}

object Assignment1 extends PApplication
