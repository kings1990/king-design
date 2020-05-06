package com.kings.design.behaviour.state;

public class StateTest {
    
    public static void main(String args[]) {
        Context[] contextArray = new Context[2];
        for (int i = 0; i < contextArray.length; i++) {
            contextArray[i] = new Context();
        }
        contextArray[0].reserveRoom();
        contextArray[0].showRoomStateNow();

        contextArray[0].checkOutRoom();
        contextArray[0].showRoomStateNow();
    }
}