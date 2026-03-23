package com.psajdak.modul3springboothttp;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateExample {

    private final RestTemplate restTemplate;

    // Wstrzykujemy RestTemplate przez konstruktor
    public RestTemplateExample(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @EventListener(ApplicationStartedEvent.class)
    public void makeRequestWithRestTemplate() {
        // Ręcznie budujemy URL (w Feign robiły to za nas adnotacje)
        String url = "https://itunes.apple.com/search?term=coldplay&limit=1";

        System.out.println("--- WYWOŁANIE PRZEZ REST TEMPLATE ---");

        // Wykonujemy zapytanie GET i oczekujemy odpowiedzi w postaci Stringa (JSON)
        String response = restTemplate.getForObject(url, String.class);

        System.out.println(response);
    }
}