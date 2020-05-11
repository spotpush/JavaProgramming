package com.spotpush.objectserialization.Externalizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Stephen Hardy @ spotpush.com
*/

public class WriteEmployee {

    public static void main(String[] args) {
    
        Employee emp = new Employee();
        emp.setEmployeeId(201);
        emp.setEmployeeName("Elizabeth");
        emp.setDepartment("Fixed Income");
        emp.setNationality("English");
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/elizabeth/employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fileOut);
            oos.writeObject(emp);
            oos.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
