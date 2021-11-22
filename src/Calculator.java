import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class Calculator
{
    public  static void  main(String[] args)
    {
        Double value1;
        Double value2;
        char mark;      // Variable with the mark of operation
        Scanner value = new Scanner(System.in);   // Enter values by Scanner

        System.out.println("Enter first number:");


        try {
            value1 = value.nextDouble();
            System.out.println("Enter second number:");
        } catch (InputMismatchException ex) { // If User entered incorrect value type
            System.out.println("Incorrect value. Try again and enter NUMBER !");  // String information User of incorrect type value
            value.next(); // User must again enter the value
            value1 = value.nextDouble();
        }

        try {
            value2 = value.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Incorrect value! Try again and enter NUMBER !");
            value.next();
            value2 = value.nextDouble();
        }
        System.out.println("Chose the action type: \n\n1. Add           2. Substraction          3. Multiplication   \n4. Divide        5. Rest of the divide    6. Power    \n7. Square root   8. Sine                  9. Cosine");

        mark = value.next().charAt(0);  // Getting the mark from User
        switch (mark)     // Do the operation from getting mark
        {
            case '1':    // Add
            {
                System.out.println("The result of the action is = " + (value1 + value2));
                break;
            }
            case '2':    // Subtraction
            {
                System.out.println("The result of the action is = " + (value1 - value2));
                break;
            }
            case '3':    // Multiplication
            {
                System.out.println("The result of the action is = " + (value1 * value2));
                break;
            }
            case '4':   // Divide
            {
                if (value1 == 0)  //Checking if the entered value isn't 0
                    {
                        System.out.println("Don't divide by the zero !!!");
                        System.out.println("Enter first value again:");
                        value1 = value.nextDouble();
                    }
                    if (value2 == 0)
                        {
                            System.out.println("Don't divide by the zero !!!");
                            System.out.println("Enter second value again:");
                            value.nextDouble();
                        }
                        else
                            {
                                System.out.println("The result of the action is = " + (value1 / value2) + "\n");
                            }break;
            }
            case '5':
            {
                if (value1 == 0)  //Checking if the entered value isn't 0
                    {
                        System.out.println("Don't divide by the zero !!!");
                        System.out.println("Enter first value again:");
                        value1 = value.nextDouble();
                    }
                    if (value2 == 0)
                        {
                            System.out.println("Don't divide by the zero !!!");
                            System.out.println("Enter second value again:");
                            value.nextDouble();
                        }
                        else
                        {
                        System.out.println("The result of the action is = " + (value1 % value2));
                        } break;
            }
            case '6':    // Power v1^v2
            {
                double power = pow(value1, value2);
                System.out.println("The result of the action is = " + (power));
                break;
            }
            case '7':    // Sqrt = sqrtV1 + sqrtV2
            {
                    double sqrt = sqrt(value1) + sqrt(value2);
                    System.out.println("The result of the action is = " + (sqrt));
                    break;
            }
            case '8':    // Sine of value1 and value2 in radians
            {
                double radians1 = toRadians(value1);
                double radians2 = toRadians(value2);
                System.out.println("The Sine of " + value1 + " degrees is  " + sin(radians1));
                System.out.println("The Sine of " + value2 + " degrees is  " + sin(radians2));
                break;
            }
            case '9':    // Cosine of value1 and value2 in radians
            {
                double radians1 = toRadians(value1);
                double radians2 = toRadians(value2);
                System.out.println("The Cosine of " + value1 + " degrees is  " + cos(radians1));
                System.out.println("The Cosine of " + value2 + " degrees is  " + cos(radians2));
                break;
            }
                default:
                System.out.println("Chose the correct character ");
                break;
       }     
    }
}
