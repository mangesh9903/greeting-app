package com.bridgelabz.service;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingServiceI{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting getGreetingInfo(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return new Greeting(counter.incrementAndGet(), message);
    }
}
