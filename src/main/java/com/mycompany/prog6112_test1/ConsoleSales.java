package com.mycompany.prog6112_test1;

/**
 *
 * @author emeris
 */
//Constructor passing parameters to superclass
public class ConsoleSales extends console
{
  // Constructor passing parameters to the superclass using super(...).
    // Docs: https://docs.oracle.com/javase/tutorial/java/IandI/super.html
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print individual store input report.
    // System.out.println docs: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/PrintStream.html
    public void printReport() {
        System.out.println("   STORE CONSOLE DEVICE REPORT   ");
        System.out.println("Store Name:        " + getStore());
        System.out.println("Console Type:      " + getConsoleType());
        System.out.println("Total Sales (R):   " + getTotalSales());
   
    }
}
