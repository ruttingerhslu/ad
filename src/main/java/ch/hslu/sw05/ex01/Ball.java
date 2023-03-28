package ch.hslu.sw05.ex01;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Description of class Ball
 */
public class Ball implements Runnable {

    private final Circle ball;

    public Ball() {
        this.ball = new Circle(randomSize(), randomX(), 0, randomColour());
    }

    private static int randomSize() {
        return (new Random().nextInt(20) + 30);
    }

    private static int randomX() {
        return (new Random().nextInt(575) + 25);
    }

    private static String randomColour() {
        ArrayList<String> colours = new ArrayList<>(
                List.of("red", "black", "blue", "yellow", "green", "magenta")
        );
        return colours.get(new Random().nextInt(colours.size() - 1));
    }

    private static int randomSpeed() {
        return (new Random().nextInt(10) + 1);
    }


    @Override
    public void run() {
        ball.makeVisible();
        int speed = randomSpeed();
        while (ball.getY() <= 400) {
            ball.moveVertical(speed);
        }
        ball.makeInvisible();    }
}
