package com.java24hours;

public class ModemTester{
    
    public static void main(String[] arguments){
        CableModem surfBoard = new CableModem();
        DslModem gateway = new DslModem();
        surfBoard.speed = 500000;
        gateway.speed = 400000;
        System.out.println("Trying to connect to Cable Modem");
        surfBoard.displaySpeed();
        surfBoard.connect();
        System.out.println("Trying to connect to DSL modem");
        gateway.displaySpeed();
        gateway.connect();
    }
}