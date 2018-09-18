package proc

import processing.core.PApplet

trait PApplication {
  def main(args: Array[String]): Unit = {
    PApplet.main(this.getClass.getName.init)
  }
}
