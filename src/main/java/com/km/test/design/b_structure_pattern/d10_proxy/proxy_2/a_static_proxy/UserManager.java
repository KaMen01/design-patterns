package com.km.test.design.b_structure_pattern.d10_proxy.proxy_2.a_static_proxy;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<UserModelAPi> userModels = new UserManager().selectAll();
        userModels.forEach(u-> System.out.println("userId:"+u.getUserId()+";"+"username:"+u.getName()));
        userModels.forEach(u-> System.out.println("userId:"+u.getUserId()+";username:"+u.getName()+";depId:"+u.getDepId()+";sex:"+u.getSex()));
    }

    public List<UserModelAPi> selectAll() throws SQLException, ClassNotFoundException {
        Connection connection =null;
        List<UserModelAPi> userModels;
        try {
            connection =getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from TBL_USER");
            ResultSet resultSet = preparedStatement.executeQuery();
            userModels = new ArrayList<>();
            Proxy proxy = null;
            while (resultSet.next()){
                proxy = new Proxy(new UserModel());
                proxy.setUserId(resultSet.getString("userID"));
                proxy.setName(resultSet.getString("NAME"));
                userModels.add(proxy);
            }
            resultSet.close();
            preparedStatement.close();
        } finally {
            if(connection!=null){
                connection.close();
            }
        }
        return userModels;
    }


    private Connection getConnection() throws ClassNotFoundException, SQLException {

        return DriverManager.getConnection("jdbc:mysql://192.168.19.128:3306/design_pattern?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","2008nzgwc");
    }
}
