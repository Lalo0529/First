package proc

import processing.core.PApplet

class City extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  size(500, 300)
  }

  override def setup(): Unit = {

  }

  def drawHouse(houseX: Float, houseY: Float, houseSize: Float  ): Unit ={

    stroke(225, 0, 255)
    fill(225,0,0)
  rect(30, 75, 55, 50)

    stroke(225)
  fill(225)
    triangle(31, 75, 58, 39, 85, 75)
  }
  override def draw(): Unit = {
    drawHouse( mouseX, mouseY ,100)
    if(mousePressed){
      drawHouse( mouseX, mouseY ,100)
    }
    else{ellipse(mouseX, mouseY, 69, 96)
    }





  }

}












object City extends PApplication