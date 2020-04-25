package com.kings.design.behaviour.chainrespon;

public class TestCase1 {
    public static void main(String[] args) {
        ChainComposite composite = new ChainComposite();
        composite.init();
        LeaveRequest request1 = new LeaveRequest("张三",1,"参加考试");
        LeaveRequest request2 = new LeaveRequest("李四",2,"回家");
        composite.handler(request1);
        composite.handler(request2);
        
    }
}


