package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

/**
 * Created by Justin on 6/28/2016.
 */
public class odstest extends OpMode {
    OpticalDistanceSensor ods;
    IrSeekerSensor ir;
    @Override
    public void init() {
        ods=hardwareMap.opticalDistanceSensor.get("ods");
        ir=hardwareMap.irSeekerSensor.get("ir");
    }

    @Override
    public void loop() {
        telemetry.addData("ODS",ods.getLightDetected());
        telemetry.addData("ODSRaw",ods.getLightDetectedRaw());
        telemetry.addData("irangle", ir.getAngle());
        telemetry.addData("irstrength", ir.getStrength());
    }
}
