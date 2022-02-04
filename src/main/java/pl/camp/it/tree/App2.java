package pl.camp.it.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a;
        while(true) {
            try {
                a = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("to nie jest liczba !!");
            }
        }

        while(true) {
            String character;
            while(true) {
                character = br.readLine();
                if(character.equals("+") ||
                        character.equals("*") ||
                        character.equals("-") ||
                        character.equals("/") ||
                        character.equals("")) {
                    break;
                } else {
                    System.out.println("Pdaj znak operacji (+,-,*,/) lub zakończ (enter)");
                }
            }
            if(character.equals("")) {
                break;
            }
            int b;
            while(true) {
                try {
                    b = Integer.parseInt(br.readLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("to nie jest liczba !!");
                }
            }
            switch (character) {
                case "+":
                    a = a + b;
                    break;
                case "-":
                    a = a - b;
                    break;
                case "*":
                    a = a * b;
                    break;
                case "/":
                    a = a / b;
                    break;
            }
            System.out.println(a);
        }
    }
}
