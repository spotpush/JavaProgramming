package com.spotpush.objectserialization.serialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Writes serialized Employee data to file
 * @author Stephen Hardy @ spotpush.com
*/

public class EmployeeWriter {

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setName("Ana");
        employee.setAge((byte)6);
        employee.setAddress("Altrincham");
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/Ana/employee.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fileOut);
            oos.writeObject(employee);
            oos.close();
            System.out.println("Process Complete...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
