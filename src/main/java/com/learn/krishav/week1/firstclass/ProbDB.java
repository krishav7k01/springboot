package com.learn.krishav.week1.firstclass;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name= "deploy.env" , havingValue = "production")
public class ProbDB implements DB {


    public  String getData()
    {
        return "ProdDB";
    }
}
