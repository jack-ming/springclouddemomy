package cn.com.my.gateway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * Created by jitpki3 on 2017/10/20.
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GateWay {

    public static void main(String[] args) {
        SpringApplication.run(GateWay.class, args);
    }

}
