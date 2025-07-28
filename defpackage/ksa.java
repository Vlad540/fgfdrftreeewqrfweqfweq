package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ksa  reason: default package */
public final class ksa extends taf {
    public static final /* synthetic */ k77[] K0;
    public final t97 A0;
    public final e3 B0 = hwf.t();
    public final t0c C0;
    public final grd D0;
    public final t0c E0;
    public final grd F0;
    public final t0c G0;
    public final grd H0;
    public final grd I0;
    public volatile zb9 J0;
    public final f03 X;
    public final s16 Y;
    public final q72 Z;
    public final String b;
    public final kr2 c;
    public final ok3 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        hc9 hc9 = new hc9(ksa.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        K0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [i26, l5e] */
    public ksa(String str, kr2 kr2, ok3 ok3, f03 f03, tsa tsa, q72 q72, pae pae, t97 t97, rw6 rw6, r7e r7e) {
        kr2 kr22 = kr2;
        f03 f032 = f03;
        tp2 tp2 = tp2.a;
        r7e d = tp2.getAccessor().d(xzc.class);
        r7e d2 = tp2.getAccessor().d(qkc.class);
        this.b = str;
        this.c = kr22;
        this.o = ok3;
        this.X = f032;
        this.Y = tsa;
        this.Z = q72;
        this.w0 = t97;
        this.x0 = rw6;
        this.y0 = r7e;
        this.z0 = d;
        this.A0 = d2;
        hw4 hw4 = hw4.a;
        grd a = hrd.a(hw4);
        this.C0 = new t0c(a);
        grd a2 = hrd.a(Boolean.TRUE);
        this.D0 = a2;
        this.E0 = new t0c(a2);
        grd a3 = hrd.a((Object) null);
        this.F0 = a3;
        this.G0 = new t0c(a3);
        this.H0 = hrd.a(0L);
        grd a4 = hrd.a(hw4);
        this.I0 = a4;
        this.J0 = tq7.a();
        ck5 ck5 = new ck5(new gsa(new v11(kr22.C0, a4, new c3(this, (Continuation) null, 21), 4), this, 1), new tg9(2, a, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), 5);
        n3a n3a = (n3a) pae;
        ez3.N(ez3.J(ck5, n3a.a()), this.a);
        String f = ((i03) f032).f("user.Phone", (String) null);
        StringBuilder sb = new StringBuilder();
        int length = f.length();
        for (int i = 0; i < length; i++) {
            char charAt = f.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Long H = o0e.H(sb.toString());
        ez3.N(ez3.J(new ck5(new da1(new v11(this.o.a(), new ck5(new gsa(new gsa(this.H0, this, 0), this, 2), new l5e(2, (Continuation) null)), new tt2(3, (Continuation) null, 1), 4), new rt2(new gu6(9), 3), this, H, 4), new tg9(2, this.I0, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), 5), n3a.a()), this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.ira q(defpackage.ksa r16, defpackage.pi2 r17) {
        /*
            r0 = r17
            r16.getClass()
            java.lang.Long r1 = r0.G0
            java.lang.CharSequence r2 = r0.o
            if (r1 == 0) goto L_0x001c
            if (r2 == 0) goto L_0x0013
            int r1 = r2.length()
            if (r1 != 0) goto L_0x001c
        L_0x0013:
            int r1 = defpackage.h2a.G
            hge r2 = new hge
            r2.<init>(r1)
        L_0x001a:
            r9 = r2
            goto L_0x0027
        L_0x001c:
            if (r2 == 0) goto L_0x0025
            lge r1 = new lge
            r1.<init>(r2)
            r9 = r1
            goto L_0x0027
        L_0x0025:
            r2 = 0
            goto L_0x001a
        L_0x0027:
            q72 r1 = defpackage.q72.a
            r2 = r16
            q72 r2 = r2.Z
            if (r2 == r1) goto L_0x003b
            q72 r1 = defpackage.q72.b
            if (r2 != r1) goto L_0x0038
            boolean r1 = r0.J0
            if (r1 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r1 = 0
        L_0x0039:
            r15 = r1
            goto L_0x003d
        L_0x003b:
            r1 = 1
            goto L_0x0039
        L_0x003d:
            ira r1 = new ira
            zta r13 = new zta
            yta r2 = defpackage.yta.a
            long r4 = r0.a
            r13.<init>(r4, r2)
            boolean r12 = r0.y0
            java.lang.CharSequence r14 = r0.I0
            long r6 = r0.H0
            java.lang.CharSequence r8 = r0.c
            android.net.Uri r10 = r0.b
            boolean r11 = r0.x0
            r3 = r1
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksa.q(ksa, pi2):ira");
    }

    public final void p() {
        r().h = null;
    }

    public final vs7 r() {
        return (vs7) this.w0.getValue();
    }
}
