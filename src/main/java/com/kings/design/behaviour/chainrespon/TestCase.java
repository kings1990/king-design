package com.kings.design.behaviour.chainrespon;

import java.util.List;

public class TestCase {
    public static void main(String[] args) {
        List<DutyPosition> positionList = ChainFactory.init();
        LeaveRequestSubmit requestSubmit = new LeaveRequestSubmit();
        requestSubmit.setPositionList(positionList);
        LeaveRequest request1 = new LeaveRequest("张三",1,"参加考试");
        LeaveRequest request2 = new LeaveRequest("李四",2,"回家");
        requestSubmit.submit(request1);
        requestSubmit.submit(request2);
    }
}


