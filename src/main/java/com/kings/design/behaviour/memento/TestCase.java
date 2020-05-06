package com.kings.design.behaviour.memento;

public class TestCase {
    public static void main(String[] args) {
        Role role = new Role(100, 100);
        System.out.println("第三关开始======我要存档====");
        role.display();

        CareTaker careTaker = new CareTaker();
        //只有当前角色才能访问的存档
        careTaker.setMemento(role.createMemento());

        System.out.println("继续闯关=====");
        role.setBlood(10);
        role.setMagic(0);

        System.out.println("干boss，状态不行=====");
        role.display();

        role.restoreStatus(careTaker.getMemento());
        System.out.println("恢复状态再来一遍======");
        role.display();
    }
}


