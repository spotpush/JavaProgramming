package com.spotpush.objectserialization.Externalizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Stephen Hardy @ spotpush.com
*/

public class ReadEmployee {

    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        
        Employee emp = new Employee();
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/elizabeth/employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fileIn);
            emp = (Employee) ois.readObject();
            ois.close();
            fileIn.close();
            
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Emp id: "+emp.getEmployeeId());
        System.out.println("Name: "+emp.getEmployeeName());
        System.out.println("Department: "+emp.getDepartment());
    }
}
