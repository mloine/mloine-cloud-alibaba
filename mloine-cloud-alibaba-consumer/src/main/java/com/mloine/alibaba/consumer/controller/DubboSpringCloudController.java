package com.mloine.alibaba.consumer.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.mloine.alibaba.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboSpringCloudController {

    @Reference
    private EchoService echoService;


//    @SentinelResource("resource")
    @GetMapping("/echo")
    public String echo(@RequestParam String msg){
        return echoService.echo(msg);
    }
}
