package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: ap5  reason: default package */
public final /* synthetic */ class ap5 implements yq1 {
    public final /* synthetic */ bp5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ sn1 c;

    public /* synthetic */ ap5(bp5 bp5, long j, sn1 sn1) {
        this.a = bp5;
        this.b = j;
        this.c = sn1;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        bp5 bp5 = this.a;
        bp5.getClass();
        if ((((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5) != bp5.v || !zq1.x(totalCaptureResult, this.b)) {
            return false;
        }
        sn1 sn1 = this.c;
        if (sn1 != null) {
            sn1.b((Object) null);
        }
        return true;
    }
}
