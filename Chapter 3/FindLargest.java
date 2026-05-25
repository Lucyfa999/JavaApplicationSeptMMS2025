import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE; // Handles negative entries safely
        
        while (counter <= 10) {
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();
            
            if (number > largest) {
                largest = number;
            }
            counter++;
        }
        System.out.printf("%nLargest integer found: %d%n", largest);
    }
}

