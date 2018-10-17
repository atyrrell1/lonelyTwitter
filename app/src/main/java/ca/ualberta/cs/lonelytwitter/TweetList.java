package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) throws IllegalArgumentException{
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> sortedList = this.tweets;
        Collections.sort(sortedList, new Comparator<Tweet>() {
            public int compare(Tweet o1, Tweet o2) {
                return o2.getDate().compareTo(o1.getDate());
            }
        });
        return sortedList;
    }

    public int getCount(){
        int count = 0;
        for (Tweet tweet : tweets){
            count+=1;
        }

        return count;
    }

}
