package defpackage;

/* renamed from: jx0  reason: default package */
public final class jx0 implements e7d {
    public final d7d X;
    public final mge Y;
    public final b7d Z;
    public final int a;
    public final mge b;
    public final int c;
    public final long o;
    public final Integer w0;
    public final int x0;
    public final boolean y0;

    public jx0(hge hge, long j, d7d d7d, mge mge, b7d b7d, Integer num, int i, boolean z, int i2) {
        d7d = (i2 & 16) != 0 ? d7d.b : d7d;
        mge = (i2 & 32) != 0 ? null : mge;
        b7d = (i2 & 64) != 0 ? null : b7d;
        i = (i2 & 256) != 0 ? o1a.k0 : i;
        z = (i2 & 512) != 0 ? true : z;
        this.a = 4;
        this.b = hge;
        this.c = 0;
        this.o = j;
        this.X = d7d;
        this.Y = mge;
        this.Z = b7d;
        this.w0 = num;
        this.x0 = i;
        this.y0 = z;
    }

    public final Integer b() {
        return this.w0;
    }

    public final mge c() {
        return this.Y;
    }

    public final v6d d() {
        return null;
    }

    public final mge e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.jx0) r8;
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
            boolean r1 = r8 instanceof defpackage.jx0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jx0 r8 = (defpackage.jx0) r8
            int r1 = r8.a
            int r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            mge r1 = r7.b
            mge r3 = r8.b
            boolean r1 = defpackage.hhd.f(r1, r3)
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
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0040
            return r2
        L_0x0040:
            b7d r1 = r7.Z
            b7d r3 = r8.Z
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x004b
            return r2
        L_0x004b:
            java.lang.Integer r1 = r7.w0
            java.lang.Integer r3 = r8.w0
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0056
            return r2
        L_0x0056:
            int r1 = r7.x0
            int r3 = r8.x0
            if (r1 == r3) goto L_0x005d
            return r2
        L_0x005d:
            boolean r7 = r7.y0
            boolean r8 = r8.y0
            if (r7 == r8) goto L_0x0064
            return r2
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx0.equals(java.lang.Object):boolean");
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
        int hashCode3 = (hashCode2 + (b7d == null ? 0 : b7d.hashCode())) * 31;
        Integer num = this.w0;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.y0) + c3d.d(this.x0, (hashCode3 + i) * 31, 31);
    }

    public final int l() {
        return this.x0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(sectionItemType=");
        sb.append(m4b.m(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.o);
        sb.append(", type=");
        sb.append(this.X);
        sb.append(", descriptionRes=");
        sb.append(this.Y);
        sb.append(", endView=");
        sb.append(this.Z);
        sb.append(", startIconRes=");
        sb.append(this.w0);
        sb.append(", viewType=");
        sb.append(this.x0);
        sb.append(", isAvailable=");
        return hr1.j(sb, this.y0, ")");
    }

    public final int u() {
        return this.c;
    }
}
