package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class SetPositionCommand implements DriverCommand{
    private int startX, startY = 0;
    private DrawPanelController dpc;

    SetPositionCommand(DrawPanelController dpc) {
        this.dpc = dpc;
    }

    @Override
    public void execute() {
        //tbc
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        this.dpc.drawLine(line);
        this.setPosition(x, y);
    }
}
