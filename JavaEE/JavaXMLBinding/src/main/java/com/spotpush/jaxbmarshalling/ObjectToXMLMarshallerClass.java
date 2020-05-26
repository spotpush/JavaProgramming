package com.spotpush.jaxbmarshalling;

import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class ObjectToXMLMarshallerClass {

    public static void main(String[] args) throws Exception {
        
        /**
         * Step 1 create a JAXB Context from Question.class 
         */
        JAXBContext contextObj = JAXBContext.newInstance(Question.class);
        
        /**
         * Step 2 create a marshaller
         */
        Marshaller marshallerObj=contextObj.createMarshaller();
        
        /**
         * Step 3 required formatting
         */
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        
        Answer ans1=new Answer(101,"Java is a programming language","Bates");
        Answer ans2=new Answer(102,"Java is a platform","John");
        ArrayList<Answer> list = new ArrayList<>();
        list.add(ans1);
        list.add(ans2);
        Question que=new Question(1,"What is Java?",list);
        marshallerObj.marshal(que,new FileOutputStream("question.xml"));
    }
}
