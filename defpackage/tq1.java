package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* renamed from: tq1  reason: default package */
public final /* synthetic */ class tq1 implements yq1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ sn1 b;

    public /* synthetic */ tq1(long j, sn1 sn1) {
        this.a = j;
        this.b = sn1;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        if (!zq1.x(totalCaptureResult, this.a)) {
            return false;
        }
        this.b.b((Object) null);
        return true;
    }
}
