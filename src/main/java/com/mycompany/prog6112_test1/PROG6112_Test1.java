package com.mycompany.prog6112_test1;
import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class PROG6112_Test1 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // System.in = keyboard input

        //  2D ARRAY REPORT GENERATION//
        // Arrays: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
        String[] cities = {"CPT", "PE", "Pretoria"};
        String[] matrixConsoles = {"PS5", "XBOX", "SWITCH"};
        // 2D array: each row is a city, each column is a console (PS5, XBOX, SWITCH)
        int[][] regionalSales = {
            {1000, 2000, 3000}, // CPT
            {2000, 3000, 4000}, // PE
            {1500, 1100, 1200}  // Pretoria
        };

        System.out.println("          NUMBER 1 ELECTRONICS REPORT            ");
        // printf formats output. %-12s = left-aligned string, 12 chars wide; %-10d = left-aligned integer.
        // Format syntax: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax
        System.out.printf("%-12s %-10s %-10s %-10s %-10s\n", "CITY", "PS5", "XBOX", "SWITCH", "TOTAL");
     

        int grandTotal = 0;
        // Outer for loop goes through each city (row).
        // Docs: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
        for (int i = 0; i < regionalSales.length; i++) {
            int cityTotal = 0;
            System.out.printf("%-12s ", cities[i]);

            // Inner loop goes through each console (column) in the current row
            for (int j = 0; j < regionalSales[i].length; j++) {
                System.out.printf("%-10d ", regionalSales[i][j]);
                cityTotal += regionalSales[i][j]; // running total for this city
            }
            grandTotal += cityTotal; // add city total to the overall total
            System.out.printf("%-10d\n", cityTotal);
        }
      
        System.out.printf("%-45s %-10d\n", "GRAND TOTAL SALES:", grandTotal);
        


        //  INTERACTIVE CUSTOM STORE ENTRY //
        System.out.println(" Store Console Device Sales Entry ");

        // Console Device Type Selection
        System.out.println("Select a console device type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");
        System.out.print("Enter choice (1-3): "); // FIXED: was System.print, which does not exist
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear the leftover newline so the next nextLine() works correctly

        // switch statement picks a value based on the user's choice.
        // Docs: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
        String selectedConsole = "";
        switch (choice) {
            case 1: selectedConsole = "PS5"; break;
            case 2: selectedConsole = "XBOX"; break;
            case 3: selectedConsole = "NINTENDO SWITCH"; break;
            default: selectedConsole = "Unknown Console"; break;
        }

        // Store Name Entry (nextLine reads a whole line, including spaces)
        System.out.print("Enter the store name: ");
        String customStoreName = scanner.nextLine();

        // Total Sales Entry
        System.out.print("Enter the total amount of sales: ");
        int customSalesAmount = scanner.nextInt();

        // Instantiate subclass object and print user data.
        // Creating objects: https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html
        ConsoleSales storeReport = new ConsoleSales(selectedConsole, customStoreName, customSalesAmount);
        storeReport.printReport();

        scanner.close(); // Release the input resource
    }
    
}