package io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class CopyToFile {
    public static void main(String[] args) throws IOException {
        final URL url = new URL("http://www.google.com");
        final InputStream src = url.openStream();

        final File dir = new File("D:\\tmp");
        dir.mkdir();

        final File file = new File("D:\\tmp\\google.html");

        FileOutputStream dst = new FileOutputStream(file); //this is file adapter. It converts File -> OutputStream

        copy(src, dst);

        src.close();
    }

    private static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int elem = src.read();
            if (elem != -1) {
                dst.write(elem);
            } else {
                break;
            }
        }
    }
}
