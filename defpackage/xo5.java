package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: xo5  reason: default package */
public final /* synthetic */ class xo5 implements yq1 {
    public final /* synthetic */ bp5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ xo5(int i, long j, bp5 bp5) {
        this.a = bp5;
        this.b = i;
        this.c = j;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        bp5 bp5 = this.a;
        bp5.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != this.b || !zq1.x(totalCaptureResult, this.c)) {
            return false;
        }
        sn1 sn1 = bp5.u;
        if (sn1 != null) {
            sn1.b((Object) null);
            bp5.u = null;
        }
        return true;
    }
}
