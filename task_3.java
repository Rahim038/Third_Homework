package Homework_number_3;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "read a book for thirty minutes";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "do a little bit yoga to relax";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "programming time";
        schedule[5][0] = "Friday";
        schedule[5][1] = "meet friends and have coffee with them";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "go for a run/walk, ride a bike";

        Scanner in = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.print("Please, input the day of the week: ");
            String day = in.next();
            String str = day.replaceAll("\\s","");
            str = str.toLowerCase();
            str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

            switch (str){
                case "Sunday":
                    System.out.println("Your tasks for Sunday: " + schedule[0][1]);
                    break;
                case "Monday":
                    System.out.println("Your tasks for Monday: " + schedule[1][1]);
                    break;
                case "Tuesday":
                    System.out.println("Your tasks for Tuesday: " + schedule[2][1]);
                    break;
                case "Wednesday":
                    System.out.println("Your tasks for Wednesday: " + schedule[3][1]);
                    break;
                case "Thursday":
                    System.out.println("Your tasks for Thursday: " + schedule[4][1]);
                    break;
                case "Friday":
                    System.out.println("Your tasks for Friday: " + schedule[5][1]);
                    break;
                case "Saturday":
                    System.out.println("Your tasks for Saturday: " + schedule[6][1]);
                    break;
                case "Exit":
                    run = false;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}