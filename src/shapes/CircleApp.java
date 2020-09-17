package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args){
        Input in = new Input();

        boolean keepGoing = false;
        do {
            System.out.print("Please enter a number: ");
            double radius = in.getDouble();
            Circle c = new Circle(radius);
            System.out.println(c.getArea());
            System.out.println(c.getCircumference());
            System.out.println("Circle count is: " + Circle.getCircleCount());
            System.out.println("Want to continue?");
            keepGoing = in.yesNo();
            System.out.println(keepGoing);
        } while(keepGoing);
        System.out.println("Til Next Time!");
    }

}
