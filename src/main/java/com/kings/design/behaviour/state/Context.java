package com.kings.design.behaviour.state;
//定义当前的状态

public class Context {
    
    private State state;
    /**
     * 引入具体状态主要为了真的改变状态
     */
    private final State freeTimeState;
    private final State bookedState;
    private final State checkInState;
    
    /**
     * 初始化状态,绑定所有状态
     */
    public Context() {
        freeTimeState = new FreeTimeState(this);
        bookedState = new BookedState(this);
        checkInState = new CheckInState(this);
        state = freeTimeState;
    }
    
    public void reserveRoom() {
        state.reserveRoom();
    }
    
    public void unReserveRoom() {
        state.unReserveRoom();
    }
    
    public void checkInRoom() {
        state.checkInRoom();
    }
    
    public void checkOutRoom() {
        state.checkOutRoom();
    }
    
    public void showRoomStateNow() {
        System.out.println("当前状态：" + state.getClass().getSimpleName());
    }
    
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public State getFreeTimeState() {
        return freeTimeState;
    }
    
    public State getBookedState() {
        return bookedState;
    }
    
    public State getCheckInState() {
        return checkInState;
    }
    
}