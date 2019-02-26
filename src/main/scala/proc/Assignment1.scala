package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Assignment1 extends PApplet {
  val ScreenDimension = 1080
   val down: Float = 0
   val up = 0
   val gravity: Float = .5f
   val ground: Float = 700
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  size(600,340)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    Dino()



  }

  def Dino(): Unit = {
    background(255)
    fill(0)
    rect(20,280,30,30)
  }

  def jump(): Unit = {
keyPressed
  }























}

object Assignment1 extends PApplication
