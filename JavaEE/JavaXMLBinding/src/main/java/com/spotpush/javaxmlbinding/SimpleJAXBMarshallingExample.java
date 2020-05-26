package com.spotpush.javaxmlbinding;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
* JAXB 2.0 - Java Architecture for XML Binding
* Convert object(s) into XML and XML into Object(s)
* @author Stephen Hardy @ spotpush.com
*/


/**
 * XmlRootElement specifies root element for the XML document
 */
@XmlRootElement
public class SimpleJAXBMarshallingExample {

    private int id;
    private String name;
    private float salary;
    
    public SimpleJAXBMarshallingExample() {}
    
    public SimpleJAXBMarshallingExample(int id, String name, float salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    /**
     * XmlAttribute specifies the attribute for the root element
     * @return 
     */
    @XmlAttribute
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * XmlElement specifies sub element for the root element
     * @return 
     */
    @XmlElement
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @XmlElement
    public float getSalary() {
        return salary;
    }
    
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
