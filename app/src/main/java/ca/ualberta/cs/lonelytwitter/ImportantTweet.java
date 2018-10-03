package ca.ualberta.cs.lonelytwitter;

/**
 * ImportantTweet is an object class that extends Tweet
 * @author tyrrell1
 */

public class ImportantTweet extends Tweet {

    /**
     * Constructor of the Importanttweet class
     */
    ImportantTweet(){
        super();
    }


    /**
     * Constructor of the Importanttweet class
     * @param message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Returns if the tweet is important or not
     */
    @Override
    public Boolean isImportant() {
        return true;
    }

}
