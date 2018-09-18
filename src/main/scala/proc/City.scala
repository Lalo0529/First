package proc

import processing.core.PApplet

class City extends PApplet {
  val ScreenDimension = 1080

  override def settings(): Unit = {
    size(ScreenDimension, ScreenDimension)
  size(200, 200)
  }

  override def setup(): Unit = {


  }
def drawHouse(houseX: Float, houseY: Float, houseSize: Float  ): Unit ={
  fill(225, 265, 245 )
  rect(houseX, houseY, houseSize, houseSize )

  fill(235, 255, 245 )
  rect(houseX, houseY, houseSize*.75f, houseSize*.75f)

  fill(255, 265, 275)
  rect(houseX, houseY, houseSize/2, houseSize/2)

}
  override def draw(): Unit = {
    background(200)
    drawHouse(mouseX, mouseY, 100)



  }

}












object City extends PApplication