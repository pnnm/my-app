package com.mycompany.app.stringclass;

public class StringMemoryTest {
    public static void main(String[] args) {
        String a = "swapna";
        System.out.println(a.hashCode());
        a = "ponnam";
        System.out.println(a.hashCode());
        System.out.println(a);
        a="Swapna";
        System.out.println(a.hashCode());
    }
}
