package org.example.style1.lib;

public class oneFile {

    static String A(String str) {
        return str + "A";
    }

    static String B(String str) {
        return str + "B";
    }

    static String C(String str) {
        return str + "C";
    }

    static String AB(String str) {
        return B(A(str));
    }


    static String AC(String str) {
        return C(A(str));
    }

    public static String AACABA(String str) {
        return A(AC(AB(A(str))));
    }

}
