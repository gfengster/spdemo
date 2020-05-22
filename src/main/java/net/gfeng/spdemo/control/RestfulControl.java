package net.gfeng.spdemo.control;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestfulControl {
    
    @GetMapping("echo")
    public String echo (){
        return "Hello, " + LocalTime.now();
    }
}