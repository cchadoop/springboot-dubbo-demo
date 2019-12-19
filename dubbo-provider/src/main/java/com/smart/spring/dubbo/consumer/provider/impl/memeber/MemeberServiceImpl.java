package com.smart.spring.dubbo.consumer.provider.impl.memeber;

import com.alibaba.dubbo.config.annotation.Service;
import com.smart.spring.dubbo.api.IMemeberService;

@Service(version = "1.0.0",timeout = 3000)
public class MemeberServiceImpl implements IMemeberService{

    @Override
    public String getUser() {
        //数据库查询
        return "cc";
    }
}
