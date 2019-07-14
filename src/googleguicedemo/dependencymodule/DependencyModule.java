package googleguicedemo.dependencymodule;

import com.google.inject.Binder;
import com.google.inject.Module;
import googleguicedemo.dependency.Dependency;
import googleguicedemo.dependency.impl.DependencyImplTwo;

public class DependencyModule implements Module {

    public void configure(Binder binder) {
        binder.bind(Dependency.class).to(DependencyImplTwo.class);
    }
}

