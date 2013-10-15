package com.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class DomainController {

    private Domain domain;

    @PostConstruct
    public void init() {
        domain = new Domain();
        domain.setId(1);
        domain.setData("Some message");
    }

    @RequestMapping("/hello")
    public Domain message() {
        return domain;
    }
}
