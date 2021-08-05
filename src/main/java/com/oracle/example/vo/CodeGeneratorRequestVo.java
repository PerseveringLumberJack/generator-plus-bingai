package com.oracle.example.vo;

import lombok.Data;

/**
 *
 */
@Data
public class CodeGeneratorRequestVo {

    private Integer dbType;

    private String host;

    private String username;

    private String password;

    private String dbName;

    private String packageName;

    private String outDir;

}
