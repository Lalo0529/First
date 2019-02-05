package proc;

import processing.core.PApplet;
import processing.core.PImage;

public class JavaCodeHere extends PApplet {


    PImage frog;
String[] words;
int index = 0;
    public void settings() {

        size(600, 400);
    }

    public void setup() {
        String [] lines = loadStrings("hamlet.txt");
        String entireplay = join(lines,"");
        println(entireplay);
        words = splitTokens(entireplay,",.?'!");
        printArray(words);
        frameRate(5);

    }

    public void draw() {
        background(0);
        fill(255);
        textSize(64);
        textAlign(CENTER);
        text(words[index],width/2,height/2);
        index++;






    }


    void javaCodeHere() {

    }



    public static void main(StringPApplet[] args) {
        PApplet.main(JavaCodeHere.class.getName());

    }
}
