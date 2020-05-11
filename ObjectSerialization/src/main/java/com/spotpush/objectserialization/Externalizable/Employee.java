package com.spotpush.objectserialization.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Externalization provides a way of customizing Serialization by limiting 
 * what is serialized.  Serialisation by default serializes all objects that 
 * belong to the object graph and those that can be reached via instance variables
 * Externalization gives developers as way to prevent this, sometimes, excessive
 * process of serialization
 * Externalization extends Serialization and requires readExternal()
 * and writeExternal() methods be overridden 
 * No-arg constructor required to implement Externalizable
 * @author Stephen Hardy @ spotpush.com
*/

public class Employee implements Externalizable {

    private static final long serialVersionUID = 0L;
    int employeeId;
    String employeeName;
    String department;
    String nationality;
    
    //required to implement Externalizable
    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    /**
     * This method allows you to read specific fields for deserialization
     * Add/remove as required
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException,
            ClassNotFoundException {
        employeeId=in.readInt();
        employeeName=(String) in.readObject();
        department=(String) in.readObject();
        nationality=(String) in.readObject();
    }
    
    /**
     * This method allows you to write specif fields for serialization 
     * Add/remove as required.
     * @param out
     * @throws IOException 
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(employeeId);
        out.writeObject(employeeName);
        out.writeObject(department);
        out.writeObject(nationality);
    }
            
    
    public static void main(String[] args) {
        
    }
}
