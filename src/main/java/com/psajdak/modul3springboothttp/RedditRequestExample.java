package com.psajdak.modul3springboothttp;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class RedditRequestExample {

    private final RedditClient redditClient;

    public RedditRequestExample(RedditClient redditClient) {
        this.redditClient = redditClient;
    }

    @EventListener(ApplicationStartedEvent.class)
    public void makeRequestToReddit() {
        String json = redditClient.topPosts("java", 1, "year");
        System.out.println(json);
    }
}
