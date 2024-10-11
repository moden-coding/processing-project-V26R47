import processing.core.*;

public class App extends PApplet {
    float mouthSize;
    float twelthRoot = (float) Math.pow(2, 1.0 / 12.0);
    float minDiameter = 6.25f;
    float maxDiameter = 100;
    String displayMessage = "Play A";
    int messageNumber = 0;

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
        background(200);
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
        text(displayMessage, 50, 50);
        if(messageNumber == 1){
            displayMessage = "Play Bb";
            } else if(messageNumber == 2){
                displayMessage = "Play B";
            } else if(messageNumber == 3){
                displayMessage = "Play C";
            } else if(messageNumber == 4){
                displayMessage = "Play C#";
            } else if(messageNumber == 5){
                displayMessage = "Play D";
            } else if(messageNumber == 6){
                displayMessage = "Play Eb";
            } else if(messageNumber == 7){
                displayMessage = "Play E";
            } else if(messageNumber == 8){
                displayMessage = "Play F";
            } else if(messageNumber == 9){
                displayMessage = "Play F#";
            } else if(messageNumber == 10){
                displayMessage = "Play G";
            } else if(messageNumber == 11){
                displayMessage = "Play Ab";
            } else if(messageNumber == 12){
                displayMessage = "Play A";
            }
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
        if(messageNumber == 0 && (int)mouthSize == 50) {
            System.out.println("Played A");
            text("Great job!", 50, 600);
            messageNumber++;
    } else if(messageNumber == 1 && (int)mouthSize == 52) {
        System.out.println("Played Bb");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 2 && (int)mouthSize == 56) {
        System.out.println("Played B");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 3 && (int)mouthSize == 59) {
        System.out.println("Played C");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 4 && (int)mouthSize == 62) {
        System.out.println("Played C#");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 5 && (int)mouthSize == 66) {
        System.out.println("Played D");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 6 && (int)mouthSize == 70) {
        System.out.println("Played Eb");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 7 && (int)mouthSize == 74) {
        System.out.println("Played E");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 8 && (int)mouthSize == 79) {
        System.out.println("Played F");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 9 && (int)mouthSize == 84) {
        System.out.println("Played F#");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 10 && (int)mouthSize == 89) {
        System.out.println("Played G");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 11 && (int)mouthSize == 94) {
        System.out.println("Played Ab");
        text("Great job!", 50, 600);
        messageNumber++;
    } else if(messageNumber == 12 && (int)mouthSize == 100) {
        System.out.println("Played A");
        text("Great job!", 50, 600);
        messageNumber++;
    }

    if (keyCode == ENTER) {
            
            
}
}
}