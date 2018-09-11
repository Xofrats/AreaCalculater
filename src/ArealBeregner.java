import cirkle.Cirkle;
import firkant.Firkant;
import trekant.Trekant;
import java.util.Scanner;

public class ArealBeregner {

    public static void main(String[] args){

      defineShape();

    }

    public static void defineShape(){

        boolean runProgram = true;

        System.out.println("Welcome to user input test");

        while (runProgram == true){
        Scanner input = new Scanner(System.in);


        System.out.println("What shape would you like to calculate the are of?");
            System.out.println("I know triangle circle and square");
        String answer = input.nextLine();

        switch (answer) {
            case "triangle":
                System.out.println("I know that");
                defineTriangle();


                break;

            case "circle":
                System.out.println("Circle eh? I can do that");
                defineCircle();

                break;

            case "square":
                System.out.println("A simple square? cool cool");
                 break;

            default:
                System.out.println("I do not know that shape");
        }

            System.out.println("would you like to calculate another shape? press 1 for yes, 2 for no ");
             int again = input.nextInt();
            if (again == 2){

                runProgram = false;
        }
        if (again == 1)
            {
                runProgram = true;
            }
    }



    }

    private static void defineTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter what height the triangle got");
        double height = input.nextDouble();
        System.out.println("now enter the base line");
        double base = input.nextDouble();
        System.out.println("if it's a pyramid enter the length below. If not enter 0");
        double length = input.nextDouble();
        System.out.println("okay the area is ");
        Trekant trekant = new Trekant(height, base, length);
        System.out.println("the area is " + trekant.getArea());
    }

    private static void defineCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how long the radius is");
        double radius = input.nextDouble();

        System.out.println("is it a circle or a sphere? type 1 or 2");

        int shape = input.nextInt();
        if (shape == 1){
            Cirkle circle = new Cirkle(radius);
            System.out.println("the area is " + circle.getAreaCirkle());

        }

        if (shape == 2){
            Cirkle circle = new Cirkle(radius);
            System.out.println("the volume is " + circle.getAreaSphere());
        }
    }

    private static void defineSquare() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how high the square is");
        int height = input.nextInt();
        System.out.println("now enter the width");
        int base = input.nextInt();
        System.out.println("is it a box? if so enter the length. If not enter 0");
        int length = input.nextInt();
        System.out.println("okay the area is ");
        Firkant firkant = new Firkant(height, base, length);
        System.out.println("the area is " + firkant.getArea());
    }
}
