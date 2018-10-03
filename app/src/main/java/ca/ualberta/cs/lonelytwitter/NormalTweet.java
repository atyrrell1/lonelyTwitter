package ca.ualberta.cs.lonelytwitter;

/**
 * NormalTweet is an object class that extends the Tweet class.
 * @author tyrrell1
 */

public class NormalTweet extends Tweet {

    /**
     * Constructor of NormalTweet
     */
    NormalTweet(){
        super();
    }

    /**
     * Constructor of NormalTweet
     * @param message
     */
    NormalTweet(String message){
        super(message);
    }

    /** Returns if the NormalTweet is important
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return false;
    }
}
