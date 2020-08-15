package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportDataModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportFooterModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author: coming
 * @date: 2020/7/27 17:26
 */
public class TxtBuilder implements Builder{

    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId()).append(",").append(ehm.getExportDate()).append("\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            buffer.append(tblName).append("\n");
            //然后循环拼接具体数据
            for(ExportDataModel edm : mapData.get(tblName)){
                buffer.append(edm.getProductId()).append(",").append(edm.getPrice()).append(",").append(edm.getAmount()).append("\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    public String getResult(){
        return buffer.toString();
    }
}
