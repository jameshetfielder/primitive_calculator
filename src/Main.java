import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, selection;
        int result;
        System.out.println("\n1-Addition(+)\n2-Subtraction(-)\n3-Multiplication(*)\n4-Division(%) \nSelect a transaction: ");
        selection = input.nextInt();

        if (selection > 4 ){
            System.out.print("Selection out of range. \nPlease restart the program.");
        }
        else if (selection < 1){
            System.out.print("Selection out of range. \nPlease restart the program.");
        }
        else {
            System.out.print("Enter a number: ");
            n1 = input.nextInt();
            System.out.print("Enter a number: ");
            n2 = input.nextInt();
            if (selection == 1) {
                result = n1 + n2;
                System.out.print("Addition: " + result);
            }
            else if (selection == 2) {
                result = n1 - n2;
                System.out.print("Subtraction: " + result);
                if (n1 < n2) {
                    result *= -1;
                    System.out.print("Subtraction: " + result);

                }

            }
            else if (selection == 3) {
                result = n1 * n2;
                System.out.print("Multiplication: " + result);
            }
            else {
                if ((n1 > n2) && n2 != 0){
                    result = n1 / n2;
                    System.out.print("Division: " + result);
                }
                else if(n2 == 0){
                    System.out.print("A number can't divine by 0. \nPlease restart program.");
                }
            }
        }
        }
    }

