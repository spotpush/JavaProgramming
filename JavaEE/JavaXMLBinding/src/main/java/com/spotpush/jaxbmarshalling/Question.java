package com.spotpush.jaxbmarshalling;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
* POJO to define an entity Question
* @author Stephen Hardy @ spotpush.com
*/

@XmlRootElement
public class Question {

    /**
     * Default fields for Question Entity
     */
    private int id;
    private String questionname;
    private List<Answer> answers; //List of Answer.java
    
    
    /**
     * no-arg constructor.  You need to specify this manually if you add a 
     * arg-constructor to initialise the fields and still want to instantiate
     * an instance of Question without passing the specified parameters.  
     * Why? because JVM adds this no-arg constructor automatically unless 
     * it finds an arg-constructor. 
     */
    public Question() {
       
    }
    
    /**
     * arg-constructor to initialise fields
     * @param id
     * @param questionname
     * @param answers 
     */
    public Question(int id,String questionname,List<Answer> answers) {
        super();
        this.id=id;
        this.questionname = questionname;
        this.answers = answers;
    }
    
    @XmlAttribute
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id=id;
    }
    
    @XmlElement
    public String getQuestionname() {
        return questionname;
    }
    
    public void setQuestionname(String questionname) {
        this.questionname=questionname;
    }
    
    @XmlElement
    public List<Answer> getAnswers() {
        return answers;
    }
    
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
