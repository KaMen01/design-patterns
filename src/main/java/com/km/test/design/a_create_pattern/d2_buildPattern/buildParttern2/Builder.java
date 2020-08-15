package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportDataModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportFooterModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author: coming
 * @date: 2020/7/27 17:20
 */
public interface Builder {

    /**
     * 创建头
     * @param headerModel 头数据
     */
    public void buildHeader(ExportHeaderModel headerModel);

    /**
     * 创建数据体
     * @param mapData 数据体
     */
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * 创建底部
     * @param footerModel 底数据
     */
    public void buildFooter(ExportFooterModel footerModel);
}
