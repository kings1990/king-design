package com.kings.design.behaviour.chainrespon;

import lombok.Data;

@Data
public abstract class DutyPosition {
    private String name;
    private DutyPosition nextDutyPosition;

    public DutyPosition() {
    }

    public DutyPosition(String name) {
        this.name = name;
    }

    public abstract boolean supportDays(Integer days);

    /**
     * <p class="detail">
     * 功能:常用过滤器的话直接用void 因为不需要截断  此处考虑页面需要截断
     * </p>
     *
     * @param leaveRequest :
     * @return boolean
     * @author Kings
     * @date 2020.04.25
     */
    public abstract boolean handler(LeaveRequest leaveRequest);
}


