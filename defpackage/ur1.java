package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ur1  reason: default package */
public final class ur1 implements zr1 {
    public final zq1 a;
    public boolean b = false;

    public ur1(zq1 zq1) {
        this.a = zq1;
    }

    public final ch7 a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        Integer num2;
        as6 w = ct0.w(Boolean.TRUE);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return w;
        }
        int intValue = num.intValue();
        if ((intValue == 1 || intValue == 2) && (num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)) != null && num2.intValue() == 0) {
            this.b = true;
            this.a.h.e(false);
        }
        return w;
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
        if (this.b) {
            this.a.h.a(true, false);
        }
    }
}
