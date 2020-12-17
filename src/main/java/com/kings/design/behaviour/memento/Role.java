package com.kings.design.behaviour.memento;

public class Role {
    private int blood;
    private int magic;
    
    public Role(int blood, int magic) {
        this.blood = blood;
        this.magic = magic;
    }
    
    public void display() {
        System.out.println("当前状态");
        System.out.println("血量:" + this.blood + ",蓝量:" + this.magic);
    }
    
    //从备忘录里面找
    public void restoreStatus(Memento memento) {
        this.blood = memento.getBlood();
        this.magic = memento.getMagic();
    }
    
    public Memento createMemento() {
        return new Memento(blood, magic);
    }
    
    public int getBlood() {
        return blood;
    }
    
    public void setBlood(int blood) {
        this.blood = blood;
    }
    
    public int getMagic() {
        return magic;
    }
    
    public void setMagic(int magic) {
        this.magic = magic;
    }
}


