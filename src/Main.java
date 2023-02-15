import java.util.Scanner;
class CalculateG {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        int fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;


// Add the formulas for position and velocity
        finalVelocity = ((gravity * fallingTime) + initialVelocity) / fallingTime;
        finalPosition = 0.5 * gravity * fallingTime + initialVelocity * finalVelocity + initialPosition;

        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
// Add output line for velocity (similar to position)
        System.out.println("The object's velocity after" + fallingTime + "second is" + finalVelocity + "m.");

Multiplication();
Square();
Summation();
    }

    public static void Multiplication() {
        int Num1;
        int Num2;
        int Multiplication;

        Scanner Multiplicationinput = new Scanner(System.in);


        System.out.println("Enter the first number:");
        Num1 = Multiplicationinput.nextInt();
        System.out.println("Enter the Second number:");
        Num2 = Multiplicationinput.nextInt();
        Multiplication = Num1 * Num2;
        System.out.println("Multiplication answer is:"+Multiplication);

    }

     public static void Square() {
         int Num1;
         int Num2;
         int square;
         Scanner squareinput = new Scanner(System.in);
         System.out.println("Enter the first number:");
         Num1 = squareinput.nextInt();
         square = Num1 * Num1;
         System.out.println("The square answer is:"+square);
     }
     public  static void Summation() {
        int Num1;
        int Num2;
        int Sum;
        Scanner Suminput=new Scanner(System.in);
         System.out.println("Enter the first number:");
         Num1=Suminput.nextInt();
         System.out.println("Enter the Second number:");
         Num2=Suminput.nextInt();
         Sum=Num1+Num2;
         System.out.println("The summation answer is:"+Sum);
    }
}



