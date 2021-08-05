package com.oracle.example.test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.oracle.example.util.CommonUtils;

/**
 * Oracle 数据库代码生成类
 */
public class OracleCodeGenerator {

    public static void test() {
        DbType dbType = DbType.ORACLE;
        String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "username";
        String password = "password";
        String driver = "oracle.jdbc.OracleDriver";
        // 表前缀，生成的实体类，不含前缀
        String[] tablePrefixes = {};
        // 表名，为空，生成所有的表
        String[] tableNames = {};
        // 字段前缀
        String[] fieldPrefixes = {};
        // 排除的表名
        String[] excludeTableNames = {};
        // 基础包名
        String packageName = "com.example.module.db";
        CommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes, excludeTableNames);
    }

}
