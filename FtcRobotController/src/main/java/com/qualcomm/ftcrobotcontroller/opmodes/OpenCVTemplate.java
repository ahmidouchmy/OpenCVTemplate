package com.qualcomm.ftcrobotcontroller.opmodes;

import android.util.Log;
import android.view.SurfaceView;

import com.qualcomm.ftcrobotcontroller.FtcRobotControllerActivity;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.opencv.android.CameraBridgeViewBase;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 * Created by Justin on 6/29/2016.
 */
public class OpenCVTemplate extends OpMode implements CameraBridgeViewBase.CvCameraViewListener2 {
    CameraBridgeViewBase mCameraView;
    public static Size matsizesmall;


    @Override
    public void init() {
        matsizesmall= new Size(384,288);
        setUpView();
    }

    @Override
    public void loop() {

    }
    @Override
    public void stop(){
        mCameraView.disableView();
    }

    @Override
    public void onCameraViewStarted(int width, int height) {

    }

    @Override
    public void onCameraViewStopped() {

    }

    @Override
    public Mat onCameraFrame(CameraBridgeViewBase.CvCameraViewFrame inputFrame) {
        Mat mat=inputFrame.rgba();
        Log.d("Mat size", Integer.toString(mat.cols()) + "x" + Integer.toString(mat.rows()));
        Core.transpose(mat, mat);
        Core.flip(mat,mat,1);
        return mat;
    }
    public void setUpView(){
        mCameraView= FtcRobotControllerActivity.mOpenCvCameraView;
        mCameraView.enableView();
        mCameraView.setVisibility(SurfaceView.VISIBLE);
        mCameraView.setCvCameraViewListener(this);
    }
}
