package com.oracle.example.service;

import com.fengwenyi.api.result.ResultTemplate;
import com.oracle.example.vo.CodeGeneratorRequestVo;

/**
 * @author bingai
 */
public interface DemoService {

    /**
     * ็ๆไปฃ็ 
     * @param requestVo
     * @return
     */
    ResultTemplate<Void> codeGenerator(CodeGeneratorRequestVo requestVo);

}
