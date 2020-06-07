
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    //constructor for class "TextUI"
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            //asks the user for input
            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            //if input is equal to "end", the program stops running
            if (command.equals("end")) {
                break;
            }

            doCommand(command);
            System.out.println("Bye bye!");
        }
    }

    //method that asks the user what action to take
    public void doCommand(String command) {
        if (command.equals("add")) {
            add();
        }
        if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    //method that adds the word and its translation to the dictionary
    public void add() {
        //asks the user to input the word
        System.out.println("Word: ");
        String word = this.scanner.nextLine();
        //asks the user to input the translation for given word
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        //adds word and its translation to the dictionary
        this.dictionary.add(word, translation);
    }

    //method that translates the given word
    public void search() {
        //asks the user for word to be translated
        System.out.println("To be translated: ");
        String wordToTranslate = this.scanner.nextLine();
        //prints out the tranlsation of the given word if it is found
        if (this.dictionary.translate(wordToTranslate) == null) {
            System.out.println("Word " + wordToTranslate + " was not found.");
        } else {
            System.out.println(this.dictionary.translate(wordToTranslate));
        }
        //if the input is none of this things, returns the given message
    }

}
