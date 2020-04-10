package com.kings.design.creational.builder;

public class SmartRobotBuilder implements RobotBuilder {
    Robot robot = new Robot();

    @Override
    public void createHead() {
        String head = "head";
        String materials = "芯片";
        String resultHead = materials + head;
        robot.setHead(resultHead);
    }

    @Override
    public void createBody() {
        robot.setBody("body");
    }

    @Override
    public void createLegs() {
        String legs = "legs";
        String materials = "石墨";
        String resultLegs = materials + legs;
        robot.setLegs(resultLegs);
    }

    @Override
    public Robot createRobot() {
        return robot;
    }
}


