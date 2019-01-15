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
        image(frog,0,0);
        loadPixels();
        frog.loadPixels();
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                int loc =  x+y*width;
                float r = red(frog.pixels[loc]);
                float g = green(frog.pixels[loc]);
                float b = blue(frog.pixels[loc]);
                float d = dist(mouseX,mouseY,x,y);
                float factor = map(d,0,200,2,0);
                pixels[loc] = color(r*factor,g*factor,b*factor);
            }
        }
updatePixels();




    }

    public static void main(String[] args) {
        PApplet.main(JavaCodeHere.class.getName());

    }
}































