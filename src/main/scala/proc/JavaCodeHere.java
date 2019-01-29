package proc;

import processing.core.PApplet;
import processing.core.PImage;

public class JavaCodeHere extends PApplet {


    PImage frog;

    public void settings() {

        size(600, 400);
    }

    public void setup() {
        frog = loadImage("frog.jpg");
    }

    public void draw() {

    }


    void javaCodeHere() {
        background(0);
        image(frog, 0, 0);
        for (int i = 0; i < 100; i++) {
            float x = random(width);
            float y = random(height);
            int c = frog.get((int)x,(int)y);
            fill(c);
            noStroke();
            ellipse(x, y, 16, 16);
        }
        updatePixels();
    }



    public static void main(String[] args) {
        PApplet.main(JavaCodeHere.class.getName());

    }
}
