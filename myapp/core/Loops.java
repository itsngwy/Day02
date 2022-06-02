package myapp.core;

public class Loops {

    public static void main(String[] args) {

        for(int i = 0; i < args.length; i++) {

            System.out.printf("i = %d, Value: %s\n", i, args[i]);
        }
    }
    
}
