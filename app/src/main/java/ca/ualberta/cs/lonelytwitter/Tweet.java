package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Tweet is an object class with two constructors and has two properties: a date, and a message. Tweet also implements Tweetable.
 * @author tyrrell1
 */

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;
    private ArrayList<Mood> tweetmoodlist;

    /**Constructor of the Tweet class*/
    Tweet(){
        this.date = new Date();
        this.message = "I am a default message";
        this.tweetmoodlist = new ArrayList<Mood>();
    }

    /**Constructor of the Tweet class
     *
     * @param message
     */
    Tweet(String message){
        this.date = new Date();
        this.message = message;
        this.tweetmoodlist = new ArrayList<Mood>();
    }

    /** returns the date of the tweet */
    public Date getDate() {
        return this.date;
    }

    /**returns the message of the tweet */
    public String getMessage(){
        return this.message;
    }

    /**returns the moods of the tweet*/
    public ArrayList<Mood> getTweetmoodlist(){
        return this.tweetmoodlist;
    }

    /*sets the date of the tweet\
    * @param newdate
    */
    public void setDate(Date newdate){
        this.date = newdate;
    }

    /**sets the message of the tweet
     *
     * @param newmessage
     * @throws TweetTooLongException
     */
    public void setMessage(String newmessage) throws TweetTooLongException {
       if (newmessage.length() <= this.MAX_CHARS){
        this.message = newmessage;}
        else{
           throw new TweetTooLongException();
       }
    }

    /** add the mood to the Tweet mood list
     *
     * @param newmood
     */
    public void AddMood (Mood newmood){
        this.tweetmoodlist.add(newmood);
    }

    /**
     * remove the mood to the Tweet mood list
     * @param obsmood
     */
    public void RemoveMood (Mood obsmood){
        this.tweetmoodlist.remove(obsmood);
    }

    public abstract Boolean isImportant();
}
