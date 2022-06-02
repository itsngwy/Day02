package myapp.core;

import java.io.Console;

public class WLoopsSum {

    public static void main(String[] args) {

        Console cons = System.console();

        int values = 0;

        boolean notEmpty = true;

        while (notEmpty) {

            String input = cons.readLine("Please enter a text. Blank to end: ");

            if (input.length() > 0) {
                System.out.printf(">>> %s\n", input.toUpperCase());
                values += Integer.parseInt(input);

            }
            else {
                notEmpty = false;
            }
        }
        System.out.printf("The sum is: %d\n", values);
    }
    
}
