/**

*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.multithreading;

/*Imports*/

//create  a class thread_example1 which implemetns the runnable interface
//it must be implemented by any class whose instances are to the run by the thread
public class Thread_example1 implements Runnable 
{
    //its mandatory to override the run method in the runnable interface
    @Override
    public void run() {
        
    }
    //main method for executing the thread
    public static void main(String[] args) 
    {
        //create a new thread (thread1) by instantiating a new class thread
        Thread thread1 = new Thread();
        //creates a new tread (thread2) by instantiating a new class thread
        //with a given name "Thread Two" 
        Thread thread2 = new Thread("Thread Two");
        //start methos executes the thread1 instance of thread 
        thread1.start();
        try {
            //sleep method applied to the thread1 instance of thread
            //20000 milliseconds (20 seconds)
            thread1.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //sets the threads priority to 1 from whatever priotiry it was
        thread1.setPriority(1);
        //get the priority
        int priority = thread1.getPriority();
        //print the fetched priority
        System.out.println(priority);
        //thread is running
        System.out.println("Thread Running");
        //thread2 name
        System.out.println(thread2.getName());
        
    }
}
