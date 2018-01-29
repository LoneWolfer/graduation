package org.luning.graduation.controller;

import org.luning.graduation.bo.TestBo;
import org.luning.graduation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 测试控制器
 *
 * Created by ln on 01/29/2018.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<TestBo> list(){
        return testService.listTest();
    }
}
