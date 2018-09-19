package ca.ualberta.cs.lonelytwitter;

/**
 * Created by tyrrell1 on 9/18/18.
 */

public class ImportantTweet extends Tweet {

    ImportantTweet(){
        super();
    }

    ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return true;
    }

}
