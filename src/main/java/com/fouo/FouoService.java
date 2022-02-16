package com.fouo;

import com.fouo.config.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class FouoService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String usernmae){
        return helloProperties.getPrefix() +": "+usernmae+"  say hello "+helloProperties.getSuffix();
    }
}
