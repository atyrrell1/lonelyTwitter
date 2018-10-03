package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Sad is a class that is represents the mood Sad.
 * @author tyrrell1
 */

public class Sad extends Mood {

    /**
     * constructor of the Sad class
     */
    public Sad (){
        super();
    }

    /**
     * constructor of the Sad class
     * @param date
     */
    public Sad (Date date){
        super(date);
    }

    /**
     * returns the date of Sad
     * @return
     */
    public Date getDate(){
       return super.getDate();
    }

    /**
     * sets the date of Sad
     * @param newdate
     */
    public void setDate(Date newdate){
        super.setDate(newdate);
    }

    /**
     * returns the description of the Sad class
     */
    public String Description (){
        return "Sad";
    }
}
