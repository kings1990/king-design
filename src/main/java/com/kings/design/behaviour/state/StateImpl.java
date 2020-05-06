package com.kings.design.behaviour.state;

//提供预定和入住
class FreeTimeState implements State {

    Context context;

    public FreeTimeState(Context context) {
        this.context = context;
    }

    @Override
    public void reserveRoom() {
        System.out.println("您已预定房间");
        context.setState(context.getBookedState());
    }


    @Override
    public void unReserveRoom() {

    }

    @Override
    public void checkInRoom() {
        System.out.println("您已入住房间");
        context.setState(context.getCheckInState());
    }

    @Override
    public void checkOutRoom() {

    }
}

//预定状态下可以入住或取消入住
class BookedState implements State {

    Context context;

    public BookedState(Context context) {
        this.context = context;
    }

    @Override
    public void reserveRoom() {
        System.out.println("该房间已经被预订");
    }

    @Override
    public void unReserveRoom() {
        System.out.println("您已取消预订房间");
        context.setState(context.getFreeTimeState());
    }

    @Override
    public void checkInRoom() {
        System.out.println("您已入住房间");
        context.setState(context.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        System.out.println("还未入住，不能退房");
    }
}

//入住状态只能退房
class CheckInState implements State {

    Context context;

    public CheckInState(Context context) {
        this.context = context;
    }

    @Override
    public void reserveRoom() {
        System.out.println("该房间已经入住，不能预订");
    }
    
    @Override
    public void unReserveRoom() {
        System.out.println("该房间已经入住，不能退订");
    }

    @Override
    public void checkInRoom() {
        System.out.println("该房间已经入住，不能再次入住");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("您已退房");
        context.setState(context.getFreeTimeState());
    }
}