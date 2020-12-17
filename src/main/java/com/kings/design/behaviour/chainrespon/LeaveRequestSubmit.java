package com.kings.design.behaviour.chainrespon;

import java.util.List;

public class LeaveRequestSubmit {
    private List<DutyPosition> positionList;
    
    public List<DutyPosition> getPositionList() {
        return positionList;
    }
    
    public void setPositionList(List<DutyPosition> positionList) {
        this.positionList = positionList;
    }
    
    public void submit(LeaveRequest request) {
        for (DutyPosition dutyPosition : getPositionList()) {
            if (dutyPosition.handler(request)) {
                return;
            }
        }
    }
}


