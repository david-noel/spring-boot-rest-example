package com.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class DomainController {

    private Domain domain;

    @Value("${name}")
    private String name;

    @PostConstruct
    public void init() {
        domain = new Domain();
        domain.setId(1);
        domain.setData(name);
    }

    @RequestMapping("/hello")
    public Domain message() {
        return domain;
    }
}
