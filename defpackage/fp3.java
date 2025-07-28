package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: fp3  reason: default package */
public final class fp3 {
    public static final /* synthetic */ k77[] j;
    public final ou3 a;
    public final zqd b;
    public final ud c;
    public final t97 d;
    public final t97 e;
    public final e3 f = hwf.t();
    public final r7e g = new r7e(new nl1(25, this));
    public final grd h;
    public final t0c i;

    static {
        hc9 hc9 = new hc9(fp3.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        j = new k77[]{hc9};
    }

    public fp3(ou3 ou3, zqd zqd, ud udVar, t97 t97, t97 t972) {
        this.a = ou3;
        this.b = zqd;
        this.c = udVar;
        this.d = t97;
        this.e = t972;
        grd a2 = hrd.a(bk3.d);
        this.h = a2;
        this.i = new t0c(a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if ((r2 != null ? ((gsc) r3.getValue()).h(r2.toString(), r9) : false) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList a(defpackage.fp3 r7, java.util.List r8, java.lang.String r9) {
        /*
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x000c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r8.next()
            r2 = r1
            lk3 r2 = (defpackage.lk3) r2
            java.util.List r3 = r2.o
            r4 = 0
            if (r3 == 0) goto L_0x0044
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0025
            goto L_0x0044
        L_0x0025:
            java.util.Iterator r3 = r3.iterator()
        L_0x0029:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r3.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r5 = defpackage.p0e.Q(r5, r9, r4)
            if (r5 == 0) goto L_0x0029
            goto L_0x006e
        L_0x0044:
            t97 r3 = r7.e
            java.lang.Object r5 = r3.getValue()
            gsc r5 = (gsc) r5
            java.lang.CharSequence r6 = r2.b
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.h(r6, r9)
            if (r5 != 0) goto L_0x006e
            java.lang.CharSequence r2 = r2.c
            if (r2 == 0) goto L_0x006b
            java.lang.Object r3 = r3.getValue()
            gsc r3 = (gsc) r3
            java.lang.String r2 = r2.toString()
            boolean r2 = r3.h(r2, r9)
            goto L_0x006c
        L_0x006b:
            r2 = r4
        L_0x006c:
            if (r2 == 0) goto L_0x006f
        L_0x006e:
            r4 = 1
        L_0x006f:
            if (r4 == 0) goto L_0x000c
            r0.add(r1)
            goto L_0x000c
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp3.a(fp3, java.util.List, java.lang.String):java.util.ArrayList");
    }

    public final void b() {
        ((mc9) this.g.getValue()).setValue((Object) null);
        g37 g37 = (g37) this.f.T0(this, j[0]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        this.h.m((Object) null, bk3.d);
    }
}
