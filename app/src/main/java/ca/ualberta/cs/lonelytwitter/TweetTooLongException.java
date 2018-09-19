package ca.ualberta.cs.lonelytwitter;

/**
 * Created by tyrrell1 on 9/18/18.
 */

public class TweetTooLongException extends Exception {

    TweetTooLongException(){
        super("This message is too long! Please keep your tweets within 140 characters.");
    }
}
