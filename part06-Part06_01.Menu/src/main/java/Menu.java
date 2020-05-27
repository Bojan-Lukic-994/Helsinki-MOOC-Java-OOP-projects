
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    //method that adds new meal to the list
    public void addMeal(String meal) {
        //if meal already exists in the menu, the program doesn't add it again
        if (this.meals.contains(meal)) {
            return;
            //adds new meal to the list
        } else {
            this.meals.add(meal);
        }
    }

    //method that prints the list of meals
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    //method that clears out the entire menu
    public void clearMenu() {
        this.meals.clear();
    }
}
