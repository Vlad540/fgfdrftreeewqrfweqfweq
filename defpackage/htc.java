package defpackage;

/* renamed from: htc  reason: default package */
public final class htc implements itc {
    public final d7d X;
    public final mge Y = null;
    public final b7d Z;
    public final int a;
    public final mge b;
    public final int c;
    public final long o;
    public final int w0;

    public htc(int i, hge hge, int i2, long j, b7d b7d) {
        d7d d7d = d7d.b;
        this.a = i;
        this.b = hge;
        this.c = i2;
        this.o = j;
        this.X = d7d;
        this.Z = b7d;
        this.w0 = saa.D;
    }

    public final int a() {
        return this.a;
    }

    public final mge c() {
        return this.Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.htc) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.htc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            htc r8 = (defpackage.htc) r8
            int r1 = r8.a
            int r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r1 = r7.b
            mge r3 = r8.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            long r3 = r7.o
            long r5 = r8.o
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x002e
            return r2
        L_0x002e:
            d7d r1 = r7.X
            d7d r3 = r8.X
            if (r1 == r3) goto L_0x0035
            return r2
        L_0x0035:
            mge r1 = r7.Y
            mge r3 = r8.Y
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0040
            return r2
        L_0x0040:
            b7d r7 = r7.Z
            b7d r8 = r8.Z
            boolean r7 = hhd.f(r7, r8)
            if (r7 != 0) goto L_0x004b
            return r2
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htc.equals(java.lang.Object):boolean");
    }

    public final b7d f() {
        return this.Z;
    }

    public final long getItemId() {
        return this.o;
    }

    public final mge getTitle() {
        return this.b;
    }

    public final d7d getType() {
        return this.X;
    }

    public final int hashCode() {
        int hashCode = (this.X.hashCode() + sxe.m(c3d.d(this.c, c3d.e(hr1.t(this.a) * 31, 31, this.b), 31), 31, this.o)) * 31;
        int i = 0;
        mge mge = this.Y;
        int hashCode2 = (hashCode + (mge == null ? 0 : mge.hashCode())) * 31;
        b7d b7d = this.Z;
        if (b7d != null) {
            i = b7d.hashCode();
        }
        return hashCode2 + i;
    }

    public final int l() {
        return this.w0;
    }

    public final String toString() {
        return "SettingPrivacyItem(sectionItemType=" + m4b.m(this.a) + ", title=" + this.b + ", sectionId=" + this.c + ", itemId=" + this.o + ", type=" + this.X + ", descriptionRes=" + this.Y + ", endView=" + this.Z + ")";
    }

    public final int u() {
        return this.c;
    }
}
