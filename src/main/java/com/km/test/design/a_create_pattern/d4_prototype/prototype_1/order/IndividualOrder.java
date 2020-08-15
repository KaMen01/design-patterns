package com.km.test.design.a_create_pattern.d4_prototype.prototype_1.order;

/**
 * @Author: coming
 * @Date: 2020/7/2 16:57
 */
public class IndividualOrder implements OrderApi {

    private String customerName;

    private String productId;

    private int orderNum;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    @Override
    public int getOrderNum() {
        return orderNum;
    }
    @Override
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    @Override
    public OrderApi cloneOrder() {
        IndividualOrder individualOrder = new IndividualOrder();
        individualOrder.setCustomerName(customerName);
        individualOrder.setOrderNum(orderNum);
        individualOrder.setProductId(productId);
        return individualOrder;
    }

    @Override
    public String toString() {
        return customerName+"该个人订单当前所定的产品数量为："+orderNum;
    }
}
