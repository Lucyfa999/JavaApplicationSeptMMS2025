import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double grossSales = 0.0;
        
        System.out.print("Enter item number sold (1-4, or 0 to finish): ");
        int item = input.nextInt();
        
        while (item != 0) {
            switch (item) {
                case 1: grossSales += 239.99; break;
                case 2: grossSales += 129.75; break;
                case 3: grossSales += 99.95;  break;
                case 4: grossSales += 350.89; break;
                default: System.out.println("Invalid item number!"); break;
            }
            System.out.print("Enter next item number sold (1-4, or 0 to finish): ");
            item = input.nextInt();
        }
        
        double earnings = 200.00 + (grossSales * 0.09);
        System.out.printf("%nTotal Gross Sales: $%.2f%n", grossSales);
        System.out.printf("Salesperson Earnings: $%.2f%n", earnings);
    }
}
