package defpackage;

/* renamed from: mv7  reason: default package */
public final class mv7 extends tuf {
    public final boolean l;
    public final tje m;
    public final qje n;
    public iv7 o;
    public gv7 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public mv7(zh0 zh0, boolean z) {
        super(zh0);
        this.l = z && zh0.j();
        this.m = new tje();
        this.n = new qje();
        vje h = zh0.h();
        if (h != null) {
            this.o = new iv7(h, (Object) null, (Object) null);
            this.s = true;
            return;
        }
        this.o = new iv7(new kv7(zh0.i()), tje.q, iv7.h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(defpackage.vje r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            if (r0 == 0) goto L_0x001c
            iv7 r0 = r14.o
            iv7 r1 = new iv7
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            r14.o = r1
            gv7 r15 = r14.p
            if (r15 == 0) goto L_0x00bf
            long r0 = r15.Z
            r14.D(r0)
            goto L_0x00bf
        L_0x001c:
            boolean r0 = r15.q()
            if (r0 == 0) goto L_0x0040
            boolean r0 = r14.s
            if (r0 == 0) goto L_0x0032
            iv7 r0 = r14.o
            iv7 r1 = new iv7
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            goto L_0x003c
        L_0x0032:
            java.lang.Object r0 = defpackage.tje.q
            java.lang.Object r1 = defpackage.iv7.h
            iv7 r2 = new iv7
            r2.<init>(r15, r0, r1)
            r1 = r2
        L_0x003c:
            r14.o = r1
            goto L_0x00bf
        L_0x0040:
            r0 = 0
            tje r1 = r14.m
            r15.o(r0, r1)
            long r2 = r1.l
            java.lang.Object r4 = r1.a
            gv7 r5 = r14.p
            if (r5 == 0) goto L_0x006d
            iv7 r6 = r14.o
            se8 r7 = r5.a
            java.lang.Object r7 = r7.a
            qje r8 = r14.n
            r6.h(r7, r8)
            long r6 = r8.e
            long r8 = r5.b
            long r6 = r6 + r8
            iv7 r5 = r14.o
            r8 = 0
            r5.n(r0, r1, r8)
            long r0 = r1.l
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            r12 = r6
            goto L_0x006e
        L_0x006d:
            r12 = r2
        L_0x006e:
            r11 = 0
            tje r9 = r14.m
            qje r10 = r14.n
            r8 = r15
            android.util.Pair r0 = r8.j(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.s
            if (r0 == 0) goto L_0x0092
            iv7 r0 = r14.o
            iv7 r1 = new iv7
            java.lang.Object r4 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r4, r0)
            goto L_0x0098
        L_0x0092:
            iv7 r0 = new iv7
            r0.<init>(r15, r4, r1)
            r1 = r0
        L_0x0098:
            r14.o = r1
            gv7 r15 = r14.p
            if (r15 == 0) goto L_0x00bf
            boolean r0 = r14.D(r2)
            if (r0 == 0) goto L_0x00bf
            se8 r15 = r15.a
            java.lang.Object r0 = r15.a
            iv7 r1 = r14.o
            java.lang.Object r1 = r1.g
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = defpackage.iv7.h
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00ba
            iv7 r0 = r14.o
            java.lang.Object r0 = r0.g
        L_0x00ba:
            se8 r15 = r15.a(r0)
            goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            r0 = 1
            r14.s = r0
            r14.r = r0
            iv7 r0 = r14.o
            r14.n(r0)
            if (r15 == 0) goto L_0x00d4
            gv7 r14 = r14.p
            r14.getClass()
            r14.a(r15)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv7.A(vje):void");
    }

    public final void B() {
        if (!this.l) {
            this.q = true;
            y((Object) null, this.k);
        }
    }

    /* renamed from: C */
    public final gv7 c(se8 se8, l34 l34, long j) {
        gv7 gv7 = new gv7(se8, l34, j);
        oyb.k(gv7.o == null);
        zh0 zh0 = this.k;
        gv7.o = zh0;
        if (this.r) {
            Object obj = this.o.g;
            Object obj2 = se8.a;
            if (obj != null && obj2.equals(iv7.h)) {
                obj2 = this.o.g;
            }
            gv7.a(se8.a(obj2));
        } else {
            this.p = gv7;
            if (!this.q) {
                this.q = true;
                y((Object) null, zh0);
            }
        }
        return gv7;
    }

    public final boolean D(long j) {
        gv7 gv7 = this.p;
        int b = this.o.b(gv7.a.a);
        if (b == -1) {
            return false;
        }
        iv7 iv7 = this.o;
        qje qje = this.n;
        iv7.g(b, qje, false);
        long j2 = qje.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        gv7.Z = j;
        return true;
    }

    public final boolean a(l68 l68) {
        return this.k.a(l68);
    }

    public final void k() {
    }

    public final void o(s88 s88) {
        ((gv7) s88).d();
        if (s88 == this.p) {
            this.p = null;
        }
    }

    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    public final void t(l68 l68) {
        if (this.s) {
            iv7 iv7 = this.o;
            this.o = new iv7(new sza(this.o.e, l68), iv7.f, iv7.g);
        } else {
            this.o = new iv7(new kv7(l68), tje.q, iv7.h);
        }
        this.k.t(l68);
    }

    public final se8 z(se8 se8) {
        Object obj = se8.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = iv7.h;
        }
        return se8.a(obj);
    }
}
