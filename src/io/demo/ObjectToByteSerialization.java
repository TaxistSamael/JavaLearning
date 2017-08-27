package io.demo;

import java.io.*;

public class ObjectToByteSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(bytes);

        TestClass obj = new TestClass("test");
        out.writeObject(obj);
        out.flush();
        byte [] arr = bytes.toByteArray();

        ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(arr));
        System.out.println(in.readObject());

        out.close();
        in.close();
    }

    private static class TestClass implements Serializable {
        String name;

        public TestClass(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "TestClass{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
