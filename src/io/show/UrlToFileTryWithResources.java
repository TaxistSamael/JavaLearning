package io.show;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlToFileTryWithResources {

    public static void main(String[] args) throws MalformedURLException {
        long start = System.currentTimeMillis();

        final URL url = new URL("http://www.google.com");
        final File dir = new File("D:\\test\\tmp");
        dir.mkdir();
        final File file = new File("d:\\test\\tmp\\google.html");

        try (InputStream src = url.openStream();
             OutputStream dst = new FileOutputStream(file)) {

            int elem;
            while ((elem = src.read()) != -1) {
                dst.write(elem);
                dst.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("aaaaaaa: " + (System.currentTimeMillis() - start));
    }
}
