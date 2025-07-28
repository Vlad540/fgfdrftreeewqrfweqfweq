package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* renamed from: lu1  reason: default package */
public class lu1 extends ibe {
    public final CameraCharacteristics E(String str) {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    public final void Z(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.b).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.a(e);
        }
    }

    public final void b0(ryc ryc, fr1 fr1) {
        ((CameraManager) this.b).registerAvailabilityCallback(ryc, fr1);
    }

    public final void g0(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
