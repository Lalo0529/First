package proc

import processing.core.{PApplet, PFont}
import processing.core.PApplet._
import processing.core.PConstants._

class StringsandDrawingText extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
    size(600,400)
  }

  override def setup(): Unit = {
background(0)
  }

  override def draw(): Unit = {
    val f = createFont("Georgia", 64)

    val s = "To be or not To be."

    textFont(f)
    textSize(64)
    text(s, 10, 200)

    var x = 10
    var i = 0
    while ( {
      i < s.length
    }) {
      text(s.charAt(i), x, 300)
      x = x + 32

      {
        i += 1; i - 1
      }
    }


  }
}

object StringsandDrawingText extends PApplication
