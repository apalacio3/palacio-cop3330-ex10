/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SelfCheckout
{
    public static void main( String[] args) {
        Double subtotal = findSubtotal();

        double tax = 0.055 * subtotal;
        double total = subtotal + tax;

        DecimalFormat d = new DecimalFormat("#.##");

        String output = "Subtotal: $" + d.format(subtotal)
            + "\nTax: $" + d.format(tax)
            + "\nTotal: $" + d.format(total);

        System.out.print(output);
    }

    public static double findSubtotal()
    {
        System.out.print("Enter the price of item 1: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        double firstPrice = Double.parseDouble(a);

        System.out.print("Enter the quantity of item 1: ");
        String b = input.nextLine();
        double firstQuantity = Double.parseDouble(b);

        System.out.print("Enter the price of item 2: ");
        String c = input.nextLine();
        double secondPrice = Double.parseDouble(c);

        System.out.print("Enter the quantity of item 2: ");
        String d = input.nextLine();
        double secondQuantity = Double.parseDouble(d);

        System.out.print("Enter the price of item 3: ");
        String e = input.nextLine();
        double thirdPrice = Double.parseDouble(e);

        System.out.print("Enter the quantity of item 3: ");
        String f = input.nextLine();
        double thirdQuantity = Double.parseDouble(f);

        return (firstPrice*firstQuantity) + (secondPrice*secondQuantity) + (thirdPrice*thirdQuantity);
    }
}