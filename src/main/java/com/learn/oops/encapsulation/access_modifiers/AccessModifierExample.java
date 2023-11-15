package com.learn.oops.encapsulation.access_modifiers;

import com.learn.oops.encapsulation.subclass_package.SubclassProtectedExample;

public class AccessModifierExample {
    public static void main(String[] args) {
        PublicExample publicExample = new PublicExample();
        publicExample.publicField = 10;
        publicExample.publicMethod();

        DefaultExample defaultExample = new DefaultExample();
        defaultExample.defaultField = 20;
        defaultExample.defaultMethod();

        // Accessing protected members using inheritance
        SubclassProtectedExample subclassProtectedExample = new SubclassProtectedExample();
        subclassProtectedExample.protectedField = 30;
        subclassProtectedExample.protectedMethod();

        // Private members are not accessible here
        PrivateExample privateExample = new PrivateExample();
    }
}
