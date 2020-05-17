/*
The program described here should be implemented in the class PersonalInformationCollection. NB! Do not modify the class PersonalInformation.
After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.
Then print the collected personal information so that each entered object is printed in the following format: 
first and last names separated by a space (you don't print the identification number).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //enters the first name
            System.out.println("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }
            //enters the last name
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();

            //enters the identification number
            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();

            //adds the informations to new objects
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        //prints out personal information - first and last name without id number
        for (PersonalInformation item : infoCollection) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }
    }
}
