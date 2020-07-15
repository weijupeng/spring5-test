package com.wjp.spring5.part.one.seven;

/**
 * @author wjp
 * @date 2020/7/15 15:14
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
