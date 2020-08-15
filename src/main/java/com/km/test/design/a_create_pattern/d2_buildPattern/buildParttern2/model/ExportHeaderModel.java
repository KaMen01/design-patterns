package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern2.model;

/**
 * @author: coming
 * @date: 2020/7/27 16:17
 */
public class    ExportHeaderModel {
    /**
     * 分公司或门市点编号
     */
    private String depId;
    /**
     * 导出数据的日期
     */
    private String exportDate;
    public String getDepId() {
        return depId;
    }
    public void setDepId(String depId) {
        this.depId = depId;
    }
    public String getExportDate() {
        return exportDate;
    }
    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}
