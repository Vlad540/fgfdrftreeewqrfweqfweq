package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.ScheduledFuture;

/* renamed from: vo5  reason: default package */
public final /* synthetic */ class vo5 implements yq1 {
    public final /* synthetic */ bp5 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    public /* synthetic */ vo5(bp5 bp5, boolean z, long j) {
        this.a = bp5;
        this.b = z;
        this.c = j;
    }

    public final boolean a(TotalCaptureResult totalCaptureResult) {
        bp5 bp5 = this.a;
        bp5.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (bp5.q.length > 0) {
            if (!this.b || num == null) {
                bp5.m = true;
                bp5.l = true;
            } else if (bp5.h.intValue() == 3) {
                if (num.intValue() == 4) {
                    bp5.m = true;
                    bp5.l = true;
                } else if (num.intValue() == 5) {
                    bp5.m = false;
                    bp5.l = true;
                }
            }
        }
        if (bp5.l && zq1.x(totalCaptureResult, this.c)) {
            boolean z = bp5.m;
            ScheduledFuture scheduledFuture = bp5.j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                bp5.j = null;
            }
            sn1 sn1 = bp5.t;
            if (sn1 != null) {
                sn1.b(new cp5(z));
                bp5.t = null;
            }
            return true;
        } else if (bp5.h.equals(num) || num == null) {
            return false;
        } else {
            bp5.h = num;
            return false;
        }
    }
}
