package com.spotpush.javaxmlbinding;

import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
* This converts an object (SimpleJAXBMarshallingExample) to XML 
* @author Stephen Hardy @ spotpush.com
*/

public class ObjectToXML {

    public static void main(String[] args) throws Exception {
        JAXBContext contentObj = JAXBContext.newInstance(SimpleJAXBMarshallingExample.class);
        Marshaller marshallerObj = contentObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        SimpleJAXBMarshallingExample examp1 = new 
                SimpleJAXBMarshallingExample(1,"Stephen Hardy",150000);
        
        marshallerObj.marshal(examp1,new FileOutputStream("employee.xml"));
    }
}
