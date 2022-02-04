package pl.camp.it.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        try {
            printChristmasTree();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printChristmasTree() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int treeHeight = Integer.parseInt(br.readLine());
        int rowSize = 2 * treeHeight - 1;

        for(int i = 1; i <= treeHeight; i++) {
            int rowStars = 2 * i - 1;
            StringBuilder sb = new StringBuilder();
            int spaces = rowSize - rowStars;
            int halfSpaces = spaces/2;
            for(int j = 0; j < halfSpaces; j++) {
                sb.append(" ");
                //System.out.print(" ");
            }
            for(int j = 0 ; j < rowStars; j++) {
                sb.append("*");
                //System.out.print("*");
            }
            /*for(int j = 0; j < halfSpaces; j++) {
                sb.append(" ");
                //System.out.print(" ");
            }*/
            System.out.println(sb.toString());
            //System.out.println();
        }
    }
}
