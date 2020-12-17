package com.kings.design.structure.facecade;

public class TestCase {
    public static void main(String[] args) {
        FaceCader faceCader = new FaceCader(new Tv(), new Light(), new AirConditioner());
        System.out.println("回到家/...");
        faceCader.allOpen();
        
        System.out.println("------------");
        
        System.out.println("准备睡觉/...");
        faceCader.allClose();
    }
}


