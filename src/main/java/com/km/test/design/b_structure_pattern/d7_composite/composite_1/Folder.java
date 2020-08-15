package com.km.test.design.b_structure_pattern.d7_composite.composite_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: coming
 * @Date: 2020/7/3 21:03
 */
public class Folder implements FileSystem {
    private List<FileSystem> fileSystemList = new ArrayList<FileSystem>();

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }
    public void delete() {
        for (FileSystem fileSystem : fileSystemList) {
            fileSystem.delete();
        }
    }
}
