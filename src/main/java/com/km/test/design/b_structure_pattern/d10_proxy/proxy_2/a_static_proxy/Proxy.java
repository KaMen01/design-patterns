package com.km.test.design.b_structure_pattern.d10_proxy.proxy_2.a_static_proxy;

import java.sql.*;

/**
 * @author coming
 * @date 2020/8/18 17:39
 */
public class Proxy implements UserModelAPi {

    private final UserModel realSubject;

    public Proxy(UserModel userModel){
        this.realSubject = userModel;
    }

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    //部门和性别使用懒加载
    private boolean loaded = false;

    @Override
    public String getDepId() {
        if(!loaded){
            reload();
        }
        return realSubject.getDepId();
    }

    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        if(!loaded){
            reload();
        }
        return realSubject.getSex();
    }

    private void reload() {
        System.out.println("重新查询数据库获取完整的用户数据，userId=="+realSubject.getUserId());
        Connection conn = null;
        try{
            conn = this.getConnection();
            String sql = "select * from TBL_USER";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                //只需要重新获取除了userId和name外的数据
                realSubject.setDepId(rs.getString("depId"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pstmt.close();
        }catch(Exception err){
            err.printStackTrace();
        }finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }




    private Connection getConnection() throws ClassNotFoundException, SQLException {
        return DriverManager.getConnection("jdbc:mysql://192.168.19.128:3306/design_pattern?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","2008nzgwc");
    }
}
