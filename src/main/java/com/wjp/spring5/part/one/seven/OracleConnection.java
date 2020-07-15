package com.wjp.spring5.part.one.seven;

/**
 * @author wjp
 * @date 2020/7/15 15:15
 */
public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
