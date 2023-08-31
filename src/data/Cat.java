package data;

import java.util.Random;

public class Cat extends Pet{
    public static final double MAX_SPEED = 50;
    public Cat(String id, String name, int yob, double weigth) {
        super(id, name, yob, weigth);
    }
    
    
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    @Override
    public void showProile() {
        // Chỉnh định dạng khi in ra
        String msg;
        msg = String.format("|%-6s|%-15s|%4d|%4.1f|%4.1f|", 
                id, name, yob, weigth, run());
        
        System.out.println(msg);
    }



}
