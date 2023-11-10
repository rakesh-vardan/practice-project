package com.learn.oops.polymorphism;

public class BankDemo {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        Hdfc hdfc = new Hdfc();
        Axis axis = new Axis();

        Bank rbi = new Bank();
        System.out.println("RBI Interest: "+rbi.getRateOfInterest());
        System.out.println("SBI Interest: "+sbi.getRateOfInterest());
        System.out.println("HDFC Interest: "+hdfc.getRateOfInterest());
        System.out.println("AXIS Interest: "+axis.getRateOfInterest());
    }
}
