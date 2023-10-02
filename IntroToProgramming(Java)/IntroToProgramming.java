import java.util.ArrayList;
import java.util.List;

public class IntroToProgramming {
    public static void main(String[] args) {
        /*Integer (whole number)*/
        int age = 24;

        /*
        Floating point number 
        float -> Sufficient for storing 6 to 7 decimal digits
        double -> Stores fractional numbers. Sufficient for storing 15 decimal digits
        */
        float height = 183.5f;

        /*Collection of characters*/
        String name = "Jake";

        /*Character */
        char myLetter = 'D'; 

        /*True or False*/
        boolean isPlayerAlive = true;

        /*Print Values*/
        System.out.println("Hello");

        /*Array is fixed size and can't be changed */
        String[] items = {"Sword", "Health item"};
        
        /*List is dynamic*/
        List<String> ListItems = new ArrayList<String>();
        /*Adding Element to list */
        ListItems.add(0, "Sword");
        ListItems.add(1, "Health Item");
        ListItems.add(2, "Magic Item");
        System.out.println(ListItems);
        /*Removing Element from list */
        ListItems.remove(0);
        System.out.println(ListItems);
        ListItems.set(1, "Health low");
        System.out.println(ListItems);

        /*If statement */
        if(isPlayerAlive == true){
            System.out.println("Player is Alive");
        } else {
            System.out.println("Player is Dead");
        }

        /*For Loop */
        // for(int i=0; i<5; i++){
        //     System.out.println(i);
        // }

        // for(int i=0; i<5; i = i+2){
        //     System.out.println(i);
        // }
        
        // int[] numbers = {1,2,3,4,5,6,7,8};

        // for(int i=0; i<numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }

        // for(int j = numbers.length - 1; j>= 0 ; j--){
        //         System.out.println(numbers[j]);
        // }


        /*Nested For Loop */
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
              System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 
    }
}
