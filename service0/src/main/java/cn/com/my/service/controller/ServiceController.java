package cn.com.my.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jitpki3 on 2017/10/20.
 */
@RestController
public class ServiceController {

    @GetMapping("/test0")
    public String serviceTest0(){
        return "service0test";
    }

}
