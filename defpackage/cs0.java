package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: cs0  reason: default package */
public final class cs0 {
    public final mxa a;
    public final te b;
    public final ii5 c;
    public final gg d;
    public final int e;
    public final ConcurrentHashMap f;
    public volatile int g;
    public volatile boolean h;
    public final ii5 i;
    public int j;
    public Map k;
    public Set l;

    public cs0(mxa mxa, te teVar, ii5 ii5, gg ggVar, int i2) {
        this.a = mxa;
        this.b = teVar;
        this.c = ii5;
        this.d = ggVar;
        int d2 = (d(ggVar) * i2) / 1000;
        d2 = d2 < 1 ? 1 : d2;
        this.e = d2;
        this.f = new ConcurrentHashMap();
        this.i = new ii5(ggVar.c(), 5);
        this.j = -1;
        this.k = iw4.a;
        this.l = qw4.a;
        a(d(ggVar));
        this.g = (int) (((float) d2) * 0.5f);
    }

    public static int d(gg ggVar) {
        return (int) gwf.h(TimeUnit.SECONDS.toMillis(1) / ((long) (ggVar.i() / ggVar.c())), 1);
    }

    public final void a(int i2) {
        gg ggVar = this.d;
        int i3 = ggVar.i();
        int I = ggVar.I();
        int i4 = 1;
        if (I < 1) {
            I = 1;
        }
        int i5 = i3 * I;
        int c2 = ggVar.c();
        int d2 = d(ggVar);
        if (i2 > d2) {
            i2 = d2;
        }
        ii5 ii5 = this.c;
        ii5.getClass();
        if (i2 >= 1) {
            i4 = i2;
        }
        int i6 = ii5.b;
        if (i4 > i6) {
            i4 = i6;
        }
        float g2 = gwf.g((((float) i5) / 1000.0f) * ((float) i4), 0.0f);
        float f2 = (float) c2;
        if (g2 > f2) {
            g2 = f2;
        }
        float f3 = f2 / g2;
        int i7 = 0;
        fz6 S = gwf.S(0, c2);
        int S2 = ju7.S(q23.H(S, 10));
        if (S2 < 16) {
            S2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S2);
        Iterator it = S.iterator();
        while (true) {
            ez6 ez6 = (ez6) it;
            if (ez6.c) {
                Object next = ez6.next();
                int intValue = ((Number) next).intValue();
                if (((int) (((float) intValue) % f3)) == 0) {
                    i7 = intValue;
                }
                linkedHashMap.put(next, Integer.valueOf(i7));
            } else {
                this.k = linkedHashMap;
                this.l = o23.w0(linkedHashMap.values());
                return;
            }
        }
    }

    public final xf b(int i2) {
        xf xfVar;
        ii5 ii5 = this.i;
        Iterator it = new dz6(0, ii5.b, 1).iterator();
        do {
            xfVar = null;
            if (!((ez6) it).c) {
                break;
            }
            int a2 = ii5.a(i2 - ((ez6) it).a());
            bs0 bs0 = (bs0) this.f.get(Integer.valueOf(a2));
            if (bs0 != null) {
                if (bs0.b || !bs0.a.m0()) {
                    bs0 = null;
                }
                if (bs0 != null) {
                    xfVar = new xf(a2, (t54) bs0.a);
                    continue;
                } else {
                    continue;
                }
            }
        } while (xfVar == null);
        return xfVar;
    }

    public final gz5 c(int i2) {
        xf b2 = b(i2);
        if (b2 == null) {
            return new gz5(3, (e13) null);
        }
        e13 m = b2.b.m();
        this.j = b2.a;
        return new gz5(2, m);
    }

    public final void e(int i2, int i3) {
        if (!this.h) {
            this.h = true;
            ExecutorService executorService = jg.a;
            jg.a.execute(new as0(this, i2, i3, 0));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        defpackage.urd.l(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r9, defpackage.e13 r10) {
        /*
            r8 = this;
            xf r0 = r8.b(r9)
            te r8 = r8.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0075
            e13 r3 = r0.b
            if (r3 == 0) goto L_0x0075
            e13 r3 = r3.n()
            if (r3 == 0) goto L_0x0075
            int r0 = r0.a     // Catch:{ all -> 0x0065 }
            r4 = 0
            if (r0 >= r9) goto L_0x006b
            java.lang.Object r5 = r3.e0()     // Catch:{ all -> 0x0065 }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ all -> 0x0065 }
            boolean r6 = r10.m0()     // Catch:{ all -> 0x0065 }
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r10.e0()     // Catch:{ all -> 0x0065 }
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x0065 }
            if (r6 != 0) goto L_0x0043
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch:{ all -> 0x0065 }
            java.lang.Object r7 = r10.e0()     // Catch:{ all -> 0x0065 }
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ all -> 0x0065 }
            r6.<init>(r7)     // Catch:{ all -> 0x0065 }
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch:{ all -> 0x0065 }
            r6.drawColor(r2, r7)     // Catch:{ all -> 0x0065 }
            r2 = 0
            r6.drawBitmap(r5, r2, r2, r4)     // Catch:{ all -> 0x0065 }
        L_0x0043:
            fz6 r2 = new fz6     // Catch:{ all -> 0x0065 }
            int r0 = r0 + r1
            r2.<init>(r0, r9, r1)     // Catch:{ all -> 0x0065 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x0065 }
        L_0x004d:
            r0 = r9
            ez6 r0 = (defpackage.ez6) r0     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.c     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0067
            r0 = r9
            ez6 r0 = (defpackage.ez6) r0     // Catch:{ all -> 0x0065 }
            int r0 = r0.a()     // Catch:{ all -> 0x0065 }
            java.lang.Object r1 = r10.e0()     // Catch:{ all -> 0x0065 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x0065 }
            r8.d(r1, r0)     // Catch:{ all -> 0x0065 }
            goto L_0x004d
        L_0x0065:
            r8 = move-exception
            goto L_0x006f
        L_0x0067:
            defpackage.urd.l(r3, r4)
            return
        L_0x006b:
            defpackage.urd.l(r3, r4)
            goto L_0x0075
        L_0x006f:
            throw r8     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r9 = move-exception
            defpackage.urd.l(r3, r8)
            throw r9
        L_0x0075:
            boolean r0 = r10.m0()
            if (r0 == 0) goto L_0x008b
            android.graphics.Canvas r0 = new android.graphics.Canvas
            java.lang.Object r3 = r10.e0()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r0.<init>(r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.CLEAR
            r0.drawColor(r2, r3)
        L_0x008b:
            fz6 r0 = new fz6
            r0.<init>(r2, r9, r1)
            java.util.Iterator r9 = r0.iterator()
        L_0x0094:
            r0 = r9
            ez6 r0 = (defpackage.ez6) r0
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x00ac
            r0 = r9
            ez6 r0 = (defpackage.ez6) r0
            int r0 = r0.a()
            java.lang.Object r1 = r10.e0()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r8.d(r1, r0)
            goto L_0x0094
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs0.f(int, e13):void");
    }
}
