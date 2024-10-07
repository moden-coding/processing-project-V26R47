import processing.core.*;

public class App extends PApplet {
    float mouthSize;
    float twelthRoot = (float) Math.pow(2, 1.0 / 12.0);
    float minDiameter = 6.25f;
    float maxDiameter = 100;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(700, 700);
    }

    public void setup() {
        background(200);
        mouthSize = 25;
    }

    public void draw() {
        fill(255, 255, 0);
        ellipse(350, 350, 300, 300);
        fill(255);
        ellipse(300, 300, 50, 60);
        ellipse(400, 300, 50, 60);
        fill(0);
        ellipse(300, 300, 25, 25);
        ellipse(400, 300, 25, 25);
        fill(255, 100, 0);
        triangle(350, 300, 300, 350, 400, 350);
        fill(0, 0, 139);
        ellipse(350, 400, mouthSize, mouthSize);
        fill(0, 255, 255, 150);
        rect(312.5f, 350, 75, 75);
        fill(255, 255, 0, 100);
        arc(350, 387.5f, 50, 50, 0, PI);
        fill(128, 0, 128);
        textSize(50);
        text("Play A", 50, 50);
        }


    public void keyPressed() {
        if (keyCode == RIGHT) {
            System.out.println("diameter is " + mouthSize);
            System.out.println("max diameter is " + maxDiameter);
            if (mouthSize < maxDiameter) {
                mouthSize *= twelthRoot;
            }
        }
        if (keyCode == LEFT) {
            if (mouthSize > minDiameter) {
                mouthSize /= twelthRoot;
            }
        }
        if((int)mouthSize == 100 || (int)mouthSize == 50 || (int)mouthSize == 25 || (int)mouthSize == 12.5 || (int)mouthSize == 6.25) {
            System.out.println("Played A");
            text("Great job!", 50, 600);
    }
}
}
