package googleguicedemo.dependencyusage;

import com.google.inject.Inject;
import googleguicedemo.dependency.Dependency;

public class DependingClass {
    @Inject
    private Dependency dependency;

    public void test() {
        System.out.println(String.format("%s world!", dependency.greet()));
    }
}
