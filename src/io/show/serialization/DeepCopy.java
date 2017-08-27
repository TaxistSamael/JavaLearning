package io.show.serialization;

import java.io.*;

public class DeepCopy {

    public static class Address implements Serializable, Cloneable {
        public String street;

        public Address() {

        }

        public Address(String street) {
            this.street = street;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Address address = new Address();
            address.street = String.copyValueOf(street.toCharArray());
            return address;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        Address origin = new Address();
        origin.street = "green";
        Address copy = (Address) copyClone(origin);

        System.out.println(origin.street);
        System.out.println(copy.street);

        System.out.println(copy == origin);
        System.out.println(copy.street == origin.street);
        System.out.println(copy.street.equals(origin.street));
        System.out.println(origin.toString() + ": " + copy.toString());
    }

    private static Object copySerialization(Object src) throws IOException, ClassNotFoundException {

        //ObjectOutput -> ObjectOutputStream -> OutputStream -> ByteArrayOutputStream -> byte []

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(buffer);

        out.writeObject(src);
        out.flush();
        out.close();

        byte[] byteArray = buffer.toByteArray();

        return new ObjectInputStream(new ByteArrayInputStream(byteArray)).readObject();
    }

    private static Object copyClone(Address src) throws CloneNotSupportedException {
        return src.clone();
    }
}
