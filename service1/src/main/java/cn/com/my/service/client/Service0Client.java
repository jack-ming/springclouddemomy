package cn.com.my.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jitpki3 on 2017/10/20.
 */


@FeignClient("service0")
public interface Service0Client {

    @RequestMapping(method = RequestMethod.GET, path = "/test0")
    String serviceTest0();

}
