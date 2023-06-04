package org.example.style3.myCode;

import org.example.style3.lib.A;
import org.example.style3.lib.B;
import org.example.style3.lib.LetterC;

public class EntryPoint {
    public static String start() {
        LetterC c = new LetterC() {
            @Override
            public String C(String str) {
                return str + "c";
            }
        };

        B myB = new MyB();

        A a = new A(myB, c);

        return a.AACABA("");
    }
}
