package com.kings.design.structure.facecade;

public class FaceCader {
    private final Tv tv;
    private final Light light;
    private final AirConditioner airConditioner;
    
    public FaceCader(Tv tv, Light light, AirConditioner airConditioner) {
        this.tv = tv;
        this.light = light;
        this.airConditioner = airConditioner;
    }
    
    public void allOpen() {
        light.open();
        tv.open();
        airConditioner.open();
    }
    
    public void allClose() {
        light.close();
        tv.close();
        airConditioner.close();
    }
}


