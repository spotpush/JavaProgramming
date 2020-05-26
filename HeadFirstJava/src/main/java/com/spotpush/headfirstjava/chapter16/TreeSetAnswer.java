package com.spotpush.headfirstjava.chapter16;

import java.util.TreeSet;

/**
* TreeSet elements must be Comparable.  You have to tell TreeSet how to sort
* Either one of the following must be true:
* 1 - Elements in a list must be of a type the implements Comparable
* 2 - You use the TreeSet's overloaded constructor that takes a comparator
* @author Stephen Hardy @ spotpush.com
*/

public class TreeSetAnswer {

    public static void main(String[] args) {
    
        new TreeSetAnswer().go();
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
    
    class Book implements Comparable {
        String title;
        public Book(String t) {
            title = t;
        }
        @Override
        public int compareTo(Object b) {
            Book book = (Book) b;
            return (title.compareTo(book.title));
        }
    }
}

