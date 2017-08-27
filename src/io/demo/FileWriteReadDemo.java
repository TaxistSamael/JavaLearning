package io.demo;

import java.io.*;

public class FileWriteReadDemo {
    private static final String path = "d:\\tmp\\file_write_read.txt";

    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream(path);

        try {
        out.write('H');
        out.write(new byte[] {'e', 'l', 'l', 'o', ' ', 'Y'});
        out.write(new byte[] {'a', 'k', 'o', 'v'});
        out.flush();
        } finally {
            out.close();
        }

        InputStream in = new FileInputStream(path);

        try {
            int ch;
            while ((ch = in.read()) >= 1) {
                System.out.print((char) ch);
            }
        } finally {
            in.close();
        }

        if(!new File(path).delete()) { //SecurityException could be thrown
            System.out.println("File not deleted");
        }
    }
}
