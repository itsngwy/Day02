package myapp.core;

import java.io.Console;
import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Console cons = System.console();

        boolean notEmpty = true;

        List<String> cartList = new LinkedList<String>();

        System.out.println("Welcome to your shopping cart");

        while (notEmpty) {

            String input = cons.readLine("> ");
            String[] myInput = input.split(" ");


            if (input.length() > 0) {
                
                if (myInput[0].equals("list")){
                    // Print my cart
                    if (cartList.size() == 0){
                        System.out.println("Your Cart is empty!");
                    }
                    for (int i = 0; i < cartList.size(); i++){
                        System.out.print(i + 1 + " . ");
                        System.out.println(cartList.get(i));
                    }
                    
                }
                else if (myInput[0].equals("add")){
                    // I add into my cart
                    for (int i = 1; i < myInput.length; i++) {
                        cartList.add(myInput[i]);
                        System.out.printf("%s added to cart\n", myInput[i]);
                    }
                }
                else if (myInput[0].equals("delete")) {

                    int myDelInput = Integer.parseInt(myInput[1]);
                    String nameRemoved = cartList.get(myDelInput - 1);
                    cartList.remove(myDelInput - 1);
                    System.out.printf("%s is removed from cart\n", nameRemoved);
                    }
                    
                }
                else {
                    notEmpty = false;
                }

            }

        System.out.printf("No inputs");
    }

        
}
    

