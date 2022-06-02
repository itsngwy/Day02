package myapp.core;

public class SumAll {
    
    public static void main(String[] args) {

        int sums = 0;
        for (int i = 0; i < args.length; i++){
            int values = Integer.parseInt(args[i]);
            sums = sums + values;
            System.out.printf("The sum is: %d\n", sums);
        }
        //System.out.printf("The sum is: %d\n", sums);
    }
}
