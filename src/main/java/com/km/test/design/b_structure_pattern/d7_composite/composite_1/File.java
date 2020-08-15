package com.km.test.design.b_structure_pattern.d7_composite.composite_1;

/**
 * @Author: coming
 * @Date: 2020/7/3 21:02
 */
public class File implements FileSystem {
    public void delete() {
        System.out.println("删除文件");
    }
}
