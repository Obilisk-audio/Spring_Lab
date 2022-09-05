package com.task_01.Controllers;
import com.task_01.Models.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {

    /* Task 1
    @GetMapping()
    public String greeting(){
        return "Good Morning, Milo!";
    }
    */

    /*  Task 2
    @GetMapping()
    public Greetings greeting(){
        return new Greetings("Milo" , "Night");
    }
    */

    // Extension 1
    @GetMapping()
    public Greetings greeting(@RequestParam String timeOfDay){
        return new Greetings("Milo" , timeOfDay);
    }

}