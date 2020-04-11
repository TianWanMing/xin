package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
@Api(value = "用户controller",tags = {"第一个测试类"})//@Api注解放在类上面，这里的value是没用的，tags表示该controller的介绍。
public class IndexController {
    @RequestMapping(value = "index1" )
    @ResponseBody
    @ApiOperation(value = "第一个测试的",notes ="第一个测试的方法" +
            "详细介绍")//其中value是该类的简短的叙述，notes一般是该方法的详细描述。
    @ApiImplicitParam(name = "数据id", value = "托盘编码", dataType = "int")
    public String getIndex(int id,int name){
        System.out.print("========"+id+"name"+name);
        return id+"";
    }
}















