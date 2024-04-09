package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly rwonly = new RWOnly();
//        RWOnly.name = "5";
//        name has private access in com.driver.RWOnly
        rwonly.setName("Hello");
        System.out.println(rwonly.getName());
    }
}