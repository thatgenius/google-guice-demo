package googleguicedemo.dependency.impl;

import googleguicedemo.dependency.Dependency;

public class DependencyImplOne implements Dependency {
    public String getGreetingLine() {
        return "Hi";
    }
}
