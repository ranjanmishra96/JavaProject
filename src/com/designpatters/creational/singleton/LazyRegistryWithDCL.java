package com.designpatters.creational.singleton;

public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL(){}

    private static volatile LazyRegistryWithDCL INSTANCE ;
     // Volatile forces values read / write from main memory instead of cache

    public static LazyRegistryWithDCL getINSTANCE(){
        if(INSTANCE == null){
            synchronized (LazyRegistryWithDCL.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyRegistryWithDCL();
                }

            }
        }
        return INSTANCE;
    }
}
