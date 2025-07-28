package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: ow1  reason: default package */
public final class ow1 extends ps1 {
    public final CameraCaptureSession.CaptureCallback a;

    public ow1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
