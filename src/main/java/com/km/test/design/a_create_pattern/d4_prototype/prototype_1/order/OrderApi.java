package com.km.test.design.a_create_pattern.d4_prototype.prototype_1.order;

/**
 * @Author: coming
 * @Date: 2020/7/2 16:56
 */
public interface OrderApi {
    /**
     * 获得订单的数量
     * @return
     */
    int getOrderNum();

    /**
     * 设置订单的数量
     * @param orderNum
     */
    void setOrderNum(int orderNum);

    /**
     * 克隆订单
     * @return
     */
    OrderApi cloneOrder();
}
