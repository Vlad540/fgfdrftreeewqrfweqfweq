package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jp0  reason: default package */
public final class jp0 extends h5b {
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k = ez3.O(3, new m(20));
    public final qg4 l;

    public jp0(long j2, ou3 ou3) {
        super(j2);
        i6b i6b = i6b.a;
        t97 e = i6b.e();
        this.f = e;
        this.g = i6b.c();
        this.h = i6b.getAccessor().d(zod.class);
        this.i = i6b.getAccessor().d(g5e.class);
        t97 f2 = i6b.f();
        this.j = i6b.getAccessor().d(xzc.class);
        qg4 a = ((o5b) i6b.getAccessor().c(o5b.class)).a(j2);
        this.l = a;
        ez3.N(ez3.J(new ck5(new bc(new ik5(((ap3) e.getValue()).c(j2), 2), 4, this), new hp0(2, this, jp0.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 0), 5), ((pae) f2.getValue()).a()), ou3);
        ez3.N(ez3.J(new ck5(new s0c(a.d), new hp0(2, this, jp0.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 1), 5), ((pae) f2.getValue()).a()), ou3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = ((defpackage.zod) r4.h.getValue()).a(r0.longValue(), r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object B(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            java.lang.Long r0 = r4.i()
            jue r1 = jue.a
            if (r0 == 0) goto L_0x001d
            long r2 = r0.longValue()
            t97 r4 = r4.h
            java.lang.Object r4 = r4.getValue()
            zod r4 = (defpackage.zod) r4
            java.lang.Object r4 = r4.a(r2, r5)
            pu3 r5 = pu3.a
            if (r4 != r5) goto L_0x001d
            return r4
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.B(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = ((defpackage.g5e) r4.i.getValue()).a(r0.longValue(), r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            java.lang.Long r0 = r4.i()
            jue r1 = jue.a
            if (r0 == 0) goto L_0x001d
            long r2 = r0.longValue()
            t97 r4 = r4.i
            java.lang.Object r4 = r4.getValue()
            g5e r4 = (defpackage.g5e) r4
            java.lang.Object r4 = r4.a(r2, r5)
            pu3 r5 = pu3.a
            if (r4 != r5) goto L_0x001d
            return r4
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.C(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0231  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.g5b E(defpackage.tf3 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = r25.j()
            java.lang.String r2 = defpackage.ehe.c(r2)
            long r4 = r25.n()
            java.lang.String r9 = r25.d()
            java.lang.CharSequence r10 = r25.m()
            int r3 = defpackage.l8a.V
            hge r11 = new hge
            r11.<init>(r3)
            java.util.List r7 = r25.r()
            fj0 r3 = defpackage.fj0.b
            java.lang.String r8 = r1.p(r3)
            boolean r3 = r25.s()
            r15 = 1
            r23 = 0
            if (r3 != 0) goto L_0x003c
            int r3 = r25.k()
            if (r3 == 0) goto L_0x0039
            goto L_0x003c
        L_0x0039:
            r13 = r23
            goto L_0x003d
        L_0x003c:
            r13 = r15
        L_0x003d:
            lge r12 = new lge
            r12.<init>(r2)
            boolean r14 = r25.u()
            l5b r2 = new l5b
            r6 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            t97 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            ntc r3 = (defpackage.ntc) r3
            i22 r4 = r24.F()
            r3.getClass()
            lg7 r5 = hwf.c()
            r3.b(r5, r1, r4)
            w6a r16 = r3.a()
            w6a r3 = r3.a()
            java.lang.CharSequence r17 = r1.l(r3)
            r16.getClass()
            r19 = 0
            r22 = 1
            r20 = 1
            r21 = 0
            r18 = r23
            java.lang.CharSequence r1 = r16.a(r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x0098
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            int r3 = defpackage.l8a.E
            hcb r4 = new hcb
            hge r6 = new hge
            r6.<init>(r3)
            r4.<init>(r1, r6)
            r5.add(r4)
        L_0x0098:
            zbb r1 = new zbb
            r1.<init>()
            r5.add(r1)
            lg7 r1 = hwf.a(r5)
            t97 r3 = r0.b
            java.lang.Object r3 = r3.getValue()
            gu0 r3 = (defpackage.gu0) r3
            i22 r4 = r24.F()
            r3.getClass()
            m62 r5 = defpackage.m62.o
            r6 = 0
            if (r4 == 0) goto L_0x0121
            o62 r8 = r4.b
            long r9 = r8.a
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0121
            boolean r9 = r4.d0()
            if (r9 == 0) goto L_0x00cc
            m62 r8 = r8.c
            if (r8 != r5) goto L_0x00cc
            goto L_0x0121
        L_0x00cc:
            boolean r8 = r4.T()
            if (r8 == 0) goto L_0x00f7
            c1a r3 = defpackage.gu0.d()
            c1a r4 = new c1a
            int r9 = defpackage.j8a.m1
            int r8 = defpackage.l8a.J
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            int r8 = defpackage.phc.G1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r13 = 0
            r14 = 52
            r11 = 0
            r8 = r4
            r8.<init>((int) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (int) r14)
            c1a[] r3 = new defpackage.c1a[]{r3, r4}
            java.util.List r3 = p23.B(r3)
            goto L_0x014b
        L_0x00f7:
            lg7 r8 = hwf.c()
            c1a r9 = defpackage.gu0.d()
            r8.add(r9)
            t97 r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            f03 r3 = (defpackage.f03) r3
            boolean r3 = r4.S(r3)
            if (r3 == 0) goto L_0x0115
            c1a r3 = defpackage.gu0.a()
            goto L_0x0119
        L_0x0115:
            c1a r3 = defpackage.gu0.b()
        L_0x0119:
            r8.add(r3)
            lg7 r3 = hwf.a(r8)
            goto L_0x014b
        L_0x0121:
            lg7 r3 = hwf.c()
            c1a r4 = defpackage.gu0.d()
            r3.add(r4)
            c1a r4 = new c1a
            int r9 = defpackage.j8a.m1
            int r8 = defpackage.l8a.J
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            int r8 = defpackage.phc.G1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r13 = 0
            r14 = 52
            r11 = 0
            r8 = r4
            r8.<init>((int) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (int) r14)
            r3.add(r4)
            lg7 r3 = hwf.a(r3)
        L_0x014b:
            t97 r4 = r0.k
            java.lang.Object r4 = r4.getValue()
            l6b r4 = (defpackage.l6b) r4
            i22 r8 = r24.F()
            t97 r9 = r0.j
            java.lang.Object r9 = r9.getValue()
            xzc r9 = (defpackage.xzc) r9
            vqc r9 = (defpackage.vqc) r9
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r10 = ru.ok.tamtam.android.prefs.PmsKey.f9botcomplaintenabled
            r11 = 0
            boolean r9 = r9.m(r10, r11)
            if (r9 == 0) goto L_0x0182
            i22 r0 = r24.F()
            if (r0 == 0) goto L_0x0180
            o62 r0 = r0.b
            ii5 r0 = r0.J
            r9 = 256(0x100, float:3.59E-43)
            boolean r0 = r0.b(r9)
            if (r0 != r15) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r23 = r15
        L_0x0182:
            r4.getClass()
            t97 r0 = r4.c
            if (r8 == 0) goto L_0x022b
            o62 r9 = r8.b
            long r10 = r9.a
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x022b
            boolean r6 = r8.d0()
            if (r6 == 0) goto L_0x019d
            m62 r6 = r9.c
            if (r6 != r5) goto L_0x019d
            goto L_0x022b
        L_0x019d:
            boolean r5 = r8.T()
            t97 r6 = r4.b
            t97 r7 = r4.a
            xm8 r10 = r8.c
            if (r5 == 0) goto L_0x01dc
            lg7 r5 = hwf.c()
            java.lang.Object r7 = r7.getValue()
            c1a r7 = (defpackage.c1a) r7
            r5.add(r7)
            if (r10 == 0) goto L_0x01c1
            java.lang.Object r6 = r6.getValue()
            c1a r6 = (defpackage.c1a) r6
            r5.add(r6)
        L_0x01c1:
            if (r23 == 0) goto L_0x01cc
            java.lang.Object r0 = r0.getValue()
            c1a r0 = (defpackage.c1a) r0
            r5.add(r0)
        L_0x01cc:
            t97 r0 = r4.f
            java.lang.Object r0 = r0.getValue()
            c1a r0 = (defpackage.c1a) r0
            r5.add(r0)
            lg7 r0 = hwf.a(r5)
            goto L_0x023e
        L_0x01dc:
            lg7 r5 = hwf.c()
            java.lang.Object r7 = r7.getValue()
            c1a r7 = (defpackage.c1a) r7
            r5.add(r7)
            if (r10 == 0) goto L_0x01f4
            java.lang.Object r6 = r6.getValue()
            c1a r6 = (defpackage.c1a) r6
            r5.add(r6)
        L_0x01f4:
            if (r23 == 0) goto L_0x01ff
            java.lang.Object r0 = r0.getValue()
            c1a r0 = (defpackage.c1a) r0
            r5.add(r0)
        L_0x01ff:
            boolean r0 = r8.F()
            if (r0 == 0) goto L_0x0210
            ii5 r0 = r9.J
            r6 = 128(0x80, float:1.794E-43)
            boolean r0 = r0.b(r6)
            if (r0 == 0) goto L_0x0210
            goto L_0x0226
        L_0x0210:
            t97 r0 = r4.d
            java.lang.Object r0 = r0.getValue()
            c1a r0 = (defpackage.c1a) r0
            r5.add(r0)
            t97 r0 = r4.h
            java.lang.Object r0 = r0.getValue()
            c1a r0 = (defpackage.c1a) r0
            r5.add(r0)
        L_0x0226:
            lg7 r0 = hwf.a(r5)
            goto L_0x023e
        L_0x022b:
            lg7 r4 = hwf.c()
            if (r23 == 0) goto L_0x023a
            java.lang.Object r0 = r0.getValue()
            c1a r0 = (defpackage.c1a) r0
            r4.add(r0)
        L_0x023a:
            lg7 r0 = hwf.a(r4)
        L_0x023e:
            lg7 r4 = hwf.c()
            boolean r5 = r3.isEmpty()
            r5 = r5 ^ r15
            if (r5 != 0) goto L_0x0250
            boolean r5 = r0.isEmpty()
            r5 = r5 ^ r15
            if (r5 == 0) goto L_0x0258
        L_0x0250:
            vbb r5 = new vbb
            r5.<init>(r3, r0, r15)
            r4.add(r5)
        L_0x0258:
            r4.addAll(r1)
            lg7 r0 = hwf.a(r4)
            g5b r1 = new g5b
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp0.E(tf3):g5b");
    }

    public final i22 F() {
        return ((aw2) ((bv2) this.g.getValue())).q(this.a);
    }

    public final void d() {
        qg4 qg4 = this.l;
        qg4.b.f(qg4);
    }

    public final String h() {
        tf3 tf3 = (tf3) ((ap3) this.f.getValue()).c(this.a).a.getValue();
        if (tf3 != null) {
            return tf3.g();
        }
        return null;
    }

    public final Long i() {
        i22 F = F();
        if (F != null) {
            return Long.valueOf(F.a);
        }
        return null;
    }

    public final Long j() {
        i22 F = F();
        if (F != null) {
            return Long.valueOf(F.b.a);
        }
        return null;
    }

    public final int k() {
        return 2;
    }

    public final r6b l() {
        return r6b.CONTACT;
    }

    public final Object n(Continuation continuation) {
        return ((aw2) ((bv2) this.g.getValue())).u(this.a, continuation);
    }

    public final a34 x() {
        y76 y76 = r6b.b;
        kdb.c.getClass();
        return new a34(":profile/avatars?id=" + this.a + "&type=contact");
    }
}
