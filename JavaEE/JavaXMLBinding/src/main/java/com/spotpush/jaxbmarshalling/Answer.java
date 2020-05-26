package com.spotpush.jaxbmarshalling;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class Answer {

    private int id;
    private String answername;
    private String postedby;
    
    public Answer(){
    }
    
    public Answer(int id,String answername,String postedby) {
        /**
         * super() in this instance invokes parent class constructor
         * super() is added to each class constructor automatically if super()
         * or this() are not present.  Since Answer doesn't extend any class
         * and therefore no parent class constructor super() is not necessary
         */
        super();
        this.id=id;
        this.answername=answername;
        this.postedby=postedby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswername() {
        return answername;
    }

    public void setAnswername(String answername) {
        this.answername = answername;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }
    
        
}
