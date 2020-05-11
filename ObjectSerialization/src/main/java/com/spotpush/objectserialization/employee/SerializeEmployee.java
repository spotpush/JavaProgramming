package com.spotpush.objectserialization.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Stephen Hardy @ spotpush.com
*/

public class SerializeEmployee {

    public static void main(String[] args) {
        
        //instantiate an object of Employee
        Employee e = new Employee();
        e.name = "Stephen Hardy";
        e.address = "Linden Ave";
        e.SSN = 123456789;
        e.number = 101;
        
        try {
            FileOutputStream fileOut = 
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e); //writeObject() method throws IOException
            out.close();
            fileOut.close();
            System.out.println("Serialized data saves in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
                
        
    }
}
