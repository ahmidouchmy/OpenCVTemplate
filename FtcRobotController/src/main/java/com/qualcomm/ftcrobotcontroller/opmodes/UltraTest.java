package com.qualcomm.ftcrobotcontroller.opmodes;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.LegacyModule;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.UltrasonicSensor;
import com.qualcomm.robotcore.hardware.IrSeekerSensor;


/**
 * Created by Justin on 6/28/2016.
 */
public class UltraTest extends OpMode {
//    UltrasonicSensor ultra;
//    LegacyModule legacy;
//    IrSeekerSensor ir;
//    TouchSensor touch;
    DeviceInterfaceModule mDeviceInterface;
    ColorSensor color;
    @Override
    public void init() {
//        ultra=hardwareMap.ultrasonicSensor.get("ultra");
//        legacy=hardwareMap.legacyModule.get("legacy");
//        ir=hardwareMap.irSeekerSensor.get("ir");
//        touch=hardwareMap.touchSensor.get("touch");
//        legacy.enable9v(4,true);
        mDeviceInterface=hardwareMap.deviceInterfaceModule.get("Device");
        color=hardwareMap.colorSensor.get("color");
        color.setI2cAddress(0x42);
        color.enableLed(true);
    }

    @Override
    public void loop() {
        telemetry.addData("A0 Input",mDeviceInterface.getAnalogInputValue(0));
//        telemetry.addData("Level",ultra.getUltrasonicLevel());
//        telemetry.addData("Status",ultra.status());
//        telemetry.addData("irAngle",ir.getAngle());
//        telemetry.addData("irStrength", ir.getStrength());
//        telemetry.addData("touchvalue", touch.getValue());
//        telemetry.addData("touchpressed", touch.isPressed());

    }
}
