package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tyrrell1 on 9/18/18.
 */

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private ArrayList<Mood> tweetmoodlist;

    Tweet(){
        this.date = new Date();
        this.message = "I am a default message";
        this.tweetmoodlist = new ArrayList<Mood>();
    }

    Tweet(String message){
        this.date = new Date();
        this.message = message;
        this.tweetmoodlist = new ArrayList<Mood>();
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage(){
        return this.message;
    }

    public ArrayList<Mood> getTweetmoodlist(){
        return this.tweetmoodlist;
    }

    public void setDate(Date newdate){
        this.date = newdate;
    }

    public void setMessage(String newmessage) throws TweetTooLongException {
       if (newmessage.length() <= this.MAX_CHARS){
        this.message = newmessage;}
        else{
           throw new TweetTooLongException();
       }
    }

    public void AddMood (Mood newmood){
        this.tweetmoodlist.add(newmood);
    }

    public void RemoveMood (Mood obsmood){
        this.tweetmoodlist.remove(obsmood);
    }

    public abstract Boolean isImportant();
}
