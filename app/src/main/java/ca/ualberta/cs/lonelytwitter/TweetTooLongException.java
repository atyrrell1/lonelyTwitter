package ca.ualberta.cs.lonelytwitter;

/**
 * TweetTooLongException is thrown when the user enters a tweet that is more than the MAXLENGTH.
 * @author tyrrell1
 */

public class TweetTooLongException extends Exception {

    TweetTooLongException(){
        super("This message is too long! Please keep your tweets within 140 characters.");
    }
}
