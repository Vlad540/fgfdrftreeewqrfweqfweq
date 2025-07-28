package defpackage;

import android.hardware.camera2.CameraManager;

/* renamed from: fr1  reason: default package */
public final class fr1 extends CameraManager.AvailabilityCallback implements av1 {
    public final String a;
    public boolean b = true;
    public final /* synthetic */ lr1 c;

    public fr1(lr1 lr1, String str) {
        this.c = lr1;
        this.a = str;
    }

    public final void onCameraAvailable(String str) {
        if (this.a.equals(str)) {
            this.b = true;
            if (this.c.W0 == 4) {
                this.c.J(false);
            }
        }
    }

    public final void onCameraUnavailable(String str) {
        if (this.a.equals(str)) {
            this.b = false;
        }
    }
}
