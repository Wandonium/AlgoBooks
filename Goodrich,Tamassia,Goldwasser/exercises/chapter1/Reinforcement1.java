/* 
 *  Write a short Java method, inputAllBaseTypes, that inputs a 
 * different value of each base type from the standard input device 
 * and prints it back to the standard output device.
 * 
 * Notes: 
 * Java basic type => boolean, char, byte, short, int, long, float, double
 */

import java.util.Scanner;

public class Reinforcement1 {
    public static void main(String[] args) {
        String[] arr = {"boolean", "char", "byte", "short", "int", "long", "float", "double"};
        for(String type: arr) {
            inputAllBaseTypes(type);
        }
    }

    public static void inputAllBaseTypes(String baseType) {
        Scanner input = new Scanner(System.in);
        switch(baseType) {
            case "boolean":
                System.out.print("Please enter a boolean type i.e either 'true' or 'false': ");
                boolean boolValue = input.nextBoolean();
                System.out.println("\nValue entered is: " + boolValue);
            break;
            case "char":
                System.out.print("Please enter a character (char) type e.g z or !: ");
                char charValue = input.next().toCharArray()[0];
                System.out.println("\nValue entered is: " + charValue);
            break;
            case "byte":
                System.out.print("Please enter a byte type e.g ALT 0119: ");
                byte byteValue = input.nextByte();
                System.out.println("\nValue entered is: " + byteValue);
            break;
            case "short":
                System.out.print("Please enter a short integer type e.g 123: ");
                short shortValue = input.nextShort();
                System.out.println("\nValue entered is: " + shortValue);
            break;
            case "int":
                System.out.print("Please enter an integer type e.g 254 ");
                int intValue = input.nextInt();
                System.out.println("\nValue entered is: " + intValue);
            break;
            case "long":
                System.out.print("Please enter a long integer type e.g 789678678890: ");
                long longValue = input.nextLong();
                System.out.println("\nValue entered is: " + longValue);
            break;
            case "float":
                System.out.print("Please enter a floating point type e.g 5.62: ");
                float floatValue = input.nextFloat();
                System.out.println("\nValue entered is: " + floatValue);
            break;
            case "double":
                System.out.print("Please enter a double type e.g 5.624723: ");
                double doubleValue = input.nextDouble();
                System.out.println("\nValue entered is: " + doubleValue);
            break;
        }
    }
}