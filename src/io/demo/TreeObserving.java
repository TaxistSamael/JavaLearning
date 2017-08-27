package io.demo;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.Files;

public class TreeObserving {

    private static final String fromFile = "D:\\tmp\\io_demo_file.txt";
    private static final String toFile = "D:\\tmp\\io_demo_to_file.txt";

    private static final String rootDir = "D:\\";

    public static void main(String[] args) {
        File dir = new File(rootDir);
        printBigOnlyFilesWithFilter(dir);
    }

    private static void printAllFiles(File dir) {
        if (dir.isFile()) {
            System.out.println(dir);
            return;
        }

        File[] fileArray = dir.listFiles();
        for (File file : fileArray) {
            printAllFiles(file);
        }
    }

    private static void printBigOnlyFiles(File dir) {
        if (dir.isFile()) {
            int minLength = 10 * 1024 * 1024; //1 Mb
            if (dir.length() > minLength) System.out.println(dir);
        }

//        Files.walkFileTree()

        File[] fileArray = dir.listFiles();
        for (File file : fileArray != null ? fileArray : new File[0]) {
            printBigOnlyFiles(file);
        }
    }

    private static void printBigOnlyFilesWithFilter(File dir) {
        File[] fileArray = dir.listFiles(filter);
        for (File file : fileArray != null ? fileArray : new File[0]) {
            if (file.isFile()) {
                System.out.println(file);
                continue;
            }
            printBigOnlyFilesWithFilter(file);
        }
    }

    private static FileFilter filter = pathname -> {
        int minLength = 10 * 1024 * 1024; //10 Mb
        return pathname.isDirectory() || pathname.length() > minLength;
    };
}
