package it.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    B b;

    public String callB(){
        return b.say();
    }

    public String callSelf(){
        return self();
    }

    String self() {
        return "self";
    }
}
