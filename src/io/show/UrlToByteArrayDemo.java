package io.show;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class UrlToByteArrayDemo {

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
        int elem;
        while ((elem = src.read()) != -1) dst.write(elem);
    }


}
