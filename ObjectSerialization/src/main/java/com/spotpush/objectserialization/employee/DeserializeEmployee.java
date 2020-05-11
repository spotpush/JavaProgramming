package com.spotpush.objectserialization.employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Stephen Hardy @ spotpush.com
*/

public class DeserializeEmployee {

    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject(); //readObject() method throws ClassNotfoundException
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        
        System.out.println("Deserialized Employee...");
        System.out.println("Name: "+e.name);
        System.out.println("Address: "+e.address);
        System.out.println("SSN: "+e.SSN);
        System.out.println("Number: "+e.number);
    }
}
