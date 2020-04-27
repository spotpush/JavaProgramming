package com.spotpush.algorithms;
/**
 * There are three towers. The objective of the game is to move all the 
 * disks over to tower #3, but you can't place a larger disk onto a smaller 
 * disk. To play the game or learn more about the Tower of Hanoi, check 
 * the Resources tab.
 * 
 * Create a function that takes a number discs as an argument and returns the minimum 
 * amount of steps needed to complete the game.
 * 
 * towerHanoi(3) ➞ 7
 * towerHanoi(5) ➞ 31
 * towerHanoi(0) ➞ 0
 * 
 * @author Stephen Hardy @ spotpush.com
*/
import java.util.Scanner;
public class TowerOfHanoi {

    //recursive function - Tower of Hanoi 
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
    } 
      
    public static void main(String[] args) {
        Scanner usrObj = new Scanner(System.in);
        System.out.print("Number of Discs: ");
        int discs = usrObj.nextInt();
        towerOfHanoi(discs,'A','B','C');
    }
}
