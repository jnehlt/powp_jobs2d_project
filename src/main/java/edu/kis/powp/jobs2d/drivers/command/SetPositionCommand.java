package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class SetPositionCommand implements DriverCommand{
    private int x, y = 0;

    SetPositionCommand() {}

    @Override
    public void execute() {
        //tbc
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void operateTo(int x, int y) {

    }
}
