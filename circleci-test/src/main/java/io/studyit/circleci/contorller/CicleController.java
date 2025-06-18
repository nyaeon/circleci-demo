package io.studyit.circleci.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CicleController {

    @GetMapping("circle")
    public String circle(){
        return "Hello World!";
    }
}
