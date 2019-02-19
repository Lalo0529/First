package proc;

import processing.core.PApplet;
import processing.core.PImage;
import processing.data.IntDict;
import processing.data.Table;
import processing.data.TableRow;

public class JavaCodeHere extends PApplet {

float x = 0;
    public void settings() {

        size(600, 400);
    }

    public void setup() {
    loadData();
    }

    public void draw() {
    background(0);
    stroke(255);
    strokeWeight(4);
    line(x,0,x,height);

    x = x +10;
    if (x > width){
    x = 0;
}


    }




    void loadData() {
        println("GOT DATA");
        delay(1000);
    }

    void javaCodeHere() {

    }



    public static void main(JavaCodeHere[] args) {
        PApplet.main(JavaCodeHere.class.getName());

    }
}
