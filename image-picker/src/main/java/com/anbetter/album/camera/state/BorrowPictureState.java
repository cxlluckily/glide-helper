package com.anbetter.album.camera.state;

import android.view.Surface;
import android.view.SurfaceHolder;

import com.anbetter.album.camera.CameraInterface;
import com.anbetter.album.camera.JCameraView;
import com.anbetter.album.camera.util.LogUtil;

/**
 * =====================================
 * 作    者: 陈嘉桐
 * 版    本：1.1.4
 * 创建日期：2017/9/8
 * 描    述：
 * =====================================
 */
public class BorrowPictureState implements State {

    private final String TAG = "BorrowPictureState";
    private CameraMachine machine;

    public BorrowPictureState(CameraMachine machine) {
        this.machine = machine;
    }

    @Override
    public void start(SurfaceHolder holder, float screenProp) {
        CameraInterface.getInstance().doStartPreview(holder, screenProp);
        machine.setState(machine.getPreviewState());
    }

    @Override
    public void stop() {

    }

    @Override
    public void focus(float x, float y, CameraInterface.FocusCallback callback) {

    }

    @Override
    public void switchCamera(SurfaceHolder holder, float screenProp) {

    }

    @Override
    public void restart() {

    }

    @Override
    public void capture() {

    }

    @Override
    public void record(Surface surface, float screenProp) {

    }

    @Override
    public void stopRecord(boolean isShort, long time) {

    }

    @Override
    public void cancel(SurfaceHolder holder, float screenProp) {
        CameraInterface.getInstance().doStartPreview(holder, screenProp);
        machine.getView().resetState(JCameraView.TYPE_PICTURE);
        machine.setState(machine.getPreviewState());
    }

    @Override
    public void confirm() {
        machine.getView().confirmState(JCameraView.TYPE_PICTURE);
        machine.setState(machine.getPreviewState());
    }

    @Override
    public void zoom(float zoom, int type) {
        LogUtil.i(TAG, "zoom");
    }

    @Override
    public void flash(String mode) {

    }

}