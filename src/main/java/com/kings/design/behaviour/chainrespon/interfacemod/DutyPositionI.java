package com.kings.design.behaviour.chainrespon.interfacemod;

import com.kings.design.behaviour.chainrespon.LeaveRequest;

public interface DutyPositionI {
    boolean supportDays(Integer days);
    
    /**
     * <p class="detail">
     * 功能:常用过滤器的话直接用void 因为不需要截断  此处考虑页面需要截断
     * </p>
     * @param leaveRequest :
     *
     * @return boolean
     * @author Kings
     * @date 2020.04.25
     */
    Object handler(LeaveRequest leaveRequest);
}


