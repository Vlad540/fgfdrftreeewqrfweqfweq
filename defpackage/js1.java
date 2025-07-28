package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* renamed from: js1  reason: default package */
public final class js1 extends mv4 {
    public static final z80 X = new z80(Integer.TYPE, (Object) null, "camera2.captureRequest.templateType");
    public static final z80 Y = new z80(Long.TYPE, (Object) null, "camera2.cameraCaptureSession.streamUseCase");
    public static final z80 Z = new z80(CameraDevice.StateCallback.class, (Object) null, "camera2.cameraDevice.stateCallback");
    public static final z80 w0 = new z80(CameraCaptureSession.StateCallback.class, (Object) null, "camera2.cameraCaptureSession.stateCallback");
    public static final z80 x0 = new z80(CameraCaptureSession.CaptureCallback.class, (Object) null, "camera2.cameraCaptureSession.captureCallback");
    public static final z80 y0 = new z80(String.class, (Object) null, "camera2.cameraCaptureSession.physicalCameraId");

    public static z80 Q(CaptureRequest.Key key) {
        return new z80(Object.class, key, "camera2.captureRequest.option." + key.getName());
    }
}
