package com.oracle.example.controller;

import com.fengwenyi.api.result.ResultTemplate;
import com.oracle.example.service.DemoService;
import com.oracle.example.vo.CodeGeneratorRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bingai
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService indexService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/code-generator")
    @ResponseBody
    public ResultTemplate<Void> codeGenerator(@RequestBody @Validated CodeGeneratorRequestVo requestVo) {
        return indexService.codeGenerator(requestVo);
    }

}
