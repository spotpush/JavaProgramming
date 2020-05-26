package com.spotpush.map.sortedmap.navigablemap.TreeMap;

import static java.lang.System.exit;
import java.util.Scanner;

/**
* Menu for accessing TreeMap Exercises
* @author Stephen Hardy @ spotpush.com
*/

public class TreeMapExercisesMenu {

    public static void main(String[] args) {
    Scanner usrObj = new Scanner(System.in);
        boolean exit = false;
        System.out.println("TreeMap Exercises ==========");
        System.out.println("1 - Write a Java program to associate the specified "
                + "value with the specified key in a Tree Map.");
        System.out.println("2 - Write a Java program to copy a Tree Map content "
                + "to another Tree Map.");
        System.out.println("3 - Write a Java program to search a key in a Tree Map.");
        System.out.println("4 - Write a Java program to search a value in a Tree Map.");
        System.out.println("5 - ");
        System.out.println("6 - ");
        System.out.println("7 - ");
        System.out.println("8 - ");
        System.out.println("9 - ");
        System.out.println("10 - ");
        System.out.println("11 - ");
        System.out.println("12 - ");
        System.out.println("13 - ");
        System.out.println("14 - ");
        System.out.println("15 - ");
        System.out.println("16 - ");
        System.out.println("17 - ");
        System.out.println("18 - ");
        System.out.println("19 - ");
        System.out.println("20 - ");
        System.out.println("21 - ");
        System.out.println("22 - ");
        System.out.println("23 - ");
        System.out.println("24 - ");
        System.out.println("25 - ");
        System.out.println("26 - ");
        System.out.println("27 - ");
        System.out.println("28 - Create an Immutable TreeMap");
        System.out.println("29 - Display the tMap Comparator");
        System.out.println("30 - Create a Deep Copy of a TreeMap");
        System.out.println("31 - EXIT Program");
        System.out.println("Please select from the above: ");
        do {      
            int option = usrObj.nextInt();
            switch (option) {
                case 1:
                    TreeMapExercises.question1();
                    break;
                case 2:
                    TreeMapExercises.question2();
                    break;
                case 3:
                    TreeMapExercises.question3();
                    break;
                case 4:
                    TreeMapExercises.question4();
                    break;
                case 5:
                    TreeMapExercises.question5();
                    break;
                case 6:
                    TreeMapExercises.question6();
                    break;
                case 7:
                    TreeMapExercises.question7();
                    break;
                case 8:
                    TreeMapExercises.question8();
                    break;
                case 9:
                    TreeMapExercises.question9();
                    break;
                case 10:
                    TreeMapExercises.question10();
                    break;
                case 11:
                    TreeMapExercises.question11();
                    break;
                case 12:
                    TreeMapExercises.question12();
                    break;
                case 13:
                    TreeMapExercises.question13();
                    break;
                case 14:
                    TreeMapExercises.question14();
                    break;
                case 15:
                    TreeMapExercises.question15();
                    break;
                case 16:
                    TreeMapExercises.question16();
                    break;
                case 17:
                    TreeMapExercises.question17();
                    break;
                case 18:
                    TreeMapExercises.question18();
                    break;
                case 19:
                    TreeMapExercises.question19();
                    break;
                case 20:
                    TreeMapExercises.question20();
                    break;
                case 21:
                    TreeMapExercises.question21();
                    break;
                case 22:
                    TreeMapExercises.question22();
                    break;
                case 23:
                    TreeMapExercises.question23();
                    break;
                case 24:
                    TreeMapExercises.question24();
                    break;
                case 25:
                    TreeMapExercises.question25();
                    break;
                case 26:
                    TreeMapExercises.question26();
                    break;
                case 27:
                    TreeMapExercises.question27();
                    break;
                case 28:
                    TreeMapExercises.question28();
                    break;
                case 29:
                    TreeMapExercises.question29();
                    break;
                case 30:
                    TreeMapExercises.question29();
                    break;
                case 31:
                    exit(0);
                default: 
                    System.out.println("Invalid option...");
                }//end switch
        }while(!exit);
    }
}
