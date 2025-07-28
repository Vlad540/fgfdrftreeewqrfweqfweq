package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: yr1  reason: default package */
public final class yr1 {
    public static final long j;
    public static final long k;
    public final int a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final zq1 d;
    public final kp0 e;
    public final boolean f;
    public long g = j;
    public final ArrayList h = new ArrayList();
    public final wr1 i = new wr1(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j = timeUnit.toNanos(1);
        k = timeUnit.toNanos(5);
    }

    public yr1(int i2, Executor executor, ScheduledExecutorService scheduledExecutorService, zq1 zq1, boolean z, kp0 kp0) {
        this.a = i2;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.d = zq1;
        this.f = z;
        this.e = kp0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: as6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: vn1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: as6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: as6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ch7 a(int r5) {
        /*
            r4 = this;
            as6 r0 = defpackage.as6.c
            java.util.ArrayList r1 = r4.h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x004a
            wr1 r1 = r4.i
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x002c
            as1 r0 = new as1
            r1 = 0
            r0.<init>(r1)
            zq1 r1 = r4.d
            r1.p(r0)
            dr1 r2 = new dr1
            r3 = 4
            r2.<init>(r1, r3, r0)
            vn1 r0 = r0.b
            un1 r3 = r0.b
            java.util.concurrent.Executor r1 = r1.c
            r3.c(r2, r1)
        L_0x002c:
            j36 r0 = defpackage.j36.a(r0)
            hc0 r1 = new hc0
            r2 = 2
            r1.<init>(r5, r2, r4)
            r0.getClass()
            java.util.concurrent.Executor r5 = r4.b
            oy1 r0 = ct0.N(r0, r1, r5)
            rgc r1 = new rgc
            r2 = 26
            r1.<init>(r2, r4)
            oy1 r0 = ct0.N(r0, r1, r5)
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr1.a(int):ch7");
    }
}
