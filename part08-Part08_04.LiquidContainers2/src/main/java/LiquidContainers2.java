
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //creates two Container objects
        Container first = new Container();
        Container second = new Container();

        //user adds, moves or removes liquid from Container objects
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            //program stops on "quit" command
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            //user input is split into pieces - command and amount
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            //command that adds amount to first container
            if (input.equals("add") && amount > 0) {
                first.add(amount);
            }

            //command that moves amount from first to second container
            if (input.equals("move") && amount > 0) {
                first.move(amount, second);
            }

            //command that removes amount from second container
            if (input.equals("remove") && amount > 0) {
                second.remove(amount);
            }

            System.out.println("");
        }
    }
}
