package defpackage;

import android.content.Context;

/* renamed from: v75  reason: default package */
public final class v75 implements g85 {
    public static final /* synthetic */ k77[] i;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f = ez3.O(3, new s75(this, 0));
    public cf1 g;
    public final e3 h = hwf.t();

    static {
        hc9 hc9 = new hc9(v75.class, "pipStateJob", "getPipStateJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        i = new k77[]{hc9};
    }

    public v75(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t973;
        this.b = t974;
        this.c = t97;
        this.d = t972;
        this.e = t975;
    }

    public final cf1 a(Context context, sgc sgc) {
        cf1 cf1 = new cf1(context);
        cf1.setPipTheme(qda.a);
        cf1.setPipMode(ze1.c);
        cf1.setApplicationPipDepended(new afc(this, cf1));
        cf1.setListener(new t75(sgc));
        cf1.setVideoLayoutUpdatesControllerProvider(new s75(this, 1));
        return cf1;
    }

    public final nwa b() {
        return (nwa) this.f.getValue();
    }

    public final void c(long j) {
        udd.p("FakePipController", "try to hide local pip", new Object[0]);
        cf1 cf1 = this.g;
        if (cf1 != null) {
            if (!mt0.s(cf1)) {
                udd.p("FakePipController", "local pip in hidden progress", new Object[0]);
                return;
            }
            String str = ((ep1) ((so1) this.e.getValue())).k().c;
            hsd hsd = (ye1) this.a.getValue();
            grd grd = hsd.a;
            if (grd.getValue() == gsd.b) {
                iq1 iq1 = (iq1) hsd.c.getValue();
                iq1.getClass();
                iq1.c(iq1, "PIP_ENABLED", str, (String) null, 0, (String) null, (String) null, false, 116);
            }
            grd.m((Object) null, gsd.a);
            mt0.j(cf1, false, j, new ka(this, 14, cf1));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r8 = r8.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.app.Activity r7, defpackage.sgc r8) {
        /*
            r6 = this;
            java.lang.String r0 = "FakePipController"
            java.lang.String r1 = "start preparing local pip"
            defpackage.udd.p(r0, r1, new java.lang.Object[0])
            cf1 r1 = r6.g     // Catch:{ IllegalArgumentException -> 0x0011 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "local pip already prepared"
            defpackage.udd.p(r0, r6, new java.lang.Object[0])     // Catch:{ IllegalArgumentException -> 0x0011 }
            return
        L_0x0011:
            r6 = move-exception
            goto L_0x009c
        L_0x0014:
            cf1 r7 = r6.a(r7, r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            r6.g = r7     // Catch:{ IllegalArgumentException -> 0x0011 }
            r8 = 0
            r7.setAlpha(r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            nwa r8 = r6.b()     // Catch:{ IllegalArgumentException -> 0x0011 }
            t0c r8 = r8.X     // Catch:{ IllegalArgumentException -> 0x0011 }
            zqd r8 = r8.a     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            bga r8 = (defpackage.bga) r8     // Catch:{ IllegalArgumentException -> 0x0011 }
            r7.d(r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            cf1 r8 = r6.g     // Catch:{ IllegalArgumentException -> 0x0011 }
            r1 = 0
            if (r8 == 0) goto L_0x003f
            android.content.Context r8 = r8.getContext()     // Catch:{ IllegalArgumentException -> 0x0011 }
            if (r8 == 0) goto L_0x003f
            android.view.WindowManager r8 = ek8.F(r8)     // Catch:{ IllegalArgumentException -> 0x0011 }
            goto L_0x0040
        L_0x003f:
            r8 = r1
        L_0x0040:
            if (r8 == 0) goto L_0x006b
            android.view.WindowManager$LayoutParams r2 = r7.getWindowsViewLayoutParams()     // Catch:{ IllegalArgumentException -> 0x0011 }
            t97 r3 = r6.b     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            l81 r3 = (defpackage.l81) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            m81 r3 = (defpackage.m81) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r3.getClass()     // Catch:{ IllegalArgumentException -> 0x0011 }
            android.graphics.PointF r4 = new android.graphics.PointF     // Catch:{ IllegalArgumentException -> 0x0011 }
            android.graphics.PointF r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r5 = r3.x     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r3 = r3.y     // Catch:{ IllegalArgumentException -> 0x0011 }
            r4.<init>(r5, r3)     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r3 = r4.x     // Catch:{ IllegalArgumentException -> 0x0011 }
            int r3 = (int) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r2.x = r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            float r3 = r4.y     // Catch:{ IllegalArgumentException -> 0x0011 }
            int r3 = (int) r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r2.y = r3     // Catch:{ IllegalArgumentException -> 0x0011 }
            r8.addView(r7, r2)     // Catch:{ IllegalArgumentException -> 0x0011 }
        L_0x006b:
            nwa r8 = r6.b()     // Catch:{ IllegalArgumentException -> 0x0011 }
            r8.c = r7     // Catch:{ IllegalArgumentException -> 0x0011 }
            t97 r7 = r6.c     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            ro1 r7 = (defpackage.ro1) r7     // Catch:{ IllegalArgumentException -> 0x0011 }
            t97 r8 = r6.d     // Catch:{ IllegalArgumentException -> 0x0011 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IllegalArgumentException -> 0x0011 }
            pae r8 = (pae) r8     // Catch:{ IllegalArgumentException -> 0x0011 }
            n3a r8 = (defpackage.n3a) r8     // Catch:{ IllegalArgumentException -> 0x0011 }
            zr7 r8 = r8.c()     // Catch:{ IllegalArgumentException -> 0x0011 }
            u75 r2 = new u75     // Catch:{ IllegalArgumentException -> 0x0011 }
            r2.<init>(r6, r1)     // Catch:{ IllegalArgumentException -> 0x0011 }
            r3 = 2
            qod r7 = defpackage.xs7.E(r7, r8, r1, r2, r3)     // Catch:{ IllegalArgumentException -> 0x0011 }
            k77[] r8 = i     // Catch:{ IllegalArgumentException -> 0x0011 }
            r1 = 0
            r8 = r8[r1]     // Catch:{ IllegalArgumentException -> 0x0011 }
            e3 r1 = r6.h     // Catch:{ IllegalArgumentException -> 0x0011 }
            r1.o1(r6, r8, r7)     // Catch:{ IllegalArgumentException -> 0x0011 }
            goto L_0x00a1
        L_0x009c:
            java.lang.String r7 = "can't prepare local pip"
            defpackage.udd.s(r0, r7, r6)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v75.d(android.app.Activity, sgc):void");
    }
}
