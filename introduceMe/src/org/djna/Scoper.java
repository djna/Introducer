package org.djna;

public class Scoper {

    public static void main(String[] args) {

        Coordinates theLocation = new Coordinates(23, 57);

        System.out.printf("We are at %s\n", theLocation );
        move(theLocation);
        System.out.printf("After the move we are at %s\n", theLocation );
    }

    private static void move(Coordinates startingLocation ){

        startingLocation.x += 5;
        startingLocation.y -= 3;
        System.out.printf("Moved to %s\n", startingLocation );

        return;
    }
}
