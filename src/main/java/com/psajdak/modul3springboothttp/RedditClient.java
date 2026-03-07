package com.psajdak.modul3springboothttp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "reddit-client", url = "https://www.reddit.com")
public interface RedditClient {

    @GetMapping(
            value = "/r/{subreddit}/top.json",
            headers = {
                    "User-Agent=MySpringApp/1.0 (learning)",
                    "Accept=application/json"
            }
    )
    String topPosts(
            @PathVariable("subreddit") String subreddit,
            @RequestParam("limit") Integer limit,
            @RequestParam("t") String timeRange
    );
}
