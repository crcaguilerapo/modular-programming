package org.example.style4.myCode;


import org.example.style4.lib.A;

public class EntryPoint {

    static String AC(String str) {
        return str + "A" + "c";
    }

    public static String start() {
        return A.AACABA("", EntryPoint::AC);
    }
}