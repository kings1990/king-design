package com.kings.design.creational.builder;

public interface RobotBuilder {

    void createHead();
    void createBody();
    void createLegs();
    Robot createRobot();
}


