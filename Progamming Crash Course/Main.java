import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    /* 
      Variables declaration ->   declareType declareName = value
    */

    /* Integer (Whole Number) */
    static int age = 27;

    /* 
     * Floating point number
     * Float -> Stores to 7 decimal digits
     * Double -> stores to 15 decimal digits.
    */
    static float height = 183.5f;

    /* String is a collection of characters */
    static String name = "Nima";

    /* char represent a character */
    static char nameInitials = 'n';

    /* Boolean represent a true or false value */
    static boolean isWorking = true;

    /* Data Structure */
    /* Array is fixed size and can't be changed */
    //static int[] numbersArray = new int[4];
    static int[] numbersArray = {1,2,3,4};

    //static List<String> items = new ArrayList<String>();
    static List<String> items = new ArrayList<String>(Arrays.asList("Laptop","Mouse","Keyboard"));
    public static void main(String[] args) {
      //Put methods here
    }

    static void NestedForLoop(){
      for(int i=1; i<=2; i++){
        System.out.println("Outer: " + i); //Executes 2 times
        for(int j=1; j <= 3; j++){
          System.out.println(" Inner: " + j);//Executes 6 times (3 * 2)
        }
      }
    }

    static void SettingArrayItemValue(){
      // numbersArray[index] = value;
    }

    static void AddingAndRemovingItemsFromList(){
      //items.add(index, "value");
      //items.remove(index);
      //items.set(index, "value");
    }

    static void AddsArrayElements(int[] Array){
        int sum = 0;
        for(int i=0; i<Array.length; i++){
          sum = sum + numbersArray[i]; 
        }
        System.out.println("Sum of all elements in array is equal to " + sum);
    }

    static void DayFinder(int day){
      switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
            System.out.println("Tuesday");
          break;
        case 3:
        System.out.println("Wednesday");
          break;
        case 4:
        System.out.println("Thursday");
          break;
        default:
        System.out.println("Could not find the day");
          break;
      }
      // if(day == 1){
      //   System.out.println("Monday");
      // } else if (day == 2){
      //   System.out.println("Tuesday");
      // } else if (day == 3){
      //   System.out.println("Wednesday");
      // } else if (day == 4){
      //   System.out.println("Thursday");
      // } else {
      //   System.out.println("Could not find the day");
      // }
    }

    private static void CheckWithNumberIsBigger(int a , int b){;
      if(a > b){  
        System.out.println(a + " is bigger than " + b);
      } else if (a < b){
        System.out.println(b + " is bigger than " + a);
      } else {
        System.out.println(a + " is equal to " + b);
      }
    }

    static void PrintNumbers(){
      System.out.println(1);
      System.out.println(2);
      System.out.println(3);
      System.out.println(4);
    }

    static int AddingNumber(){
      int a = 5;
      int b = 10;
      int result = a + b;
      return result;
    }  
}

