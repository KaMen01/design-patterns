package com.km.test.design.a_create_pattern.d1_factory.study_2.simplefactory;

import java.io.IOException;
import java.util.Properties;

/**用配置的方式实现简单工厂
 * 简单工厂：可以生产任何接口的实现类
 * @author: coming
 * @date: 2020/7/15 10:20
 */
public class SimpleFactory {

    public Api createApi(){
        Properties properties = getProperties();
        Api api = null;
        try {
            api = (Api) (Class.forName(properties.getProperty("implClass")).newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return api;
    }

    public Api createApi(String name){
        Properties properties = getProperties();

        Api api = null;
        try {
            api = (Api) (Class.forName(properties.getProperty(name)).newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return api;
    }

    private Properties getProperties() {
        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(SimpleFactory.class.getClassLoader().getResourceAsStream("factory.properties"));
        } catch (IOException e) {
            System.out.println("读取配置文件失败");
            e.printStackTrace();
        }
        return properties;
    }

}
