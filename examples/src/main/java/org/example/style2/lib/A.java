package org.example.style2.lib;

public class A {

    static String A(String str) {
        return str + "A";
    }

    static String AB(String str) {
        return B.B(A(str));
    }


    static String AC(String str) {
        return C.C(A(str));
    }

    public static String AACABA(String str) {
        return A(AC(AB(A(str))));
    }
}
