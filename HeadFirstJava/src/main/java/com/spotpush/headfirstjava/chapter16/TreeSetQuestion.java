package com.spotpush.headfirstjava.chapter16;

import java.util.TreeSet;

/**
* TreeSetQuestion code from Head First Java - Chapter 16
* 
* 1 - What is the result of this code?
* 2 - If it compiles, what is the result when run?
* 3 - If there is a problem at compile-time and/or run-time how would you fix it?
* 
* @author Stephen Hardy @ spotpush.com
*/

public class TreeSetQuestion {

    public static void main(String[] args) {
    
        new TreeSetQuestion().go();
    }
    
    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remox your Body");
        Book b3 = new Book("Finding Emo");
        
        TreeSet<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
    
    class Book {
        String title;
        public Book(String t) {
            title = t;
        }
    }
}
