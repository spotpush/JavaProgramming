package com.spotpush.objectserialization.serialVersionUID;

import java.io.Serializable;
/**
 * Employee object to be serialized
 * @author Stephen Hardy @ spotpush.com
*/

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    

    //private static final long serialVersionUID = 1L;
    //private static final long serialVersionUID = -5033507726067537189L;
    //private static final long serialVersionUID = ;
    
    
    private String name;
    private byte age;
    private String address;
    private int doorNumber;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public byte getAge() {
        return age;
    }
    
    public void setAge(byte age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String whoIsThis() {
        StringBuffer employee = new StringBuffer();
        employee.append(getName()).append(" is ")
                .append(getAge())
                .append(" years old and lives in ")
                .append(getAddress());
        return employee.toString();
    }
}
