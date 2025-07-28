package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rya  reason: default package */
public final class rya {
    public static final /* synthetic */ k77[] h;
    public final v40 a;
    public final va9 b;
    public final ou3 c;
    public final grd d = hrd.a((Object) null);
    public final t0c e;
    public final e3 f;
    public final mod g;

    static {
        k77 hc9 = new hc9(rya.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        h = new k77[]{hc9};
    }

    public rya(pae pae, v40 v40, va9 va9, ou3 ou3) {
        this.a = v40;
        this.b = va9;
        this.c = ou3;
        nb9 nb9 = (nb9) va9;
        this.e = nb9.H;
        this.f = hwf.t();
        mod mod = new mod(25, new nya(this, 0, pae));
        this.g = mod;
        nb9.e(mod);
        lp.q(ou3.getCoroutineContext()).invokeOnCompletion(new e98(20, this));
        xs7.E(ou3, ((n3a) pae).a(), (ru3) null, new oya(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r3.intValue() != 3) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r3.intValue() != 2) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.rya r6) {
        /*
            va9 r0 = r6.b
            r1 = r0
            nb9 r1 = (defpackage.nb9) r1
            ua9 r2 = r1.n()
            l68 r3 = r1.B
            grd r6 = r6.d
            r4 = 0
            if (r3 == 0) goto L_0x0023
            z78 r3 = r3.d
            if (r3 == 0) goto L_0x0023
            ns7 r5 = m68.a
            java.lang.Integer r3 = r3.H
            if (r3 != 0) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            int r3 = r3.intValue()
            r5 = 2
            if (r3 != r5) goto L_0x0023
            goto L_0x0083
        L_0x0023:
            l68 r3 = r1.B
            if (r3 == 0) goto L_0x003a
            z78 r3 = r3.d
            if (r3 == 0) goto L_0x003a
            ns7 r5 = m68.a
            java.lang.Integer r3 = r3.H
            if (r3 != 0) goto L_0x0032
            goto L_0x003a
        L_0x0032:
            int r3 = r3.intValue()
            r5 = 3
            if (r3 != r5) goto L_0x003a
            goto L_0x0083
        L_0x003a:
            int r1 = r1.v
            r3 = 1
            if (r1 != r3) goto L_0x0040
            goto L_0x0083
        L_0x0040:
            if (r2 == 0) goto L_0x0083
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0049
            goto L_0x0083
        L_0x0049:
            java.lang.CharSequence r1 = r2.a
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = ""
        L_0x004f:
            lge r3 = new lge
            r3.<init>(r1)
            lge r1 = new lge
            java.lang.CharSequence r2 = r2.b
            r1.<init>(r2)
            nb9 r0 = (defpackage.nb9) r0
            boolean r2 = r0.x
            zl3 r5 = defpackage.xxa.b
            float r0 = r0.F
            r5.getClass()
            r5 = 1071644672(0x3fe00000, float:1.75)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x006f
            xxa r0 = defpackage.xxa.X
            goto L_0x007a
        L_0x006f:
            r5 = 1067450368(0x3fa00000, float:1.25)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            xxa r0 = defpackage.xxa.o
            goto L_0x007a
        L_0x0078:
            xxa r0 = defpackage.xxa.c
        L_0x007a:
            u49 r5 = new u49
            r5.<init>(r3, r1, r0, r2)
            r6.m(r4, r5)
            goto L_0x0088
        L_0x0083:
            t49 r0 = defpackage.t49.a
            r6.m(r4, r0)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rya.a(rya):void");
    }
}
