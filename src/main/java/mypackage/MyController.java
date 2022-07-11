package mypackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
/*
http://localhost:8080/students
Sample Twitter Application
(i) Lot of users
(ii) Each user has some followers
(iii) Each user follow some people
(iv) There are tweets by a user

whenever you open a url it will either be http or https
(i) Get (ii) Post


 */
@RestController
public class MyController {

    @GetMapping("/students")
    List<String> all(){
        return Arrays.asList("name-1","name-2","name-3");
    }
    @GetMapping("/send")
    public String message1(){
        return "get send";
    }
    @PostMapping("/send")
    public String message(){
        return "Post send";
    }
}
