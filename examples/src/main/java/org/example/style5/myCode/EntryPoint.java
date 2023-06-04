package org.example.style5.myCode;


import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.style5.lib.A;
import org.example.style5.myCode.ioc.MyAlphabet;

public class EntryPoint {

    public static String start() {
        Injector injector = Guice.createInjector(new MyAlphabet());
        A a = injector.getInstance(A.class);
        return a.AACABA("");
    }
}
