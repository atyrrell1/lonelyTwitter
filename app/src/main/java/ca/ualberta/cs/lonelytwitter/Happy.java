package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * An object class to represent the mood of Happy.
 * @author tyrrell1
 */

public class Happy extends Mood {

    /**
     * constructor of the Happy class
     */
    public Happy (){
        super();
    }

    /**
     * constructor of the Happy class
     * @param date
     */
    public Happy (Date date){
        super(date);
    }

    /**
     * returns the date of Happy
     * @return
     */
    public Date getDate(){
        return super.getDate();
    }

    /**
     * sets the date of Happy
     * @param newdate
     */
    public void setDate(Date newdate){
        super.setDate(newdate);
    }
    /**
     * returns the description of the Happy class
     */
    public String description (){
        return "Happy";
    }

}
