package com.spotpush.objectserialization.serialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Reads serialized Employee data from file
 * @author Stephen Hardy @ spotpush.com
*/

public class EmployeeReader {

    public static void main(String[] args) 
            throws ClassNotFoundException, IOException {
        
        try {
            Employee employee = new Employee();
            FileInputStream fileInput = new FileInputStream("/tmp/ana/employee.obj");
            ObjectInputStream ois = new ObjectInputStream(fileInput);
            employee = (Employee) ois.readObject();
            ois.close();
            System.out.println(employee.whoIsThis());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
