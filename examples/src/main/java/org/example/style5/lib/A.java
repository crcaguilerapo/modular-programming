package org.example.style5.lib;

import com.google.inject.Inject;

public class A {

    private final B b;
    private final C c;

    @Inject
    public A(B b, C c) {
        this.b = b;
        this.c = c;
    }


    String A(String str) {
        return str + "A";
    }

    String AB(String str) {
        return b.B(A(str));
    }


    String AC(String str) {
        return c.C(A(str));
    }

    public String AACABA(String str) {
        return A(AC(AB(A(str))));
    }
}
