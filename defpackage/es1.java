package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: es1  reason: default package */
public final class es1 implements zr1 {
    public static final long f = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int g = 0;
    public final zq1 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final aq6 d;
    public final wwc e;

    public es1(zq1 zq1, Executor executor, ScheduledExecutorService scheduledExecutorService, wwc wwc) {
        this.a = zq1;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.e = wwc;
        aq6 aq6 = zq1.q;
        Objects.requireNonNull(aq6);
        this.d = aq6;
    }

    public final ch7 a(TotalCaptureResult totalCaptureResult) {
        AtomicReference atomicReference = new AtomicReference();
        vn1 f2 = hwf.f(new yr0(atomicReference, 1));
        j36 a2 = j36.a(hwf.f(new j9(this, 12, atomicReference)));
        bs1 bs1 = new bs1(this, 1);
        a2.getClass();
        Executor executor = this.b;
        oy1 N = ct0.N(ct0.N(ct0.N(ct0.N(ct0.N(a2, bs1, executor), new bs1(this, 2), executor), new j9(this, 13, f2), executor), new bs1(this, 3), executor), new bs1(this, 4), executor);
        sr1 sr1 = new sr1(3);
        return ct0.N(N, new e3(sr1), pa2.j());
    }

    public final boolean b() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r6 = this;
            wwc r0 = r6.e
            java.lang.Object r0 = r0.b
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r0
            r1 = 1
            r2 = 5
            r3 = 0
            if (r0 == 0) goto L_0x001b
            et1 r0 = r0.a
            int r0 = defpackage.zq1.t(r0, r2)
            if (r0 != r2) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r3
        L_0x001c:
            zq1 r4 = r6.a
            if (r0 == 0) goto L_0x0023
            r4.r(r3)
        L_0x0023:
            bp5 r0 = r4.h
            zq1 r5 = r0.a
            et1 r5 = r5.e
            int r5 = defpackage.zq1.t(r5, r2)
            if (r5 == r2) goto L_0x0032
            as6 r0 = defpackage.as6.c
            goto L_0x003c
        L_0x0032:
            eb4 r2 = new eb4
            r5 = 1
            r2.<init>(r0, r3, r5)
            vn1 r0 = defpackage.hwf.f(r2)
        L_0x003c:
            lc r2 = new lc
            r5 = 6
            r2.<init>(r5)
            java.util.concurrent.Executor r5 = r6.b
            r0.c(r2, r5)
            bp5 r0 = r4.h
            r0.a(r3, r1)
            vd6 r0 = pa2.A()
            aq6 r6 = r6.d
            java.util.Objects.requireNonNull(r6)
            ds1 r1 = new ds1
            r2 = 0
            r1.<init>(r2, r6)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es1.c():void");
    }
}
