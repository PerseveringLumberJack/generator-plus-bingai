package com.oracle.example.dto;

import com.baomidou.mybatisplus.annotation.DbType;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author bingai
 */
@Data
@Accessors(chain = true)
public class CodeGeneratorDto {

    private DbType dbType;
    private String dbUrl;
    private String username;
    private String password;
    private String driver;
    private String[] tablePrefixes;
    private String[] tableNames;
    private String packageName;
    private String[] fieldPrefixes;
    private String[] excludeTableNames;
    
}
