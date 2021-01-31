/*
In this exercise we are going to create a program that can be used to create and modify a to-do list.

PART1: 
Create a class called TodoList. It should have a constructor without parameters and the following methods:

public void add(String task) - add the task passed as a parameter to the todo list.
public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.
 
PART2:
Create a class called TodoList. It should have a constructor without parameters and the following methods:

public void add(String task) - add the task passed as a parameter to the todo list.
public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

    }
}
