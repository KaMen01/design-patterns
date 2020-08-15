package com.km.test.design.a_create_pattern.d4_prototype.prototype_1.business;

import com.km.test.design.a_create_pattern.d4_prototype.prototype_1.order.OrderApi;

/**处理订单的业务
 * @Author: coming
 * @Date: 2020/7/2 17:04
 */
public class OrderBusiness {

    /**
     * 若订单的产品数量大于1000，拆分直到每份产品数量小于1000
     * @param orderApi 订单，包括个人订单和企业订单
     */
    public void saveOrder(OrderApi orderApi){
        int num = 1;
        while(orderApi.getOrderNum()>1000){
//            if(orderApi instanceof IndividualOrder ){
//              这种方式，可扩展性很差，当我有新的订单类型时，还需要重新编写这块逻辑
//              于是为了获得订单的对象，给订单接口添加克隆方法
//            }

            OrderApi cloneOrder = orderApi.cloneOrder();
            cloneOrder.setOrderNum(1000);

            orderApi.setOrderNum(orderApi.getOrderNum()-1000);
            if(orderApi.getOrderNum()<1000){
                //向数据库中插入数据
                System.out.println(num+"次后拆分完成："+orderApi);
            }
            System.out.println("第"+num+"次拆分:"+cloneOrder+";拆分后的的订单对象："+orderApi);
            num++;
        }
    }
}
