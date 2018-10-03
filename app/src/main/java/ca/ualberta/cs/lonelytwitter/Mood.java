package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * An object class to represent the mood.
 * @author tyrrell1
 */

public abstract class Mood {

    private Date date;

    /**
     * Constructor of the Mood class
     */
    public Mood(){
       this.date = new Date();
    }

    /**
     * Constructor of the Mood class
     * @param currentdate
     */
    public Mood(Date currentdate){
        this.date = currentdate;
    }

    /**
     * return the date of the mood
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * set the date of the mood
     * @param newDate
     */
    public void setDate(Date newDate){
        this.date = newDate;
    }
}
