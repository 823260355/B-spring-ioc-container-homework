package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetingService {

    String sayHi() {
        return "hello world";
    }
}
