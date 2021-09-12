/* Maytal Twig - 01.11.18
 * Maman 11 A
 * The program will read from the input 3 integers that
*represent the resistance of each of the resistors.
*The plan will calculate the overall resistance
*according to the formula.
*/

import java.util.Scanner;
public class Resistors
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);//creating a scannerobject
        System.out.println("Please enter 3 integers:");//getting data from uset
        System.out.println("Please enter r1:");
        int r1=scan.nextInt();
        System.out.println("Please enter r2:");
        int r2=scan.nextInt();
        System.out.println("Please enter r3:");
        int r3=scan.nextInt();
        
        double total;//create final score

        total=1/(1.0/r1+1.0/r2+1.0/r3);//calculation
                 
        System.out.println("The total resistance ofresistors "+r1+", "+r2+", and "+r3+" connected in parallel is: "+total);//print the answear
    }//end of method main
}//end of class Resistors
