package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by tyrrell1 on 9/18/18.
 */

public class Sad extends Mood {

    public Sad (){
        super();
    }

    public Sad (Date date){
        super(date);
    }

    public Date getDate(){
       return super.getDate();
    }

    public void setDate(Date newdate){
        super.setDate(newdate);
    }

    public String Description (){
        return "Sad";
    }
}
