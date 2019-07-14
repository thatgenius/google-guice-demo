package googleguicedemo;

import com.google.inject.*;
import googleguicedemo.dependencymodule.DependencyModule;
import googleguicedemo.dependencyusage.DependingClass;

public class Demo {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DependencyModule());
        DependingClass dependingClass = injector.getInstance(DependingClass.class);
        dependingClass.test();
    }
}






