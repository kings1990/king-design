package com.kings.design.behaviour.chainrespon;

public class Leader extends DutyPosition {
    
    public Leader(String name) {
        super(name);
    }
    
    @Override
    public boolean supportDays(Integer days) {
        return days == 1;
    }
    
    @Override
    public boolean handler(LeaveRequest request) {
        if (supportDays(request.getDays())) {
            String msg = String.format("【%s】经理审批【%s】的请假:请假天数【%d】天，请假原因：【%s】", getName(), request.getName(), request.getDays(), request.getReason());
            System.out.println(msg);
            return true;
        } else {
            if (this.getNextDutyPosition() != null) {
                return getNextDutyPosition().handler(request);
            } else {
                return false;
            }
        }
    }
}


