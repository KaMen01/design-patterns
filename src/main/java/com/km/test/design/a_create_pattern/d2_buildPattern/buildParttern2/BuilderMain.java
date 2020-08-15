package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportDataModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportFooterModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportHeaderModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: coming
 * @date: 2020/7/28 17:52
 */
public class BuilderMain {

    public static void main(String[] args) {
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("卡门公司");
        ehm.setExportDate("2020-7-28");

        Map<String, Collection<ExportDataModel>> mapData = new HashMap<String,Collection<ExportDataModel>>();
        Collection<ExportDataModel> col = new ArrayList<ExportDataModel>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmount(55);
        //把数据组装起来
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

        TxtBuilder txBuilder = new TxtBuilder();
        new Director(txBuilder).construct(ehm,mapData,efm);
        System.out.println(txBuilder.getResult());

        XmlBuilder xmlBuilder = new XmlBuilder();
        new Director(xmlBuilder).construct(ehm,mapData,efm);
        System.out.println(xmlBuilder.getResult());

    }
}
