package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: as1  reason: default package */
public final class as1 implements yq1 {
    public sn1 a;
    public final vn1 b = hwf.f(new rgc(27, this));
    public final ak0 c;

    public as1(ak0 ak0) {
        this.c = ak0;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        ak0 ak0 = this.c;
        if (ak0 != null && !ak0.a(totalCaptureResult)) {
            return false;
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
