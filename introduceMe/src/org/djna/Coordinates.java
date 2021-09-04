package org.djna;

public class Coordinates {
    int x;
    int y;

    Coordinates( int initialX, int initialY){
        x = initialX;
        y = initialY;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
