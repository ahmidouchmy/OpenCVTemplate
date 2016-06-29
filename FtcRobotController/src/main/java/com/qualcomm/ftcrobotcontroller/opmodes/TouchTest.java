package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by Justin on 6/28/2016.
 */
public class TouchTest extends OpMode {

    TouchSensor ts;
    @Override
    public void init() {
        ts=hardwareMap.touchSensor.get("ts");
    }

    @Override
    public void loop() {
        telemetry.addData("Data name","Data");
    }
}
