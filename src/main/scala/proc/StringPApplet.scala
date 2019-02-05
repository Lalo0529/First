package proc

import processing.core.PApplet
import processing.core.PApplet._
import processing.core.PConstants._

class StringPApplet extends PApplet {
  val ScreenDimension = 1080

  var words: Array[String] = null
  var index = 0
  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  }

  override def setup(): Unit = {
    background(0)
    val lines = loadStrings("hamlet.txt")
    val entireplay = join(lines, "")
    words = splitTokens(entireplay, ",.?'!")
    println(entireplay)
    printArray(words)
    frameRate(4)


  }

  override def draw(): Unit = {


    background(0)
    fill(255)
    textSize(64)
    textAlign(CENTER)
    text(words(index), width / 2, height / 2)
    index += 1
    }
}

object StringPApplet extends PApplication
