package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class Graphing extends PApplet {
  val ScreenDimension = 1080


  var sx: Float = 0
  var sy: Float = 0
  var xmin: Float = -5
  var xmax: Float = 5
  var ymin: Float = -5
  var ymax: Float = 5
  var xgrid: Float = 1
  var ygrid: Float = 1
  var xzoom: Float = 0
  var yzoom: Float = 0

  val fs:Seq[Double => Double] = Seq(
    x => (-1.0/4)*x + 3,
    x => (-7.0/4)*x - 3
  )

  override def settings(): Unit = {
    size(1080, 1080)
  }

  override def setup(): Unit = {

  }

  override def draw(): Unit = {
    background(0)

    xzoom = width/(xmax - xmin)
    yzoom = height/(ymax - ymin)
    def toGraph(sx: Int, sy: Int): (Double,Double) = {
      val x = (sx - (width/2))/xzoom
      val y = (sy + (height/2))/yzoom
      (x,y)
    }
    def toScreen(x: Double, y: Double): (Int,Int) = {
      val sx = width/2 + xzoom * x
      val sy = height/2 - yzoom * y
      (sx.toInt,sy.toInt)
    }

    stroke(255)
    strokeWeight(2)

   var sx = 0
    while (sx < width) {
      val(x,_)= toGraph(sx,0)
      for {
        f <- fs
      } {
        val y = f(x)
        val p = toScreen(x, y)
        set(p._1, p._2, color(255))
      }
      sx = sx + 1
    }

    val (sxAxis,syAxis)= toScreen(0,0)
    line(sxAxis,0,sxAxis,height)
    line(0,syAxis,width, syAxis)

    strokeWeight(1)
    stroke(128)
    for {
      x<- math.floor(xmin)to math.ceil(xmax) by 1.0
      (sx,_) = toScreen(x,0)
    }{
      line(sx,0,sx,height)
    }

  for {
    y<-math.floor(ymin)to math.ceil(ymax)by 1.0
    (_,sy) = toScreen(0,y)
  }{
    line(0,sy,width,sy)
  }


  }

}

object Graphing extends PApplication
