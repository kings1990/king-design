package com.kings.design.behaviour.chainrespon;

import java.util.LinkedList;
import java.util.List;

/**
 * 参考spring源码 HandlerMethodReturnValueHandlerComposite
 */
public class ChainComposite extends DutyPosition {
    private final List<DutyPosition> positionList = new LinkedList<>();

    public ChainComposite() {
    }

    public List<DutyPosition> init (){
        DutyPosition leader = new Leader("老王");
        DutyPosition manager = new Manager("老陈");
        positionList.add(leader);
        positionList.add(manager);
        return positionList;
    }
    
    private DutyPosition getDutyPosition(Integer days){
        for (DutyPosition dutyPosition : positionList) {
            if(dutyPosition.supportDays(days)){
                return dutyPosition;
            }
        }
        return null;
    }

    @Override
    public boolean supportDays(Integer days) {
        return getDutyPosition(days) != null;
    }

    @Override
    public boolean handler(LeaveRequest leaveRequest) {
        if(leaveRequest == null){
            return false;
        }
        DutyPosition dutyPosition = getDutyPosition(leaveRequest.getDays());
        if(dutyPosition == null){
            return false;
        }
        dutyPosition.handler(leaveRequest);
        return true;
    }
}


