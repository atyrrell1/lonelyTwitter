package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tyrrell1 on 9/18/18.
 */

public abstract class Mood {

    private Date date;

    public Mood(){
       this.date = new Date();
    }

    public Mood(Date currentdate){
        this.date = currentdate;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date newDate){
        this.date = newDate;
    }
}
