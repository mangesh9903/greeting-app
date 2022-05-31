package com.bridgelabz.service;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.model.User;
import org.springframework.stereotype.Service;

@Service
public interface GreetingServiceI {

    Greeting getGreetingInfo(User user);
}
