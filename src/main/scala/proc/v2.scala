package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class v2 extends PApplet {
  val ScreenDimension = 1080
  var P2: Particle = null
  var P1: Particle = null
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(640, 360)
  }

  override def setup(): Unit = {
    P1 = new Particle(100,100,50)
    P2 = new Particle(500,200,100)
  }

  override def draw(): Unit = {
    background(0)

    var d: Float = dist (P1.x,P1.y,P2.x,P2.y)
    if (d < P1.r + P2.r){
      background(0,255,0)
    }

    P1.overlaps(P2)


    P2.x = mouseX
    P2.y =mouseY

    P1.display()
    P2.display()
  }

  class Particle(var x: Float, var y: Float, var r: Float , var col: Int = color(0)) {

    def this() = this(
      random(width),
      random(height),
      random(4,18)
    )



    def overlaps(other:Particle){
      var d: Float = dist(x,y,other.x,other.y)
      if(d < r + other.r ){
        col = color (0,0,255,100)
        other.col = color (255,0,0,100)
      }else{
        col = color(0,100)
        other.col = color(0,250)


      }

    }

    def display(): Unit = {
      stroke(255)
      fill(col)
      ellipse(x, y, r * 2, r * 2)
    }


  }

}

object v2 extends PApplication
