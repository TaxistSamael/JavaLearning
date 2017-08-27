package io.show;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

    private static final String fromFile = "D:\\test\\tmp\\io_demo_file.txt";
    private static final String toFile = "D:\\test\\tmp\\io_demo_to_file.txt";

    /**
     * FileReader/Writer holds characters, but not bytes.
     */
    public static void main(String[] args) {

        //uses default buffer and encoding. To specify custom encoding and buffer - use FileInputStream/FileOutputStream
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(fromFile);
            outputStream = new FileWriter(toFile);

            int oneByte;

            while ((oneByte = inputStream.read()) != -1) {
                outputStream.write(oneByte);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream == null || outputStream == null) return;

            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
