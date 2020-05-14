
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String str = scan.nextLine();
       
        System.out.println("Give an integer:");
        int first = Integer.valueOf(scan.nextLine());
     
        System.out.println("Give a double:");
        double second = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean third = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + first);
        System.out.println("You gave the double " + second);
        System.out.println("You gave the boolean " + third);

    }
}
