package com.kings.design.behaviour.chainrespon.interfacemod;

import com.kings.design.behaviour.chainrespon.LeaveRequest;

public class ManagerI implements DutyPositionI {
    
    String name;
    
    public ManagerI(String name) {
        this.name = name;
    }
    
    @Override
    public boolean supportDays(Integer days) {
        return days > 1;
    }
    
    @Override
    public Object handler(LeaveRequest request) {
        String msg = String.format("【%s】经理审批【%s】的请假:请假天数【%d】天，请假原因：【%s】", this.name, request.getName(), request.getDays(), request.getReason());
        System.out.println(msg);
        return msg;
    }
}


