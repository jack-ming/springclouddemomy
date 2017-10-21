package cn.com.my.service.client.fallback.factory;

import cn.com.my.service.client.Service0Client;
import feign.hystrix.FallbackFactory;

/**
 * Created by jitpki3 on 2017/10/21.
 */
public class Service0FallbackFactory implements FallbackFactory<Service0Client> {
    @Override
    public Service0Client create(Throwable throwable) {
        System.out.println("create:" + throwable);
        return new Service0Client() {
            @Override
            public String serviceTest0() {
                return "create fallback";
            }
        };
    }
}
