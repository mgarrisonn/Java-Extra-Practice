package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {
        return sc.nextLine();
    }

    public boolean yesNo() {
        String input = getString();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Invalid input");
            sc.next();
            return getInt();
        }
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max){
            return userInt;
        } else {
            System.out.println("please enter an integer in the correct range between " + min + " " + "and " + max);
            return getInt(min, max);
        }
    }

    public double getDouble(){
        if (sc.hasNextDouble()){
            return sc.nextDouble();
        } else {
            System.out.println("Invalid input");
            sc.next();
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max){
            return userDouble;
        } else {
            System.out.println("please enter an integer in the correct range between " + min + " " + "and " + max);
            return getDouble(min, max);
        }
    }


    public static void main(String[] args) {
        Input in = new Input();

//        System.out.println("Please enter your favorite word");
//        String favWord = in.getString();
//        System.out.println(favWord);
//
//        System.out.print("Will you continue? ");
//        boolean yesNo = in.yesNo();
//        System.out.println(yesNo);
//
//        System.out.print("Please enter a whole number");
//        int num = in.getInt();
//        System.out.println("You entered: " + num);
//
        System.out.print("Please enter a whole number between 1 and 10: ");
        int numInRange = in.getInt(1, 10);
        System.out.println("You entered " + numInRange);

    }

}


