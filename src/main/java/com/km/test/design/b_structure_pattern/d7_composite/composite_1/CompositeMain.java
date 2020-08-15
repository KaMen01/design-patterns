package com.km.test.design.b_structure_pattern.d7_composite.composite_1;

/**
 * @Author: coming
 * @Date: 2020/7/3 21:08
 */
public class CompositeMain {
    public static void main(String[] args) {
        Folder folder = new Folder();


        File file1 = new File();

        Folder folder1 = new Folder();
        File file2 = new File();
        File file3 = new File();
        folder1.add(file2);
        folder1.add(file3);

        Folder folder2 = new Folder();
        File file4 = new File();;
        folder2.add(file4);

        folder.add(file1);
        folder.add(folder1);
        folder.add(folder2);

        folder.delete();


    }
}
