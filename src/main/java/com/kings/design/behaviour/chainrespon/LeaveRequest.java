package com.kings.design.behaviour.chainrespon;

import lombok.Data;

@Data
public class LeaveRequest {
    private String name;
    private Integer days;
    private String reason;
    
    public LeaveRequest(String name, Integer days, String reason) {
        this.name = name;
        this.days = days;
        this.reason = reason;
    }
}


