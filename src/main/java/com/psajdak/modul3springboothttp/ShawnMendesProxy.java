package com.psajdak.modul3springboothttp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("shawn-mendes-client")
public interface ShawnMendesProxy {
    //GET https://api.shawnmendes.com/search
    @GetMapping("/search")
    public String search();
}
