package com.km.test.design.a_create_pattern.d4_prototype.prototype_1.order;

/**
 * @Author: coming
 * @Date: 2020/7/2 17:02
 */
public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderNum;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setEnterpriseName(enterpriseName);
        enterpriseOrder.setOrderNum(orderNum);
        enterpriseOrder.setProductId(productId);
        return enterpriseOrder;
    }

    @Override
    public String toString() {
        return "该企业订单当前的所订的产品数量为:"+this.orderNum;
    }
}
