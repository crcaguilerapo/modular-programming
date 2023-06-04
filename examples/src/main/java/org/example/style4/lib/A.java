package org.example.style4.lib;

import java.util.function.Function;

public class A {

    static String A(String str) {
        return str + "A";
    }

    static String AB(String str) {
        return B.B(A(str));
    }

    static String AC(String str) {
        return A(C.C(str));
    }

    static String AACABA(String str) {
        return A(AC(AB(A(str))));
    }

    public static String AACABA(String str, Function<String, String> fAC) {
        return A(fAC.apply(AB(A(str))));
    }
}
