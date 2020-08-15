package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportDataModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportFooterModel;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model.ExportHeaderModel;

import java.util.Collection;
import java.util.Map;

/**
 * @author: coming
 * @date: 2020/7/28 16:11
 */
public class Director {
    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;
    /**
     * 构造方法，传入生成器对象
     * @param builder 生成器对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 指导生成器构建最终的输出的文件的对象
     * @param ehm 文件头的内容
     * @param mapData 数据的内容
     * @param efm 文件尾的内容
     */
    public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {
        //1：先构建Header
        builder.buildHeader(ehm);
        //2：然后构建Body
        builder.buildBody(mapData);
        //3：然后构建Footer
        builder.buildFooter(efm);
    }

}
