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
        image(frog,0,0);
        loadPixels();
        for(int X = 0; X < width; X++){
            for(int Y = 0; Y < height; Y++){
                float d = dist(X,Y,width/2,height/2);
                int loc = X+Y*width;
                pixels[loc] = color(d);

            }
        }
        updatePixels();

    }


    void javaCodeHere() {

    }

    public static void main(String[] args) {
        PApplet.main(JavaCodeHere.class.getName());

    }
}































