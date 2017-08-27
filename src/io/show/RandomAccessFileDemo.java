package io.show;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    private static String path = "D:\\test\\someFile.txt";
    private static RandomAccessFile randomAccessFile;
    private static String testString = "Объект, который предполагается использовать, выполняет основные функции. Однако может потребоваться добавить к нему некоторую дополнительную функциональность, которая будет выполняться до, после или даже вместо основной функциональности объекта.";

    public static void main(String[] args) throws IOException {
        writeString(testString);
        readFromPosition(100);
    }

    private static long moveToPosition(int position) throws IOException {
        randomAccessFile = new RandomAccessFile(path, "r"); //r - readFromPosition mode
        //sets the reading file pointer.
        randomAccessFile.seek(position);
        long pointer = randomAccessFile.getFilePointer();
        randomAccessFile.close();

        return pointer;
    }

    private static String read() throws IOException {
        randomAccessFile = new RandomAccessFile(path, "r");

        StringBuilder stringBuilder = new StringBuilder(1000);
        int data;
        while ((data = randomAccessFile.read()) != -1) {
            stringBuilder.append((char) data);
        }

        randomAccessFile.close();

        return randomAccessFile.toString();
    }

    private static String readFromPosition(int position) throws IOException {
        randomAccessFile = new RandomAccessFile(path, "r");

        randomAccessFile.seek(position);

        StringBuilder stringBuilder = new StringBuilder(1000);
        int data;
        while ((data = randomAccessFile.read()) != -1) {
            stringBuilder.append((char) data);
        }

        randomAccessFile.close();

        return randomAccessFile.toString();
    }

    private static void writeString(String string) throws IOException {
        randomAccessFile = new RandomAccessFile(path, "r");
        randomAccessFile.write(string.getBytes());
        randomAccessFile.close();
    }
}
