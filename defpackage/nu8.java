package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: nu8  reason: default package */
public final class nu8 extends taf {
    public static final /* synthetic */ k77[] Z0;
    public final t97 A0;
    public final t97 B0;
    public final e3 C0 = hwf.t();
    public final l05 D0;
    public final grd E0;
    public final t0c F0;
    public final grd G0;
    public final t0c H0;
    public final grd I0;
    public final t0c J0;
    public final grd K0;
    public final t0c L0;
    public final grd M0;
    public final t0c N0;
    public final grd O0;
    public final t0c P0;
    public final grd Q0;
    public final t0c R0;
    public final grd S0;
    public final grd T0;
    public final grd U0;
    public final t0c V0;
    public final ik5 W0;
    public final t97 X;
    public final l05 X0;
    public final t97 Y;
    public final t0c Y0;
    public final t97 Z;
    public final zqd b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        k77 hc9 = new hc9(nu8.class, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        Z0 = new k77[]{hc9};
    }

    public nu8(Set set, Long l, boolean z, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710, t97 t9711, t0c t0c) {
        this.b = t0c;
        this.c = t97;
        this.o = t973;
        this.X = t974;
        this.Y = t975;
        this.Z = t976;
        this.w0 = t977;
        this.x0 = t9710;
        this.y0 = t972;
        this.z0 = t978;
        this.A0 = t979;
        this.B0 = t9711;
        icd.b(0, Integer.MAX_VALUE, 0, 4);
        this.D0 = new l05(0);
        grd a = hrd.a((Object) null);
        this.E0 = a;
        this.F0 = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.G0 = a2;
        this.H0 = new t0c(a2);
        grd a3 = hrd.a((Object) null);
        this.I0 = a3;
        this.J0 = new t0c(a3);
        grd a4 = hrd.a((Object) null);
        this.K0 = a4;
        this.L0 = new t0c(a4);
        grd a5 = hrd.a((Object) null);
        this.M0 = a5;
        pj5 J = ez3.J(new ju8(a5, this, 0), ((pae) t972.getValue()).b());
        qr4 qr4 = ucd.a;
        this.N0 = ez3.d0(J, this.a, qr4, (Object) null);
        grd a6 = hrd.a((Object) null);
        this.O0 = a6;
        this.P0 = ez3.d0(ez3.J(new ju8(a6, this, 1), ((pae) t972.getValue()).b()), this.a, qr4, (Object) null);
        grd a7 = hrd.a((Object) null);
        this.Q0 = a7;
        this.R0 = new t0c(a7);
        grd a8 = hrd.a(Boolean.FALSE);
        this.S0 = a8;
        grd a9 = hrd.a((Object) null);
        this.T0 = a9;
        grd a10 = hrd.a(set != null ? new ot8(set, l, z) : null);
        this.U0 = a10;
        this.V0 = ez3.d0(ez3.J(ez3.s(a10, a9, a8, new cu8(this, (Continuation) null)), ((pae) t972.getValue()).b()), this.a, qr4, (Object) null);
        this.W0 = new ik5(t0c, 26);
        this.X0 = new l05(0);
        this.Y0 = ez3.d0(ez3.z(new ik5(t0c, 27)), this.a, qr4, (Object) null);
    }

    public static void C(nu8 nu8, Long l, CharSequence charSequence, Integer num, int i) {
        qt8 qt8 = null;
        if ((i & 2) != 0) {
            charSequence = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        boolean z = (i & 8) != 0;
        grd grd = nu8.M0;
        if (grd.getValue() != null) {
            grd.setValue((Object) null);
        }
        if (l != null) {
            nu8.T0.m((Object) null, new rt8(charSequence, num));
            qt8 = new qt8(l.longValue(), z);
        }
        nu8.O0.setValue(qt8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.nu8 r11, defpackage.ot8 r12, defpackage.rt8 r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof defpackage.bu8
            if (r0 == 0) goto L_0x0017
            r0 = r15
            bu8 r0 = (defpackage.bu8) r0
            int r1 = r0.A0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0017
            int r1 = r1 - r2
            r0.A0 = r1
        L_0x0015:
            r6 = r0
            goto L_0x001d
        L_0x0017:
            bu8 r0 = new bu8
            r0.<init>(r11, r15)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r15 = r6.y0
            pu3 r0 = pu3.a
            int r1 = r6.A0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r7 = 0
            if (r1 == 0) goto L_0x009a
            if (r1 == r5) goto L_0x007f
            if (r1 == r4) goto L_0x006c
            if (r1 == r3) goto L_0x004d
            if (r1 != r2) goto L_0x0045
            boolean r11 = r6.w0
            java.lang.Object r12 = r6.Y
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r13 = r6.X
            java.util.Set r13 = (java.util.Set) r13
            java.lang.Object r14 = r6.o
            rt8 r14 = (defpackage.rt8) r14
            wx3.H(r15)
            goto L_0x0165
        L_0x0045:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004d:
            boolean r11 = r6.x0
            boolean r14 = r6.w0
            java.lang.Long r12 = r6.Z
            java.lang.Object r13 = r6.Y
            java.util.Set r13 = (java.util.Set) r13
            java.lang.Object r1 = r6.X
            rt8 r1 = (defpackage.rt8) r1
            java.lang.Object r3 = r6.o
            nu8 r3 = (defpackage.nu8) r3
            wx3.H(r15)
            r9 = r12
            r5 = r14
            r12 = r11
            r11 = r3
            r10 = r15
            r15 = r13
            r13 = r1
            r1 = r10
            goto L_0x013a
        L_0x006c:
            boolean r11 = r6.w0
            java.lang.Object r12 = r6.Y
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r13 = r6.X
            java.util.Set r13 = (java.util.Set) r13
            java.lang.Object r14 = r6.o
            rt8 r14 = (defpackage.rt8) r14
            wx3.H(r15)
            goto L_0x010c
        L_0x007f:
            boolean r11 = r6.x0
            boolean r14 = r6.w0
            java.lang.Long r12 = r6.Z
            java.lang.Object r13 = r6.Y
            java.util.Set r13 = (java.util.Set) r13
            java.lang.Object r1 = r6.X
            rt8 r1 = (defpackage.rt8) r1
            java.lang.Object r2 = r6.o
            nu8 r2 = (defpackage.nu8) r2
            wx3.H(r15)
            r9 = r12
            r5 = r14
            r14 = r1
            r12 = r11
            r11 = r2
            goto L_0x00e3
        L_0x009a:
            wx3.H(r15)
            if (r12 == 0) goto L_0x00aa
            java.util.Set r15 = r12.a
            if (r15 != 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x00ad
        L_0x00aa:
            r0 = r7
            goto L_0x016e
        L_0x00ad:
            int r1 = r15.size()
            t97 r8 = r11.X
            java.lang.Long r9 = r12.b
            boolean r12 = r12.c
            if (r1 <= r5) goto L_0x0114
            java.lang.Object r1 = r8.getValue()
            b29 r1 = (defpackage.b29) r1
            java.lang.Object r2 = o23.U(r15)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r6.o = r11
            r6.X = r13
            r6.Y = r15
            r6.Z = r9
            r6.w0 = r14
            r6.x0 = r12
            r6.A0 = r5
            java.lang.Object r1 = r1.a(r2, r6)
            if (r1 != r0) goto L_0x00df
            goto L_0x016e
        L_0x00df:
            r5 = r14
            r14 = r13
            r13 = r15
            r15 = r1
        L_0x00e3:
            vo8 r15 = (defpackage.vo8) r15
            if (r15 == 0) goto L_0x00aa
            t97 r11 = r11.A0
            java.lang.Object r11 = r11.getValue()
            r1 = r11
            cv5 r1 = (cv5) r1
            int r2 = r13.size()
            r6.o = r14
            r6.X = r13
            r6.Y = r9
            r6.Z = r7
            r6.w0 = r12
            r6.A0 = r4
            long r3 = r15.x0
            java.lang.Object r15 = r1.b(r2, r3, r5, r6)
            if (r15 != r0) goto L_0x010a
            goto L_0x016e
        L_0x010a:
            r11 = r12
            r12 = r9
        L_0x010c:
            tt8 r15 = (defpackage.tt8) r15
        L_0x010e:
            r3 = r11
            r2 = r12
            r1 = r13
            r4 = r14
            r5 = r15
            goto L_0x0168
        L_0x0114:
            java.lang.Object r1 = r8.getValue()
            b29 r1 = (defpackage.b29) r1
            java.lang.Object r4 = o23.U(r15)
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            r6.o = r11
            r6.X = r13
            r6.Y = r15
            r6.Z = r9
            r6.w0 = r14
            r6.x0 = r12
            r6.A0 = r3
            java.lang.Object r1 = r1.a(r4, r6)
            if (r1 != r0) goto L_0x0139
            goto L_0x016e
        L_0x0139:
            r5 = r14
        L_0x013a:
            r14 = r1
            vo8 r14 = (defpackage.vo8) r14
            if (r14 != 0) goto L_0x0141
            goto L_0x00aa
        L_0x0141:
            t97 r11 = r11.A0
            java.lang.Object r11 = r11.getValue()
            r1 = r11
            cv5 r1 = (cv5) r1
            r6.o = r13
            r6.X = r15
            r6.Y = r9
            r6.Z = r7
            r6.w0 = r12
            r6.A0 = r2
            r2 = r14
            r3 = r9
            r4 = r12
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L_0x0160
            goto L_0x016e
        L_0x0160:
            r14 = r13
            r13 = r15
            r15 = r11
            r11 = r12
            r12 = r9
        L_0x0165:
            tt8 r15 = (defpackage.tt8) r15
            goto L_0x010e
        L_0x0168:
            pt8 r11 = new pt8
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x016e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu8.q(nu8, ot8, rt8, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.nu8 r13, defpackage.qt8 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof defpackage.du8
            if (r0 == 0) goto L_0x0016
            r0 = r15
            du8 r0 = (defpackage.du8) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x001b
        L_0x0016:
            du8 r0 = new du8
            r0.<init>(r13, r15)
        L_0x001b:
            java.lang.Object r15 = r0.Z
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            tt8 r13 = r0.Y
            qt8 r14 = r0.X
            nu8 r0 = r0.o
            wx3.H(r15)
            r10 = r13
            goto L_0x0080
        L_0x0035:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003d:
            qt8 r14 = r0.X
            nu8 r13 = r0.o
            wx3.H(r15)
            goto L_0x0062
        L_0x0045:
            wx3.H(r15)
            if (r14 != 0) goto L_0x004d
        L_0x004a:
            r1 = r3
            goto L_0x00d3
        L_0x004d:
            java.lang.Long r15 = new java.lang.Long
            long r6 = r14.a
            r15.<init>(r6)
            r0.o = r13
            r0.X = r14
            r0.x0 = r5
            java.lang.Object r15 = r13.x(r15, r5, r0)
            if (r15 != r1) goto L_0x0062
            goto L_0x00d3
        L_0x0062:
            tt8 r15 = (defpackage.tt8) r15
            t97 r2 = r13.X
            java.lang.Object r2 = r2.getValue()
            b29 r2 = (defpackage.b29) r2
            long r6 = r14.a
            r0.o = r13
            r0.X = r14
            r0.Y = r15
            r0.x0 = r4
            java.lang.Object r0 = r2.a(r6, r0)
            if (r0 != r1) goto L_0x007d
            goto L_0x00d3
        L_0x007d:
            r10 = r15
            r15 = r0
            r0 = r13
        L_0x0080:
            vo8 r15 = (defpackage.vo8) r15
            if (r10 == 0) goto L_0x004a
            if (r15 != 0) goto L_0x0087
            goto L_0x004a
        L_0x0087:
            t97 r13 = r0.z0
            java.lang.Object r13 = r13.getValue()
            w6a r13 = (w6a) r13
            java.lang.String r1 = r15.w0
            java.util.List r2 = r15.V0
            java.lang.CharSequence r13 = r13.k(r1, r2)
            t97 r0 = r0.z0
            java.lang.Object r0 = r0.getValue()
            w6a r0 = (w6a) r0
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r4, r1, r3)
            int r1 = a24.X(r1)
            java.lang.CharSequence r9 = r0.j(r13, r2, r1)
            nt8 r1 = new nt8
            long r7 = r14.a
            j10 r13 = defpackage.j10.c
            boolean r13 = r15.l(r13)
            if (r13 != 0) goto L_0x00cc
            j10 r13 = defpackage.j10.o
            boolean r13 = r15.l(r13)
            if (r13 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            r11 = r5
            boolean r12 = r14.b
            r6 = r1
            r6.<init>(r7, r9, r10, r11, r12)
        L_0x00d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu8.r(nu8, qt8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void y(nu8 nu8, boolean z, boolean z2, int i) {
        it8 it8;
        int i2 = 0;
        if ((i & 1) != 0) {
            z = false;
        }
        int i3 = 2;
        if ((i & 2) != 0) {
            z2 = false;
        }
        grd grd = nu8.E0;
        i05 i05 = (i05) grd.getValue();
        kt8 kt8 = i05 != null ? (kt8) i05.a : null;
        if (z2) {
            if ((kt8 != null ? kt8.a : 0) != 2) {
                return;
            }
        }
        i05 i052 = (i05) nu8.G0.getValue();
        if (i052 == null || (it8 = (it8) i052.a) == null || !it8.a) {
            if (z2) {
                i3 = 4;
            } else if (z) {
                i3 = 1;
            } else {
                if (kt8 != null) {
                    i2 = kt8.a;
                }
                if (i2 == 2) {
                    i3 = 3;
                }
            }
            grd.m((Object) null, new i05(new kt8(i3)));
            return;
        }
        nu8.A(3, (zp8) null);
    }

    public static void z(nu8 nu8, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        nu8.A(i, (zp8) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = (defpackage.it8) r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(int r5, defpackage.zp8 r6) {
        /*
            r4 = this;
            grd r0 = r4.G0
            java.lang.Object r1 = r0.getValue()
            i05 r1 = (defpackage.i05) r1
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r1.a
            it8 r1 = (defpackage.it8) r1
            if (r1 == 0) goto L_0x0014
            boolean r1 = r1.a
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r6 != 0) goto L_0x0028
            r6 = 3
            if (r5 == r6) goto L_0x0026
            r6 = 2
            if (r5 != r6) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            zp8 r6 = defpackage.zp8.c
            goto L_0x0028
        L_0x0023:
            zp8 r6 = defpackage.zp8.b
            goto L_0x0028
        L_0x0026:
            zp8 r6 = defpackage.zp8.a
        L_0x0028:
            jt8 r3 = new jt8
            r3.<init>(r6)
            i05 r6 = new i05
            r6.<init>(r3)
            grd r4 = r4.I0
            r3 = 0
            r4.m(r3, r6)
            if (r1 != 0) goto L_0x0043
            r4 = 4
            if (r5 != r4) goto L_0x0043
            it8 r4 = new it8
            r4.<init>(r2, r5)
            goto L_0x0052
        L_0x0043:
            r4 = 1
            if (r1 != 0) goto L_0x004b
            if (r5 != r4) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r4 = r3
            goto L_0x0052
        L_0x004b:
            it8 r6 = new it8
            r4 = r4 ^ r1
            r6.<init>(r4, r5)
            r4 = r6
        L_0x0052:
            if (r4 == 0) goto L_0x005c
            i05 r5 = new i05
            r5.<init>(r4)
            r0.m(r3, r5)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu8.A(int, zp8):void");
    }

    public final void B(CharSequence charSequence, boolean z) {
        jv5 jv5;
        if ((charSequence != null && !h0e.c0(charSequence)) || t()) {
            Long l = (Long) this.M0.getValue();
            pt8 pt8 = (pt8) this.V0.a.getValue();
            if (pt8 != null) {
                jv5 = new jv5(pt8.a, pt8.b, pt8.c, charSequence, pt8.e.h);
            } else {
                jv5 = null;
            }
            xs7.E(this.a, ((pae) this.y0.getValue()).a(), (ru3) null, new fu8(this, l, jv5, charSequence, z, (Continuation) null), 2);
            taf.o(this.D0, new wt8(jv5));
        }
    }

    public final void D(Long l) {
        grd grd = this.O0;
        if (grd.getValue() != null) {
            grd.setValue((Object) null);
        }
        this.M0.setValue(l);
    }

    public final void s() {
        this.U0.setValue((Object) null);
        this.T0.setValue((Object) null);
        this.S0.m((Object) null, Boolean.FALSE);
    }

    public final boolean t() {
        return this.V0.a.getValue() != null && this.N0.a.getValue() == null;
    }

    public final Long u() {
        qt8 qt8 = (qt8) this.O0.getValue();
        if (qt8 != null) {
            return Long.valueOf(qt8.a);
        }
        return null;
    }

    public final pt8 v() {
        return (pt8) this.V0.a.getValue();
    }

    public final Long w() {
        return (Long) this.M0.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.Long r26, boolean r27, kotlin.coroutines.Continuation r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r28
            boolean r2 = r1 instanceof defpackage.eu8
            if (r2 == 0) goto L_0x0018
            r2 = r1
            eu8 r2 = (defpackage.eu8) r2
            int r3 = r2.y0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.y0 = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            eu8 r2 = new eu8
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.w0
            pu3 r2 = pu3.a
            int r3 = r8.y0
            r10 = 1
            r11 = 2
            r4 = 3
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0064
            if (r3 == r10) goto L_0x0055
            if (r3 == r11) goto L_0x0048
            if (r3 != r4) goto L_0x0040
            int r0 = r8.Z
            boolean r2 = r8.Y
            java.lang.Object r3 = r8.o
            mge r3 = (defpackage.mge) r3
            wx3.H(r1)
            r16 = r3
            goto L_0x013e
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            boolean r0 = r8.Y
            vo8 r3 = r8.X
            java.lang.Object r5 = r8.o
            nu8 r5 = (defpackage.nu8) r5
            wx3.H(r1)
            goto L_0x00d3
        L_0x0055:
            boolean r0 = r8.Y
            java.lang.Object r3 = r8.o
            nu8 r3 = (defpackage.nu8) r3
            wx3.H(r1)
            r24 = r3
            r3 = r0
            r0 = r24
            goto L_0x0085
        L_0x0064:
            wx3.H(r1)
            if (r26 != 0) goto L_0x006a
            return r13
        L_0x006a:
            t97 r1 = r0.X
            java.lang.Object r1 = r1.getValue()
            b29 r1 = (defpackage.b29) r1
            long r5 = r26.longValue()
            r8.o = r0
            r3 = r27
            r8.Y = r3
            r8.y0 = r10
            java.lang.Object r1 = r1.a(r5, r8)
            if (r1 != r2) goto L_0x0085
            return r2
        L_0x0085:
            vo8 r1 = (defpackage.vo8) r1
            if (r1 != 0) goto L_0x008a
            return r13
        L_0x008a:
            if (r3 == 0) goto L_0x0099
            int r5 = defpackage.z9a.k
            hge r6 = new hge
            r6.<init>(r5)
        L_0x0093:
            r5 = r1
            r14 = r3
            r15 = r6
            r1 = r12
            goto L_0x0100
        L_0x0099:
            t97 r5 = r0.c
            java.lang.Object r5 = r5.getValue()
            f03 r5 = (defpackage.f03) r5
            lqc r5 = (defpackage.lqc) r5
            long r5 = r5.s()
            long r14 = r1.Y
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x00b5
            int r5 = defpackage.z9a.l
            hge r6 = new hge
            r6.<init>(r5)
            goto L_0x0093
        L_0x00b5:
            t97 r5 = r0.o
            java.lang.Object r5 = r5.getValue()
            ap3 r5 = (defpackage.ap3) r5
            r8.o = r0
            r8.X = r1
            r8.Y = r3
            r8.y0 = r11
            java.lang.Comparable r5 = r5.b(r14, r8)
            if (r5 != r2) goto L_0x00cc
            return r2
        L_0x00cc:
            r24 = r5
            r5 = r0
            r0 = r3
            r3 = r1
            r1 = r24
        L_0x00d3:
            tf3 r1 = (defpackage.tf3) r1
            if (r1 == 0) goto L_0x00df
            boolean r6 = r1.u()
            if (r6 != r10) goto L_0x00df
            r6 = r10
            goto L_0x00e0
        L_0x00df:
            r6 = r12
        L_0x00e0:
            int r7 = defpackage.z9a.m
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = r1.d()
            goto L_0x00ea
        L_0x00e9:
            r1 = r13
        L_0x00ea:
            if (r1 != 0) goto L_0x00ee
            java.lang.String r1 = ""
        L_0x00ee:
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            jge r9 = new jge
            java.util.List r1 = cs.g0(r1)
            r9.<init>(r7, r1)
            r14 = r0
            r0 = r5
            r1 = r6
            r15 = r9
            r5 = r3
        L_0x0100:
            t97 r0 = r0.x0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            ny r3 = (defpackage.ny) r3
            nge r0 = defpackage.nte.l
            yq4 r6 = defpackage.yq4.b
            long r6 = r0.g(r6)
            float r0 = defpackage.ah4.e(r6)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r0 = r0 * r6
            int r7 = (int) r0
            r8.o = r15
            r8.X = r13
            r8.Y = r14
            r8.Z = r1
            r8.y0 = r4
            r6 = 0
            r9 = 4
            r4 = r5
            r5 = r14
            java.lang.Object r0 = defpackage.ny.b(r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L_0x0136
            return r2
        L_0x0136:
            r2 = r14
            r16 = r15
            r24 = r1
            r1 = r0
            r0 = r24
        L_0x013e:
            iy r1 = (defpackage.iy) r1
            if (r2 == 0) goto L_0x0144
            r15 = r10
            goto L_0x0145
        L_0x0144:
            r15 = r11
        L_0x0145:
            java.lang.CharSequence r2 = r1.a
            if (r2 == 0) goto L_0x014e
            lge r13 = new lge
            r13.<init>(r2)
        L_0x014e:
            r18 = r13
            tt8 r2 = new tt8
            if (r0 == 0) goto L_0x0157
            r17 = r10
            goto L_0x0159
        L_0x0157:
            r17 = r12
        L_0x0159:
            java.lang.Integer r0 = r1.c
            java.lang.Integer r3 = r1.d
            java.lang.String r1 = r1.b
            r22 = 0
            r23 = 0
            r14 = r2
            r19 = r1
            r20 = r0
            r21 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu8.x(java.lang.Long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
