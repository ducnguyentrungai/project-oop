package data;

import java.util.Random;

public class Dog extends Pet {
    private static final double MAX_SPEED = 60;

    public Dog(String id, String name, int yob, double weigth) {
        super(id, name, yob, weigth);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * Dog.MAX_SPEED;
    }

    @Override
    public void showProile() {
        String msg;
        msg = String.format("|%-6s|%-15s|%4d|%4.1f|%4.1f|", 
                id, name, yob, weigth, run());
        
        System.out.println(msg);
    }
    

}
