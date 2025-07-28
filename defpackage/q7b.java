package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q7b  reason: default package */
public final class q7b extends taf {
    public static final /* synthetic */ k77[] J0;
    public final t97 A0;
    public final grd B0;
    public final grd C0 = hrd.a((Object) null);
    public final boolean D0;
    public final l05 E0;
    public final l05 F0;
    public final e3 G0;
    public final e3 H0;
    public final t0c I0;
    public final boolean X;
    public final bv2 Y;
    public final ap3 Z;
    public final long b;
    public final long c;
    public final b7b o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<q7b> cls = q7b.class;
        J0 = new k77[]{new hc9(cls, "goToProfileJob", "getGoToProfileJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "disableActionClickJob", "getDisableActionClickJob()Lkotlinx/coroutines/Job;")};
    }

    public q7b(long j, long j2, b7b b7b, boolean z, bv2 bv2, ap3 ap3, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.b = j;
        this.c = j2;
        this.o = b7b;
        this.X = z;
        this.Y = bv2;
        this.Z = ap3;
        this.w0 = t97;
        this.x0 = t973;
        this.y0 = t972;
        this.z0 = t974;
        this.A0 = t975;
        grd a = hrd.a((Object) null);
        this.B0 = a;
        this.D0 = b7b == b7b.SETUP_NEW_ADMIN;
        this.E0 = new l05(0);
        this.F0 = new l05(0);
        this.G0 = hwf.t();
        this.H0 = hwf.t();
        if (z) {
            ez3.N(ez3.J(new ck5(new nl5(new djc(new m7b(new v11(new ik5(((aw2) bv2).m(j), 2), new ik5(ap3.c(j2), 2), c7b.w0, 4), (Continuation) null, this)), 0), new d7b(this, (Continuation) null), 5), u().a()), this.a);
        } else {
            ez3.N(ez3.J(new ck5(new djc(new o7b(new v11(new ik5(((aw2) bv2).m(j), 2), new ik5(ap3.c(j2), 2), new c3(this, (Continuation) null, 26), 4), (Continuation) null, this)), new e7b(this, (Continuation) null), 5), u().a()), this.a);
        }
        this.I0 = ez3.d0(ez3.J(ez3.z(new w09(new ik5(a, 2), this, 7)), u().a()), this.a, ucd.a, new f7b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.q7b r29, defpackage.i22 r30, defpackage.tf3 r31, boolean r32, kotlin.coroutines.Continuation r33) {
        /*
            r0 = r29
            r1 = r30
            r2 = r33
            r29.getClass()
            boolean r3 = r2 instanceof defpackage.p7b
            if (r3 == 0) goto L_0x001c
            r3 = r2
            p7b r3 = (defpackage.p7b) r3
            int r4 = r3.y0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.y0 = r4
            goto L_0x0021
        L_0x001c:
            p7b r3 = new p7b
            r3.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r3.w0
            pu3 r4 = pu3.a
            int r5 = r3.y0
            r6 = 1
            if (r5 == 0) goto L_0x0042
            if (r5 != r6) goto L_0x003a
            int r0 = r3.Z
            boolean r1 = r3.Y
            tf3 r4 = r3.X
            i22 r3 = r3.o
            wx3.H(r2)
            r8 = r1
            r1 = r3
            goto L_0x0072
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            wx3.H(r2)
            long r8 = r31.n()
            o62 r2 = r1.b
            long r10 = r2.d
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0053
            r2 = r6
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            r3.o = r1
            r5 = r31
            r3.X = r5
            r8 = r32
            r3.Y = r8
            r3.Z = r2
            r3.y0 = r6
            ap3 r0 = r0.Z
            java.lang.Object r0 = r0.d(r3)
            if (r0 != r4) goto L_0x006c
            goto L_0x02e6
        L_0x006c:
            r4 = r5
            r28 = r2
            r2 = r0
            r0 = r28
        L_0x0072:
            tf3 r2 = (defpackage.tf3) r2
            long r2 = r2.n()
            boolean r5 = r1.a0()
            long r9 = r4.n()
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0086
            r9 = r6
            goto L_0x0087
        L_0x0086:
            r9 = 0
        L_0x0087:
            boolean r10 = r1.G()
            r11 = 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x009c
            long r12 = r4.n()
            int r10 = r1.d(r12)
            boolean r10 = d8.v(r10, r11)
            goto L_0x00a8
        L_0x009c:
            long r12 = r4.n()
            int r10 = r1.d(r12)
            boolean r10 = d8.v(r10, r6)
        L_0x00a8:
            boolean r12 = r1.G()
            if (r12 == 0) goto L_0x00b7
            int r12 = r1.d(r2)
            boolean r11 = d8.v(r12, r11)
            goto L_0x00bb
        L_0x00b7:
            boolean r11 = r1.v()
        L_0x00bb:
            boolean r12 = r1.G()
            r13 = 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x00d0
            long r14 = r4.n()
            int r12 = r1.d(r14)
            boolean r12 = d8.v(r12, r13)
            goto L_0x00dc
        L_0x00d0:
            long r14 = r4.n()
            int r12 = r1.d(r14)
            boolean r12 = d8.v(r12, r6)
        L_0x00dc:
            boolean r14 = r1.G()
            if (r14 == 0) goto L_0x00eb
            int r14 = r1.d(r2)
            boolean r13 = d8.v(r14, r13)
            goto L_0x00ef
        L_0x00eb:
            boolean r13 = r1.v()
        L_0x00ef:
            boolean r14 = r1.G()
            r15 = 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0106
            r29 = r8
            long r7 = r4.n()
            int r7 = r1.d(r7)
            boolean r7 = d8.v(r7, r15)
            goto L_0x0114
        L_0x0106:
            r29 = r8
            long r7 = r4.n()
            int r7 = r1.d(r7)
            boolean r7 = d8.v(r7, r6)
        L_0x0114:
            boolean r8 = r1.G()
            if (r8 == 0) goto L_0x0123
            int r8 = r1.d(r2)
            boolean r8 = d8.v(r8, r15)
            goto L_0x0127
        L_0x0123:
            boolean r8 = r1.v()
        L_0x0127:
            long r14 = r4.n()
            int r14 = r1.d(r14)
            r15 = 16
            boolean r14 = d8.v(r14, r15)
            boolean r15 = r1.u()
            r30 = r7
            long r6 = r4.n()
            int r6 = r1.d(r6)
            r7 = 8
            boolean r6 = d8.v(r6, r7)
            boolean r7 = r1.s()
            r31 = r9
            r32 = r10
            long r9 = r4.n()
            int r9 = r1.d(r9)
            r10 = 2
            boolean r9 = d8.v(r9, r10)
            r17 = r9
            int r9 = r1.d(r2)
            boolean r9 = d8.v(r9, r10)
            r18 = r9
            long r9 = r4.n()
            int r9 = r1.d(r9)
            r10 = 4
            boolean r9 = d8.v(r9, r10)
            boolean r10 = r1.q()
            r19 = r6
            r20 = r7
            long r6 = r4.n()
            java.lang.Long r6 = r1.c(r6)
            if (r6 != 0) goto L_0x018a
            goto L_0x0194
        L_0x018a:
            long r6 = r6.longValue()
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0194
            if (r10 != 0) goto L_0x0196
        L_0x0194:
            if (r5 == 0) goto L_0x0198
        L_0x0196:
            r2 = 1
            goto L_0x0199
        L_0x0198:
            r2 = 0
        L_0x0199:
            if (r5 == 0) goto L_0x01ba
            if (r29 == 0) goto L_0x01ba
            y6b r0 = new y6b
            r2 = 1
            r0.<init>(r2, r2)
            y6b r3 = new y6b
            r5 = 0
            r3.<init>(r5, r2)
            r20 = r0
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r3
        L_0x01b7:
            r6 = 1
            goto L_0x02b8
        L_0x01ba:
            if (r29 == 0) goto L_0x01f4
            y6b r0 = new y6b
            r0.<init>(r11, r11)
            y6b r2 = new y6b
            r2.<init>(r13, r13)
            y6b r3 = new y6b
            r3.<init>(r8, r8)
            y6b r5 = new y6b
            r5.<init>(r15, r15)
            y6b r6 = new y6b
            r7 = r20
            r6.<init>(r7, r7)
            y6b r7 = new y6b
            r8 = r18
            r7.<init>(r8, r8)
            y6b r8 = new y6b
            r9 = 0
            r10 = 1
            r8.<init>(r9, r10)
            r20 = r0
            r21 = r2
            r22 = r3
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            goto L_0x01b7
        L_0x01f4:
            r5 = r18
            r7 = r20
            r3 = 0
            if (r31 == 0) goto L_0x022d
            y6b r0 = new y6b
            r0.<init>(r11, r3)
            y6b r2 = new y6b
            r2.<init>(r13, r3)
            y6b r6 = new y6b
            r6.<init>(r8, r3)
            y6b r8 = new y6b
            r8.<init>(r15, r3)
            y6b r9 = new y6b
            r9.<init>(r7, r3)
            y6b r7 = new y6b
            r7.<init>(r5, r3)
            y6b r5 = new y6b
            r5.<init>(r10, r3)
            r20 = r0
            r21 = r2
            r26 = r5
            r22 = r6
            r25 = r7
            r23 = r8
            r24 = r9
            goto L_0x01b7
        L_0x022d:
            if (r0 == 0) goto L_0x0245
            y6b r0 = new y6b
            r6 = 1
            r0.<init>(r6, r3)
            r20 = r0
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            goto L_0x02b8
        L_0x0245:
            r6 = 1
            y6b r0 = new y6b
            if (r11 == 0) goto L_0x0250
            if (r2 == 0) goto L_0x0250
            r3 = r32
            r11 = r6
            goto L_0x0253
        L_0x0250:
            r11 = r3
            r3 = r32
        L_0x0253:
            r0.<init>(r3, r11)
            y6b r3 = new y6b
            if (r13 == 0) goto L_0x025e
            if (r2 == 0) goto L_0x025e
            r11 = r6
            goto L_0x025f
        L_0x025e:
            r11 = 0
        L_0x025f:
            r3.<init>(r12, r11)
            y6b r11 = new y6b
            if (r8 == 0) goto L_0x026c
            if (r2 == 0) goto L_0x026c
            r12 = r30
            r8 = r6
            goto L_0x026f
        L_0x026c:
            r12 = r30
            r8 = 0
        L_0x026f:
            r11.<init>(r12, r8)
            y6b r8 = new y6b
            if (r15 == 0) goto L_0x027a
            if (r2 == 0) goto L_0x027a
            r12 = r6
            goto L_0x027b
        L_0x027a:
            r12 = 0
        L_0x027b:
            r8.<init>(r14, r12)
            y6b r12 = new y6b
            if (r7 == 0) goto L_0x0288
            if (r2 == 0) goto L_0x0288
            r7 = r6
            r13 = r19
            goto L_0x028b
        L_0x0288:
            r13 = r19
            r7 = 0
        L_0x028b:
            r12.<init>(r13, r7)
            y6b r7 = new y6b
            if (r5 == 0) goto L_0x0298
            if (r2 == 0) goto L_0x0298
            r5 = r6
            r13 = r17
            goto L_0x029b
        L_0x0298:
            r13 = r17
            r5 = 0
        L_0x029b:
            r7.<init>(r13, r5)
            y6b r5 = new y6b
            if (r10 == 0) goto L_0x02a6
            if (r2 == 0) goto L_0x02a6
            r2 = r6
            goto L_0x02a7
        L_0x02a6:
            r2 = 0
        L_0x02a7:
            r5.<init>(r9, r2)
            r20 = r0
            r21 = r3
            r26 = r5
            r25 = r7
            r23 = r8
            r22 = r11
            r24 = r12
        L_0x02b8:
            z6b r0 = new z6b
            if (r29 != 0) goto L_0x02d5
            boolean r2 = r1.H()
            if (r2 == 0) goto L_0x02d5
            long r2 = r4.n()
            int r1 = r1.d(r2)
            r2 = 128(0x80, float:1.794E-43)
            boolean r1 = d8.v(r1, r2)
            if (r1 == 0) goto L_0x02d5
            r19 = r6
            goto L_0x02d7
        L_0x02d5:
            r19 = 0
        L_0x02d7:
            r16 = 0
            r27 = 31
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = r0
        L_0x02e6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7b.q(q7b, i22, tf3, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void r() {
        z6b z6b;
        i22 i22;
        int m;
        grd grd = this.B0;
        z6b z6b2 = (z6b) grd.getValue();
        boolean z = this.X;
        if (z6b2 != null && !z6b2.a && !z6b2.b && !z6b2.c && !z6b2.d && !z6b2.e && !z6b2.f && !z) {
            taf.o(this.F0, new u6b(new hge(i8a.M0), (Integer) null));
        } else if ((!hhd.f(this.C0.getValue(), grd.getValue()) || (z && this.o == b7b.SETUP_NEW_ADMIN)) && (z6b = (z6b) grd.getValue()) != null && (i22 = (i22) ((aw2) this.Y).m(this.b).a.getValue()) != null) {
            long j = i22.b.a;
            if (z) {
                i22 s = s();
                boolean z2 = false;
                boolean G = s != null ? s.G() : false;
                y6b y6b = z6b.i;
                boolean z3 = G ? false : y6b.a;
                boolean z4 = z6b.l.a;
                boolean z5 = z6b.m.a;
                boolean z6 = z6b.k.a;
                boolean z7 = z6b.j.a;
                boolean z8 = !G;
                boolean z9 = G ? z6b.g.a : false;
                boolean z10 = G ? z6b.h.a : false;
                if (G) {
                    z2 = y6b.a;
                }
                m = d8.m(z3, z4, z5, z6, z7, z8, z6b.f, z9, z10, z2);
            } else {
                m = d8.m(z6b.b, z6b.e, z6b.a, z6b.d, z6b.c, true, z6b.f, false, false, false);
            }
            xs7.E(this.a, u().b(), (ru3) null, new g7b(this, j, m, (Continuation) null), 2);
        }
    }

    public final i22 s() {
        return (i22) ((aw2) this.Y).m(this.b).a.getValue();
    }

    public final tf3 t() {
        return (tf3) this.Z.c(this.c).a.getValue();
    }

    public final pae u() {
        return (pae) this.x0.getValue();
    }

    public final void v(long j, boolean z) {
        z6b z6b;
        y6b y6b;
        jge jge;
        int i = (j > ((long) f8a.D) ? 1 : (j == ((long) f8a.D) ? 0 : -1));
        boolean z2 = false;
        l05 l05 = this.F0;
        String str = null;
        if (i == 0) {
            i22 s = s();
            hge hge = (s == null || !s.G()) ? new hge(i8a.T0) : new hge(i8a.T0);
            i22 s2 = s();
            String str2 = "";
            if (s2 == null || !s2.G()) {
                int i2 = i8a.R0;
                i22 s3 = s();
                if (s3 != null) {
                    str = s3.p();
                }
                if (str != null) {
                    str2 = str;
                }
                jge = new jge(i2, cs.g0(new Object[]{str2}));
            } else {
                int i3 = i8a.q1;
                tf3 t = t();
                String d = t != null ? t.d() : null;
                if (d == null) {
                    d = str2;
                }
                i22 s4 = s();
                if (s4 != null) {
                    str = s4.p();
                }
                if (str != null) {
                    str2 = str;
                }
                jge = new jge(i3, cs.g0(new Object[]{d, str2}));
            }
            taf.o(l05, new t6b(hge, jge, p23.B(new kc3[]{new kc3(f8a.H, new hge(i8a.Q0), 4, false), new kc3(f8a.G, new hge(i8a.P0), 2, false)})));
        } else if (j == ((long) f8a.M)) {
            boolean z3 = this.X;
            grd grd = this.B0;
            if (z3 && (z6b = (z6b) grd.getValue()) != null && (y6b = z6b.l) != null && y6b.a) {
                z2 = true;
            }
            z6b z6b2 = (z6b) grd.getValue();
            if (z6b2 != null && !z6b2.e && !z2) {
                taf.o(l05, new u6b(new hge(i8a.O0), (Integer) null));
            }
        } else if (z) {
            w();
        }
    }

    public final void w() {
        if (this.X) {
            qod D = xs7.D(this.a, u().a(), ru3.b, new i7b(this, (Continuation) null));
            this.H0.o1(this, J0[1], D);
        }
    }

    public final void x() {
        if (!hhd.f(this.C0.getValue(), this.B0.getValue())) {
            taf.o(this.F0, new t6b(new hge(i8a.U), (mge) null, p23.B(new kc3[]{new kc3(f8a.d0, new hge(i8a.V), 3, false), new kc3(f8a.c0, new hge(i8a.T), 2, false)})));
            return;
        }
        taf.o(this.E0, v03.b);
    }
}
