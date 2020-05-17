/*
In the exercise template there is a ready-made class TelevisionProgram, representing a television program. 
The class has object variables name and duration, a constructor, and a few methods.

Implement a program that begins by reading television programs from the user. 
When the user inputs an empty string as the name of the program, the program stops reading programs.

After this the user is queried for a maximum duration. Once the maximum is given, 
the program proceeds to list all the programs whose duration is smaller or equal to the specified maximum duration.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            //enters the tv program's name
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            //enters tv program's name
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            //adds new TelevisionProgram items to the list "programs"
            programs.add(new TelevisionProgram(name, duration));
        }
        //enters the program's maximum duration
        System.out.println("Program's maximum duration: ");
        int maxDuration = scanner.nextInt();

        //prints out the programs whose duration is equal or smaller than specified maximum duration
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
