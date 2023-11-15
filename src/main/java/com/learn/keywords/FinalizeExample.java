package com.learn.keywords;

public class FinalizeExample {

    public static void main(String[] args) {
        SampleObject obj = new SampleObject();
        obj = null; // Make the object eligible for garbage collection
        System.gc(); // Suggest the garbage collector to run (not guaranteed)
        /*
        Note: Explicitly calling System.gc() is not recommended in regular application code, as the garbage collector runs automatically.
        This is just for illustration purposes.
         */
    }
}

class SampleObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object finalized");
    }
}
