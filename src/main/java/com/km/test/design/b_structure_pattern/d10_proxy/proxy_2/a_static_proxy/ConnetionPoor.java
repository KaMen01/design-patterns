package com.km.test.design.b_structure_pattern.d10_proxy.proxy_2.a_static_proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

/** 失败的连接池,以后自己像完善的时候再完善吧
 * @author coming
 * @date 2020/8/14 17:22
 */
public class ConnetionPoor {
    private static final LinkedList<Connection> CONNECTIONS = new LinkedList<>();

    static {
        if(CONNECTIONS.size()<5){
            try {
                Class.forName("com.mysql.cj.jdbc.driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            for(int i =0; i < 5;i++){
                Connection conn;
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b_design_pattern");
                    CONNECTIONS.add(conn);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public static Connection getConnetion() throws Exception {
        if(CONNECTIONS.size()>0){
            synchronized (ConnetionPoor.class){
                if(CONNECTIONS.size()>0){
                    Connection conn =  CONNECTIONS.getFirst();
                    CONNECTIONS.removeFirst();
                    return conn;
                }
            }
        }
        return null;
    }
}
