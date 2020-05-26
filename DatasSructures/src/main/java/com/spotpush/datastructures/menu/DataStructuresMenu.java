package com.spotpush.datastructures.menu;

import static java.lang.System.exit;
import java.util.Scanner;

/**
* Controls Data Structures Program
* @author Stephen Hardy @ spotpush.com
*/
public class DataStructuresMenu {
    public static void main(String[] args) {
        Scanner usrObj = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Data Structures ==========");
        System.out.println("1 - Arrays");
        System.out.println("2 - Graphs");
        System.out.println("3 - HashTable");
        System.out.println("4 - LinkedList");
        System.out.println("5 - Queue");
        System.out.println("6 - Set");
        System.out.println("7 - Stack");
        System.out.println("8 - Trees");
        System.out.println("9 - Tries");
        System.out.println("10 - EXIT Program");
        System.out.println("Please select from the above: ");
        do {      
            int option = usrObj.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    exit(0);
                default: 
                    System.out.println("Invalid option...");
                }//end switch
        }while(!exit);
    } //end main
}//end class
