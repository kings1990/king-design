package com.kings.design.behaviour.chainrespon.interfacemod;

import com.kings.design.behaviour.chainrespon.LeaveRequest;

import java.util.LinkedList;
import java.util.List;

/**
 * 参考spring源码 HandlerMethodReturnValueHandlerComposite
 */
public class ChainComposite implements DutyPositionI {
    private final List<DutyPositionI> positionList = new LinkedList<>();
    
    public ChainComposite() {
    }
    
    public List<DutyPositionI> init() {
        DutyPositionI leader = new LeaderI("老王");
        DutyPositionI manager = new ManagerI("老陈");
        positionList.add(leader);
        positionList.add(manager);
        return positionList;
    }
    
    private DutyPositionI getDutyPosition(Integer days) {
        for (DutyPositionI dutyPosition : positionList) {
            if (dutyPosition.supportDays(days)) {
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
    public Object handler(LeaveRequest leaveRequest) {
        if (leaveRequest == null) {
            return null;
        }
        DutyPositionI dutyPosition = getDutyPosition(leaveRequest.getDays());
        if (dutyPosition == null) {
            return null;
        }
        return dutyPosition.handler(leaveRequest);
    }
}


