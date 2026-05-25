// 3. Write a Java program that accepts name, age, address
// and formats the data properly

import java.util.Scanner;

public class UserInformation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.println("\n----- USER INFORMATION -----");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Address : " + address);
    }
}