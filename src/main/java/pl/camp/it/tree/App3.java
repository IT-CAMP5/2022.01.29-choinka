package pl.camp.it.tree;

import java.util.Random;

public class App3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(21);
        System.out.println(randomNumber - 10);
    }
}
