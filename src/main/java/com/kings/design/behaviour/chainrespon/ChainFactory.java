package com.kings.design.behaviour.chainrespon;

import java.util.ArrayList;
import java.util.List;

public class ChainFactory {
    public static List<DutyPosition> init() {
        List<DutyPosition> positionList = new ArrayList<>();
        DutyPosition leader = new Leader("老王");
        DutyPosition manager = new Manager("老陈");
        positionList.add(leader);
        positionList.add(manager);
        return positionList;
    }
}


