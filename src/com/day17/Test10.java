package com.day17;

import java.io.File;
import java.io.FileFilter;

public class Test10 {
    public static void main(String[] args) {

        FileFilters filter = new FileFilters() {
            @Override
            public void accepts(File file) {
                File[] file1 = file.listFiles(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        return pathname.getName().endsWith(".java") || pathname.isDirectory();
                    }
                });
                for (File file2:file1){
                    if(file2.isFile()){
                        System.out.println("文件名："+file2.getName());
                    }else {
                        accepts(file2);
                    }
                }

            }
        };
        File files = new File("D:\\JAVA\\javatest");
        filter.accepts(files);

    }
}

interface FileFilters {
    public void accepts(File file);
}