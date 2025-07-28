package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: gn8  reason: default package */
public final class gn8 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;

    public gn8(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
        this.g = t977;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.util.List r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cn8
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cn8 r0 = (defpackage.cn8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            cn8 r0 = new cn8
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            gn8 r4 = r0.o
            wx3.H(r6)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            wx3.H(r6)
            t97 r6 = r4.a
            java.lang.Object r6 = r6.getValue()
            b29 r6 = (defpackage.b29) r6
            r0.o = r4
            r0.Z = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.List r6 = (java.util.List) r6
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x0052
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0052:
            t97 r5 = r4.d
            java.lang.Object r5 = r5.getValue()
            bv2 r5 = (defpackage.bv2) r5
            java.lang.Object r0 = o23.V(r6)
            vo8 r0 = (defpackage.vo8) r0
            long r0 = r0.x0
            aw2 r5 = (defpackage.aw2) r5
            t0c r5 = r5.m(r0)
            zqd r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            i22 r5 = (defpackage.i22) r5
            if (r5 != 0) goto L_0x0075
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0075:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x007c
            goto L_0x0094
        L_0x007c:
            java.util.Iterator r6 = r6.iterator()
        L_0x0080:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r6.next()
            vo8 r0 = (defpackage.vo8) r0
            boolean r0 = r4.b(r5, r0)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0080
            r3 = 0
        L_0x0094:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn8.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(i22 i22, vo8 vo8) {
        if (!i22.J()) {
            boolean v = i22.v();
            boolean z = ((kb5) g()).s() && i22.w() && vo8.Y == ((lqc) f()).s();
            boolean z2 = ((kb5) g()).s() && (i22.a0() || d8.v(i22.d(i22.Y), 1024));
            if (i22.G()) {
                return v || z || z2;
            }
            if (v && (i22.a0() || i22.Y())) {
                return true;
            }
        }
        if (vo8.n()) {
            return false;
        }
        long s = ((lqc) f()).s();
        long j = vo8.Y;
        if (j != s && (j != 0 || !i22.D())) {
            return false;
        }
        if (i22.D() && j != 0) {
            return false;
        }
        vqc vqc = (vqc) ((xzc) this.f.getValue());
        vqc.getClass();
        if ((((lqc) f()).m() - vo8.o) / ((long) 1000) >= ((long) ((int) vqc.o(PmsKey.f32edittimeout, (long) 86400)))) {
            return false;
        }
        return vo8.c != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0122, code lost:
        if (h0e.c0(r1) == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0128, code lost:
        if (ete.H(r8) != false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable c(long r13, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.dn8
            if (r0 == 0) goto L_0x0013
            r0 = r15
            dn8 r0 = (defpackage.dn8) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            dn8 r0 = new dn8
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r13 = r0.X
            gn8 r12 = r0.o
            wx3.H(r15)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            wx3.H(r15)
            t97 r15 = r12.a
            java.lang.Object r15 = r15.getValue()
            b29 r15 = (defpackage.b29) r15
            r0.o = r12
            r0.X = r13
            r0.w0 = r3
            java.lang.Object r15 = r15.a(r13, r0)
            if (r15 != r1) goto L_0x004b
            return r1
        L_0x004b:
            vo8 r15 = (defpackage.vo8) r15
            hw4 r0 = hw4.a
            if (r15 != 0) goto L_0x0052
            return r0
        L_0x0052:
            boolean r1 = r15.v()
            if (r1 == 0) goto L_0x0059
            return r0
        L_0x0059:
            t97 r1 = r12.b
            java.lang.Object r1 = r1.getValue()
            rp8 r1 = (defpackage.rp8) r1
            xm8 r1 = defpackage.rp8.a(r1, r15)
            t97 r2 = r12.d
            java.lang.Object r2 = r2.getValue()
            bv2 r2 = (defpackage.bv2) r2
            long r4 = r15.x0
            aw2 r2 = (defpackage.aw2) r2
            t0c r2 = r2.m(r4)
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            i22 r2 = (defpackage.i22) r2
            if (r2 != 0) goto L_0x0080
            return r0
        L_0x0080:
            f03 r0 = r12.f()
            lqc r0 = (defpackage.lqc) r0
            long r4 = r0.s()
            long r6 = r15.Y
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r4 = 0
            if (r0 != 0) goto L_0x0093
            r0 = r3
            goto L_0x0094
        L_0x0093:
            r0 = r4
        L_0x0094:
            lg7 r5 = hwf.c()
            ir8 r8 = r12.h()
            boolean r8 = r8.b(r2, r1)
            if (r8 == 0) goto L_0x00a7
            zm8 r8 = defpackage.zm8.z0
            r5.add(r8)
        L_0x00a7:
            ir8 r8 = r12.h()
            boolean r8 = r8.d(r2, r1)
            if (r8 == 0) goto L_0x00b6
            zm8 r8 = defpackage.zm8.X
            r5.add(r8)
        L_0x00b6:
            ir8 r8 = r12.h()
            r8.getClass()
            vo8 r8 = r1.a
            boolean r9 = defpackage.ir8.c(r2, r8)
            if (r9 == 0) goto L_0x00ca
            zm8 r9 = defpackage.zm8.a
            r5.add(r9)
        L_0x00ca:
            int r9 = r8.b()
            if (r9 != r3) goto L_0x00d8
            boolean r9 = r8.w()
            if (r9 == 0) goto L_0x00d8
            r9 = r3
            goto L_0x00d9
        L_0x00d8:
            r9 = r4
        L_0x00d9:
            jb5 r10 = r12.g()
            kb5 r10 = (defpackage.kb5) r10
            r10.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r11 = ru.ok.tamtam.android.prefs.PmsKey.f34extsharingvideo
            boolean r10 = r10.m(r11, r4)
            if (r10 == 0) goto L_0x00f8
            int r10 = r8.b()
            if (r10 != r3) goto L_0x00f8
            boolean r10 = r8.C()
            if (r10 == 0) goto L_0x00f8
            r10 = r3
            goto L_0x00f9
        L_0x00f8:
            r10 = r4
        L_0x00f9:
            if (r9 != 0) goto L_0x00fd
            if (r10 == 0) goto L_0x0102
        L_0x00fd:
            zm8 r9 = defpackage.zm8.C0
            r5.add(r9)
        L_0x0102:
            java.lang.String r9 = r8.w0
            if (r9 == 0) goto L_0x010c
            boolean r9 = h0e.c0(r9)
            if (r9 == 0) goto L_0x012a
        L_0x010c:
            sq8 r1 = r1.c
            if (r1 == 0) goto L_0x011b
            xm8 r1 = r1.c
            if (r1 == 0) goto L_0x011b
            vo8 r1 = r1.a
            if (r1 == 0) goto L_0x011b
            java.lang.String r1 = r1.w0
            goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            if (r1 == 0) goto L_0x0124
            boolean r1 = h0e.c0(r1)
            if (r1 == 0) goto L_0x012a
        L_0x0124:
            boolean r1 = ete.H(r8)
            if (r1 == 0) goto L_0x012f
        L_0x012a:
            zm8 r1 = defpackage.zm8.b
            r5.add(r1)
        L_0x012f:
            zm8 r1 = defpackage.zm8.o
            r5.add(r1)
            j10 r1 = defpackage.j10.c
            jj7 r8 = r15.D0
            if (r8 == 0) goto L_0x0165
            java.lang.Object r9 = r8.a
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L_0x0141
            goto L_0x0165
        L_0x0141:
            j10 r10 = defpackage.j10.o
            boolean r10 = r15.l(r10)
            if (r10 != 0) goto L_0x0152
            boolean r10 = r15.l(r1)
            if (r10 == 0) goto L_0x0150
            goto L_0x0152
        L_0x0150:
            r10 = r4
            goto L_0x0153
        L_0x0152:
            r10 = r3
        L_0x0153:
            int r9 = r9.size()
            if (r9 != r3) goto L_0x015b
            r9 = r3
            goto L_0x015c
        L_0x015b:
            r9 = r4
        L_0x015c:
            if (r10 == 0) goto L_0x0165
            if (r9 == 0) goto L_0x0165
            zm8 r9 = defpackage.zm8.A0
            r5.add(r9)
        L_0x0165:
            if (r8 == 0) goto L_0x017f
            java.lang.Object r8 = r8.a
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x016e
            goto L_0x017f
        L_0x016e:
            boolean r1 = r15.l(r1)
            if (r1 == 0) goto L_0x017f
            int r1 = r8.size()
            if (r1 != r3) goto L_0x017f
            zm8 r1 = defpackage.zm8.B0
            r5.add(r1)
        L_0x017f:
            boolean r1 = r15.t()
            if (r1 != 0) goto L_0x01aa
            boolean r1 = r2.u()
            if (r1 == 0) goto L_0x01aa
            long r8 = r15.c
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x01aa
            xm8 r1 = r2.X
            if (r1 == 0) goto L_0x01a5
            vo8 r1 = r1.a
            long r8 = r1.b
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x01a5
            zm8 r13 = defpackage.zm8.x0
            r5.add(r13)
            goto L_0x01aa
        L_0x01a5:
            zm8 r13 = defpackage.zm8.w0
            r5.add(r13)
        L_0x01aa:
            f03 r13 = r12.f()
            lqc r13 = (defpackage.lqc) r13
            long r13 = r13.s()
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x01d3
            jb5 r13 = r12.g()
            boolean r13 = defpackage.ir8.a(r2, r13, r4)
            if (r13 == 0) goto L_0x01d3
            o62 r13 = r2.b
            ii5 r13 = r13.J
            r14 = 256(0x100, float:3.59E-43)
            boolean r13 = r13.b(r14)
            if (r13 != 0) goto L_0x01d3
            zm8 r13 = defpackage.zm8.c
            r5.add(r13)
        L_0x01d3:
            zm8 r13 = defpackage.zm8.y0
            r5.add(r13)
            jb5 r13 = r12.g()
            boolean r13 = defpackage.ir8.a(r2, r13, r0)
            if (r13 == 0) goto L_0x01e7
            zm8 r13 = defpackage.zm8.Y
            r5.add(r13)
        L_0x01e7:
            boolean r12 = r12.b(r2, r15)
            if (r12 == 0) goto L_0x01f2
            zm8 r12 = defpackage.zm8.Z
            r5.add(r12)
        L_0x01f2:
            lg7 r12 = hwf.a(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn8.c(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable d(long r9, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.en8
            if (r0 == 0) goto L_0x0013
            r0 = r11
            en8 r0 = (defpackage.en8) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            en8 r0 = new en8
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            long r9 = r0.X
            gn8 r8 = r0.o
            wx3.H(r11)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            wx3.H(r11)
            t97 r11 = r8.a
            java.lang.Object r11 = r11.getValue()
            b29 r11 = (defpackage.b29) r11
            r0.o = r8
            r0.X = r9
            r0.w0 = r3
            java.lang.Object r11 = r11.a(r9, r0)
            if (r11 != r1) goto L_0x004b
            return r1
        L_0x004b:
            vo8 r11 = (defpackage.vo8) r11
            hw4 r0 = hw4.a
            if (r11 != 0) goto L_0x0052
            return r0
        L_0x0052:
            boolean r1 = r11.v()
            if (r1 == 0) goto L_0x0059
            return r0
        L_0x0059:
            t97 r1 = r8.b
            java.lang.Object r1 = r1.getValue()
            rp8 r1 = (defpackage.rp8) r1
            xm8 r1 = defpackage.rp8.a(r1, r11)
            t97 r2 = r8.d
            java.lang.Object r2 = r2.getValue()
            bv2 r2 = (defpackage.bv2) r2
            long r4 = r11.x0
            aw2 r2 = (defpackage.aw2) r2
            t0c r2 = r2.m(r4)
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            i22 r2 = (defpackage.i22) r2
            if (r2 != 0) goto L_0x0080
            return r0
        L_0x0080:
            f03 r0 = r8.f()
            lqc r0 = (defpackage.lqc) r0
            long r4 = r0.s()
            long r6 = r11.Y
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r3 = 0
        L_0x0092:
            lg7 r0 = hwf.c()
            zm8 r4 = defpackage.zm8.b
            r0.add(r4)
            ir8 r4 = r8.h()
            boolean r4 = r4.d(r2, r1)
            if (r4 == 0) goto L_0x00aa
            zm8 r4 = defpackage.zm8.X
            r0.add(r4)
        L_0x00aa:
            ir8 r4 = r8.h()
            r4.getClass()
            vo8 r1 = r1.a
            boolean r1 = defpackage.ir8.c(r2, r1)
            if (r1 == 0) goto L_0x00be
            zm8 r1 = defpackage.zm8.a
            r0.add(r1)
        L_0x00be:
            boolean r1 = r11.t()
            if (r1 != 0) goto L_0x00e9
            boolean r1 = r2.u()
            if (r1 == 0) goto L_0x00e9
            long r4 = r11.c
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x00e9
            xm8 r11 = r2.X
            if (r11 == 0) goto L_0x00e4
            vo8 r11 = r11.a
            long r4 = r11.b
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x00e4
            zm8 r9 = defpackage.zm8.x0
            r0.add(r9)
            goto L_0x00e9
        L_0x00e4:
            zm8 r9 = defpackage.zm8.w0
            r0.add(r9)
        L_0x00e9:
            jb5 r8 = r8.g()
            boolean r8 = defpackage.ir8.a(r2, r8, r3)
            if (r8 == 0) goto L_0x00f8
            zm8 r8 = defpackage.zm8.Y
            r0.add(r8)
        L_0x00f8:
            lg7 r8 = hwf.a(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn8.d(long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable e(java.util.Set r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fn8
            if (r0 == 0) goto L_0x0013
            r0 = r8
            fn8 r0 = (defpackage.fn8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            fn8 r0 = new fn8
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            gn8 r6 = r0.o
            wx3.H(r8)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            wx3.H(r8)
            t97 r8 = r6.a
            java.lang.Object r8 = r8.getValue()
            b29 r8 = (defpackage.b29) r8
            r0.o = r6
            r0.Z = r3
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.util.List r8 = (java.util.List) r8
            boolean r7 = r8.isEmpty()
            hw4 r0 = hw4.a
            if (r7 == 0) goto L_0x0052
            return r0
        L_0x0052:
            t97 r7 = r6.d
            java.lang.Object r7 = r7.getValue()
            bv2 r7 = (defpackage.bv2) r7
            java.lang.Object r1 = o23.V(r8)
            vo8 r1 = (defpackage.vo8) r1
            long r1 = r1.x0
            aw2 r7 = (defpackage.aw2) r7
            t0c r7 = r7.m(r1)
            zqd r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            i22 r7 = (defpackage.i22) r7
            if (r7 != 0) goto L_0x0073
            return r0
        L_0x0073:
            lg7 r0 = hwf.c()
            zm8 r1 = defpackage.zm8.b
            r0.add(r1)
            java.util.Iterator r1 = r8.iterator()
        L_0x0080:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009a
            java.lang.Object r2 = r1.next()
            vo8 r2 = (defpackage.vo8) r2
            ir8 r4 = r6.h()
            r4.getClass()
            boolean r2 = defpackage.ir8.c(r7, r2)
            if (r2 != 0) goto L_0x0080
            goto L_0x009f
        L_0x009a:
            zm8 r1 = defpackage.zm8.a
            r0.add(r1)
        L_0x009f:
            java.util.Iterator r8 = r8.iterator()
        L_0x00a3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00cd
            java.lang.Object r1 = r8.next()
            vo8 r1 = (defpackage.vo8) r1
            long r1 = r1.Y
            f03 r4 = r6.f()
            lqc r4 = (defpackage.lqc) r4
            long r4 = r4.s()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x00c1
            r1 = r3
            goto L_0x00c2
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            jb5 r2 = r6.g()
            boolean r1 = defpackage.ir8.a(r7, r2, r1)
            if (r1 != 0) goto L_0x00a3
            goto L_0x00d2
        L_0x00cd:
            zm8 r6 = defpackage.zm8.Y
            r0.add(r6)
        L_0x00d2:
            lg7 r6 = hwf.a(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn8.e(java.util.Set, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final f03 f() {
        return (f03) this.e.getValue();
    }

    public final jb5 g() {
        return (jb5) this.g.getValue();
    }

    public final ir8 h() {
        return (ir8) this.c.getValue();
    }
}
