package com.kings.design.creational.builder;

public class TestCase {
    public static void main(String[] args) {
        RobotWorker worker = new RobotWorker();
        Robot robot = worker.createRobot(new SmartRobotBuilder());
        System.out.println("头:" + robot.getHead());
        System.out.println("身体:" + robot.getBody());
        System.out.println("腿:" + robot.getLegs());
    }
}


