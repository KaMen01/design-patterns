package com.km.test.design.b_structure_pattern.d10_proxy.proxy_2.a_static_proxy;

/**
 * @author coming
 * @date 2020/8/18 15:47
 */
public class UserModel implements UserModelAPi {
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 部门编号
     */
    private String depId;
    /**
     * 性别
     */
    private String sex;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepId() {
        return depId;
    }
    public void setDepId(String depId) {
        this.depId = depId;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String toString(){
        return "userId="+userId+",name="+name+",depId="+depId+",sex="+sex+"\n";
    }
}
