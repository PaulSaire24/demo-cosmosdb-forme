package com.example.democosmosdb.certificate.solidfundations;

public class Practice1 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.add(1, 2));
        System.out.println(p.add(1.0, 2.0));
        System.out.println(p.add("1", "2"));
        System.out.println(p.add(1, 2.0));
    }
}
