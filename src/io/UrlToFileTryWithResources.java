package io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by User on 05.03.2017.
 */
public class UrlToFileTryWithResources {

    public static void main(String[] args) throws MalformedURLException {
        final URL url = new URL("http://www.google.com");
        final File dir = new File("D:\\tmp");
        dir.mkdir();
        final File file = new File("d:\\tmp\\google.html");

        try(InputStream src = url.openStream();
        OutputStream dst = new FileOutputStream(file)) {
            copy(src, dst);
            dst.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
