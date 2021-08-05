package com.oracle.example;

import com.baomidou.mybatisplus.annotation.DbType;
import com.oracle.example.util.CommonUtils;
import org.junit.jupiter.api.Test;

/**
 *
 */

public class DemoGeneratorTests {

    @Test
    public void testMySQLCodeGenerator() {
        DbType dbType = DbType.MYSQL;
        String dbUrl = "jdbc:mysql://localhost:3306/statistics?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false";
        String username = "root";
        String password = "123";
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
        String packageName = "com.oracle";
        CommonUtils.execute(dbType, dbUrl, username, password, driver, tablePrefixes, tableNames, packageName, fieldPrefixes, excludeTableNames);
    }

}
