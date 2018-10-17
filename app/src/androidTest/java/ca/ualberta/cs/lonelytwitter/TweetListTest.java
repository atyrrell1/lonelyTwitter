package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    //JUnit test method for adding tweet into TweetList
    public void testAddTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    //JUnit test method for checking whether a tweet is in the TweetList
    public void testHasTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweetList.hasTweet(tweet));

        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");

        tweetList.add(tweet);
        Tweet retrievedTweet = tweetList.getTweet(0);

        assertEquals(retrievedTweet.getMessage(), tweet.getMessage());
        assertEquals(retrievedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("one for delete");

        tweetList.add(tweet);
        tweetList.delete(tweet);

        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testDuplicateTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);

        try{
            tweetList.add(tweet);
        }
        catch(IllegalArgumentException e){
            assertTrue(Boolean.TRUE);
        }
    }

    public void testGetTweets(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);
        Tweet secondtweet = new NormalTweet("added second tweet");
        tweetList.add(secondtweet);

        ArrayList<Tweet> sortedtweetlist = tweetList.getTweets();

        assertEquals(sortedtweetlist.get(0).getMessage(), tweet.getMessage());
        assertEquals(sortedtweetlist.get(0).getDate(), tweet.getDate());

        assertEquals(sortedtweetlist.get(1).getMessage(), secondtweet.getMessage());
        assertEquals(sortedtweetlist.get(1).getDate(), secondtweet.getDate());
    }

    public void testGetCount(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);

        assertEquals(1, tweetList.getCount());
    }

}
