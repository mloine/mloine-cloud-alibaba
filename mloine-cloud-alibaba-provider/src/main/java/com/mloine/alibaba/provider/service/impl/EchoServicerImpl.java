package com.mloine.alibaba.provider.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.mloine.alibaba.service.EchoService;
import org.apache.dubbo.config.annotation.Service;
/**
 *  @Author: XueYongKang
 *  @Description:    
 *  @Data: 2019/12/24 15:09
 */
@Service
public class EchoServicerImpl implements EchoService {

    @SentinelResource("echo-provider")
    @Override
    public String echo(String message) {
        return String.format("服务提供者收到消息 %s",message);
    }

}
