/*
In this exercise, we'll be working with files stored in CSV format. 
Each line of the file contains the home team, visiting team, home team points, and visiting team points, all separated by commas.

Write a program that prompts the user for a filename, after which it reads the match statistics from the file. 
The program then prompts the user for the name of a team, and prints the data specified in the following parts for that team.

PART1: Implement the ability to output the number of games played by any given team. We're using the above-mentioned data.csv file.

PART2: Extend the program so that it has the ability to print the number of wins and losses of a given team. 
The winner of a game is the team that has gained more points from it.
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks for the file name
        System.out.println("File: ");
        String file = scanner.nextLine();

        //asks for the name of the team
        System.out.println("Team: ");
        String team = scanner.nextLine();
        int gamesCount = 0;
        int wins = 0;
        int loses = 0;

        //reades all lines from the file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String item = reader.nextLine();

                //splits the lines with semicolon, adds home and away teams and home and away points
                String[] parts = item.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);

                //finds out the amount of games the team has played
                if (team.equals(homeTeam) || team.equals(awayTeam)) {
                    gamesCount++;
                }

                //finds out the amount of games team has won and lost as home team
                if (team.equals(homeTeam) && homePoints > awayPoints) {
                    wins++;
                } else if (team.equals(homeTeam) && homePoints < awayPoints) {
                    loses++;
                }

                //finds out the amount of games team has won and lost as away team
                if (team.equals(awayTeam) && awayPoints > homePoints) {
                    wins++;
                } else if (team.equals(awayTeam) && awayPoints < homePoints) {
                    loses++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }
        //prints out the amount of games, wins and loses that the team has
        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
    }

}
