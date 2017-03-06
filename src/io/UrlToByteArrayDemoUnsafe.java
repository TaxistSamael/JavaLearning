package io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlToByteArrayDemoUnsafe {
    public static void main(String[] args) throws IOException {
        final URL url = new URL("http://google.com");
        final InputStream src = url.openStream();
        ByteArrayOutputStream dst = new ByteArrayOutputStream();

        copy(src, dst);

        byte[] rawData = dst.toByteArray();
        String html = new String(rawData, "ascii");
        System.out.println(html);
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
