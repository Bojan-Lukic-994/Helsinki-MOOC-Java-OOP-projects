/*
The gourmet restaurant 'Unicafe' on the Kumpula campus of the University of Helsinki needs a new menu. 
The chef knows about programming and wants a computer system to manage the menu. 
In this assignment, we'll implement the heart of the system, the Menu class.
The exercise template comes with a Main class that you can use to test the menu.

The menu object has an ArrayList as an instance variable to store the names of the dishes on the menu. 
The menu should provide the following methods:
public void addMeal(String meal) adds a meal to the menu. If the meal is already on the list, it should not be added again.
public void printMeals() prints the meals.
public void clearMenu() clears the menu

PART1: Implement the public void addMeal(String meal) method, which adds a new meal to the meals list. 
If the meal you want to add is already on the list, you shouldn't add it again. 
The list method contains is handy for checking an items existence on it.
*/
public class Main {
    public static void main(String[] args) {
          Menu exactum = new Menu();
        
        // When you have completed the method addMeal(String meal)
        // You can delete the comments below
        

        exactum.addMeal("Smoked salmon, white wine and butter sauce with basil");
        exactum.addMeal("Seasonal green salad with apple-honey vinegarette");
        exactum.addMeal("Roasted lamb in a red wine sauce");
        
        // When you have completed the method printMeals()
        // you can remove the comment below
        
        exactum.printMeals();
        
        // When you have completed the method clearMenu()
        // you can remove the comments below
        exactum.clearMenu();
        exactum.printMeals();
    }
}
