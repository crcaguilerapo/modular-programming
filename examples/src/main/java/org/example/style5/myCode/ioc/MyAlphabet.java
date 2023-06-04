package org.example.style5.myCode.ioc;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.example.style5.lib.B;
import org.example.style5.myCode.MyB;

public class MyAlphabet extends AbstractModule {
    @Provides
    @Singleton
    public B b() {
        return new MyB();
    }
}
