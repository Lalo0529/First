package proc;

import processing.core.PApplet;
import processing.core.PImage;
import processing.data.IntDict;
import processing.data.Table;
import processing.data.TableRow;

public class JavaCodeHere extends PApplet {

    Dino dino;


    public void settings() {

    }

    public void setup() {
        dino = new Dino();
    }

    public void draw() {
        background(255);
        dino.move();
        dino.show();
    }

    class Dino {
        float posy = 0;
        float velY = 0;
        float gravity = 10;
        float speed = 5;

        int size = 20;

        Dino() {


        }

        void show() {
            fill(0);
            rectMode(CENTER);
            rect(50, height - (posy + size / 2), size, size*2);

        }

        void move (){
            posy += velY;

            if(posy > 0){
                velY -= gravity;
            }else {
                velY = 0;
                posy = 0;
            }

        }

    }

    void KeyPressed() {
        switch (key) {
            case ' ':
                dino.velY = 10;
        }
    }

        public static void main (String[]args){
            PApplet.main(JavaCodeHere.class.getName());

        }

}