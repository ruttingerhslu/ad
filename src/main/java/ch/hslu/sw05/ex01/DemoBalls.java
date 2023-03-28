package ch.hslu.sw05.ex01;

import java.awt.*;
import java.util.Random;

/**
 * Demonstration von Bällen.
 */
public class DemoBalls {

    public static void main(final String[] args) {
        final String[] color = {"red", "black", "blue", "yellow", "green", "magenta"};
        Canvas canvas = new Canvas("canvas", 600, 400, Color.WHITE);
        for (int i = 0; i <= (new Random().nextInt(50) + 10); i++) {
            final Thread thread = new Thread(new Ball(), "Ball " + i);
            thread.start();
        }
    }
}
