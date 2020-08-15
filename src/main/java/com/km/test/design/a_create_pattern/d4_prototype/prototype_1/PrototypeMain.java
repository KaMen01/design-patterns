package com.km.test.design.a_create_pattern.d4_prototype.prototype_1;

import com.km.test.design.a_create_pattern.d4_prototype.prototype_1.business.OrderBusiness;
import com.km.test.design.a_create_pattern.d4_prototype.prototype_1.order.IndividualOrder;
import com.km.test.design.a_create_pattern.d4_prototype.prototype_1.order.OrderApi;

/**
 * @Author: coming
 * @Date: 2020/7/2 17:19
 */
public class PrototypeMain {
    public static void main(String[] args) {
        IndividualOrder individualOrder = new IndividualOrder();
        OrderApi orderApi = individualOrder;
        individualOrder.setCustomerName("卡门");
        individualOrder.setProductId("1");
        individualOrder.setOrderNum(2350);
        new OrderBusiness().saveOrder(orderApi);
    }
}
