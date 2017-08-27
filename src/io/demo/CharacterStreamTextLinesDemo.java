package io.demo;

import java.io.*;

/**
 * Read/Write the hole string line.
 * It just separate the string by \n \r characters.
 */
public class CharacterStreamTextLinesDemo {

    private static final String fromFile = "D:\\tmp\\io_demo_file.txt";
    private static final String toFile = "D:\\tmp\\io_demo_to_file.txt";

    public static void main(String[] args) {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            //read/write line
            inputStream = new BufferedReader(new FileReader(fromFile));
            outputStream = new PrintWriter(new FileWriter(toFile));

            String line;
            while ((line = inputStream.readLine()) != null) {
                outputStream.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
