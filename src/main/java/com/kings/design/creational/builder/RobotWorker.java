package com.kings.design.creational.builder;

public class RobotWorker {
    public Robot createRobot(SmartRobotBuilder smartRobotBuilder){
        smartRobotBuilder.createHead();
        smartRobotBuilder.createBody();
        smartRobotBuilder.createLegs();
        return smartRobotBuilder.createRobot();
    }
}


