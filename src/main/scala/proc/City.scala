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
  fill(0,0, 0)
  rect(30, 75, 55, 50)

  fill(0,0,0)
    triangle(31, 75, 58, 39, 85, 75)






}
  override def draw(): Unit = {
    drawHouse( 50, 150 ,100)





  }

}












object City extends PApplication