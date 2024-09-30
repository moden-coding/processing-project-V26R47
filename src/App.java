import processing.core.*;

public class App extends PApplet {
    float mouthSize;
    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(700, 700);
    }

    public void setup() {
        background(200);
        mouthSize = 100;
    }

    public void draw() {
        fill(255, 255, 0);
        ellipse(350, 350, 300, 300);
        fill(0);
        ellipse(300, 300, 50, 60);
        ellipse(400, 300, 50, 60);
        fill(255, 100, 0);
        triangle(350, 300, 300, 375, 400, 375);
        fill(0, 255, 255);
        ellipse(350, 425, mouthSize, mouthSize);
    
    }

    public void keyPressed(){
        if(keyCode == RIGHT){
            mouthSize += 5;
        } else {
            mouthSize -= 5;
        }
        
    }
}
