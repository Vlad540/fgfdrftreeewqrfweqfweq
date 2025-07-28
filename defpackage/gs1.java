package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: gs1  reason: default package */
public final class gs1 implements zr1 {
    public static final long g = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int h = 0;
    public final zq1 a;
    public final int b;
    public boolean c = false;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final boolean f;

    public gs1(zq1 zq1, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.a = zq1;
        this.b = i;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.f = z;
    }

    public final ch7 a(TotalCaptureResult totalCaptureResult) {
        w30.g(this.b, totalCaptureResult);
        if (!w30.g(this.b, totalCaptureResult) || this.a.r) {
            return ct0.w(Boolean.FALSE);
        }
        this.c = true;
        j36 a2 = j36.a(hwf.f(new fs1(this, 0)));
        fs1 fs1 = new fs1(this, 1);
        Executor executor = this.d;
        a2.getClass();
        oy1 N = ct0.N(ct0.N(a2, fs1, executor), new fs1(this, 2), this.d);
        sr1 sr1 = new sr1(4);
        return ct0.N(N, new e3(sr1), pa2.j());
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final void c() {
        if (this.c) {
            zq1 zq1 = this.a;
            zq1.j.a((sn1) null, false);
            if (this.f) {
                zq1.h.a(false, true);
            }
        }
    }
}
