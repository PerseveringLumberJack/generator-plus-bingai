package com.oracle.example.test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.oracle.example.util.CommonUtils;

/**
 * MySQL bingai
 */
public class MySQL8CodeGenerator {

    public void test() {
        DbType dbType = DbType.MYSQL;
        String dbUrl = "jdbc:mysql://localhost:3306/dbName";
        String username = "username";
        String password = "password";
        String driver = "com.mysql.cj.jdbc.Driver";
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
