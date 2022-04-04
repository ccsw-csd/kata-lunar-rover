package com.capgemini.ccsw.codingdojo.lunarrover;

/**
 *
 */
public class Rover {

    private Point position;

    private Orientation orientation;

    public Rover() {
        this.position = new Point(0, 0);
        this.orientation = Orientation.NORTH;
    }

    public void sendCommand(char command) {
    }

}
