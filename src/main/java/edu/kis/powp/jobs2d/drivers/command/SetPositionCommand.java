package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x, y = 0;

    public SetPositionCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        job2dDriver.setPosition(this.x, this.y);
    }
}
