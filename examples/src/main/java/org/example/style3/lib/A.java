package org.example.style3.lib;

public class A {

    B b;
    LetterC c;

    public A() {
        this.b = new B();
        this.c = new C();
    }

    public A(LetterC c) {
        this.b = new B();
        this.c = c;
    }

    public A(B b) {
        this.b = b;
        this.c = new C();
    }

    public A(B b, LetterC c) {
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
