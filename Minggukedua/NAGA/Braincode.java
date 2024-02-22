package Minggukedua.NAGA;

public class Braincode {
    
    int x,y;
    int height, width;

    void moveleft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    void moveright() {
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    void moveup() {
        if (y > 0) {
            y++;
        } else {
            detectCollision();
        }
    }

    void movedown() {
        if (y < height) {
            y--;
        } else {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over!");
    }
    }

