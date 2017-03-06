package io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class UrlToByteArrayDemoTryWithResources {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://google.com");

        try (InputStream src = url.openStream();
             ByteArrayOutputStream dst = new ByteArrayOutputStream()) {

            copy(src, dst);
            byte[] bytes = dst.toByteArray();
            String html = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(html);

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
