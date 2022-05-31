package com.bridgelabz.controller;

import com.bridgelabz.model.Greeting;
import com.bridgelabz.model.User;
import com.bridgelabz.service.GreetingServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/** Class :- Greeting Controller
 * @author Mangesh
 * @date 31-05-2022
 */

@RequestMapping("/api/v1/greetingApp")
@RestController
public class GreetingController {

    @Autowired
    GreetingServiceI greetingServiceI;

    /** Method :- Method to get the Greeting card info
     *
     * @param fname as input
     * @param lname as input
     * @return Greeting card info
     */
    @GetMapping("/getGreetingData")
    public Greeting greeting(@RequestParam(value = "fName",defaultValue = "Mangesh") String fname,
                             @RequestParam(value = "lName",defaultValue = "Bhujang")String lname){
        User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
       return greetingServiceI.getGreetingInfo(user);
    }
}
