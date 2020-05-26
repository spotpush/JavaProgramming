package com.spotpush.javaxmlbinding;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
* Convert XML to a Java Object
* @author Stephen Hardy @ spotpush.com
*/

public class XMLToObject {

    public static void main(String[] args) {
        try {
            File file = new File("employee.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(SimpleJAXBMarshallingExample.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            SimpleJAXBMarshallingExample e = 
                    (SimpleJAXBMarshallingExample) jaxbUnmarshaller.unmarshal(file);
            System.out.println(e.getId()+", "+e.getName()+", "+e.getSalary());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
