package cn.com.my.service.controller;

import cn.com.my.service.client.Service0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jitpki3 on 2017/10/20.
 */
@RestController
public class ServiceController {

    @Autowired
    Service0Client service0Client;

    @GetMapping("/test0")
    public String serviceTest1(){
        return "service1Test";
    }

    @GetMapping("/testservice0")
    public String testService0(){
        return service0Client.serviceTest0();
    }

}
