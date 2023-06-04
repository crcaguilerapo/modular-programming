package org.example.style5.lib.ioc;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.example.style5.lib.A;
import org.example.style5.lib.B;
import org.example.style5.lib.C;

public class Alphabet extends AbstractModule {


    @Provides
    @Singleton
    public A a(B b, C c) {
        return new A(b, c);
    }


    @Provides
    @Singleton
    public B b() {
        return new B();
    }

    @Provides
    @Singleton
    public C c() {
        return new C();
    }
}
