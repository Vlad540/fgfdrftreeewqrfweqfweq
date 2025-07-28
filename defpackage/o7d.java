package defpackage;

/* renamed from: o7d  reason: default package */
public final class o7d implements e7d {
    public final mge X;
    public final Integer Y;
    public final b7d Z;
    public final long a;
    public final int b;
    public final mge c;
    public final d7d o;
    public final v6d w0;
    public final mge x0;
    public final int y0;
    public final r6d z0;

    public o7d(long j, int i, mge mge, d7d d7d, mge mge2, Integer num, b7d b7d, v6d v6d, mge mge3, int i2, r6d r6d) {
        this.a = j;
        this.b = i;
        this.c = mge;
        this.o = d7d;
        this.X = mge2;
        this.Y = num;
        this.Z = b7d;
        this.w0 = v6d;
        this.x0 = mge3;
        this.y0 = i2;
        this.z0 = r6d;
    }

    public static o7d k(o7d o7d, mge mge, x6d x6d, int i) {
        o7d o7d2 = o7d;
        long j = o7d2.a;
        int i2 = o7d2.b;
        mge mge2 = (i & 4) != 0 ? o7d2.c : mge;
        d7d d7d = o7d2.o;
        mge mge3 = o7d2.X;
        Integer num = o7d2.Y;
        b7d b7d = (i & 64) != 0 ? o7d2.Z : x6d;
        v6d v6d = o7d2.w0;
        mge mge4 = o7d2.x0;
        int i3 = o7d2.y0;
        r6d r6d = o7d2.z0;
        o7d.getClass();
        return new o7d(j, i2, mge2, d7d, mge3, num, b7d, v6d, mge4, i3, r6d);
    }

    public final Integer b() {
        return this.Y;
    }

    public final mge c() {
        return this.X;
    }

    public final v6d d() {
        return this.w0;
    }

    public final mge e() {
        return this.x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7d)) {
            return false;
        }
        o7d o7d = (o7d) obj;
        return this.a == o7d.a && this.b == o7d.b && hhd.f(this.c, o7d.c) && this.o == o7d.o && hhd.f(this.X, o7d.X) && hhd.f(this.Y, o7d.Y) && hhd.f(this.Z, o7d.Z) && hhd.f(this.w0, o7d.w0) && hhd.f(this.x0, o7d.x0) && this.y0 == o7d.y0 && hhd.f(this.z0, o7d.z0);
    }

    public final b7d f() {
        return this.Z;
    }

    public final long getItemId() {
        return this.a;
    }

    public final mge getTitle() {
        return this.c;
    }

    public final d7d getType() {
        return this.o;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.o.hashCode() + c3d.e(c3d.d(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c)) * 31;
        int i2 = 0;
        mge mge = this.X;
        int hashCode2 = (hashCode + (mge == null ? 0 : mge.hashCode())) * 31;
        Integer num = this.Y;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        b7d b7d = this.Z;
        int hashCode4 = (hashCode3 + (b7d == null ? 0 : b7d.hashCode())) * 31;
        v6d v6d = this.w0;
        if (v6d == null) {
            i = 0;
        } else {
            v6d.getClass();
            i = 92926410;
        }
        int i3 = (hashCode4 + i) * 31;
        mge mge2 = this.x0;
        int d = c3d.d(this.y0, (i3 + (mge2 == null ? 0 : mge2.hashCode())) * 31, 31);
        r6d r6d = this.z0;
        if (r6d != null) {
            i2 = r6d.hashCode();
        }
        return d + i2;
    }

    public final int q() {
        return this.y0;
    }

    public final r6d s() {
        return this.z0;
    }

    public final String toString() {
        return "SettingsItemModel(itemId=" + this.a + ", sectionId=" + this.b + ", title=" + this.c + ", type=" + this.o + ", descriptionRes=" + this.X + ", startIconRes=" + this.Y + ", endView=" + this.Z + ", counterType=" + this.w0 + ", upperText=" + this.x0 + ", startIconPadding=" + this.y0 + ", avatarParams=" + this.z0 + ")";
    }

    public final int u() {
        return this.b;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o7d(long r16, int r18, defpackage.mge r19, defpackage.d7d r20, defpackage.mge r21, java.lang.Integer r22, defpackage.b7d r23, defpackage.u6d r24, defpackage.mge r25, int r26, defpackage.r6d r27, int r28) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000a
            d7d r1 = defpackage.d7d.b
            r7 = r1
            goto L_0x000c
        L_0x000a:
            r7 = r20
        L_0x000c:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r8 = r2
            goto L_0x0015
        L_0x0013:
            r8 = r21
        L_0x0015:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r9 = r2
            goto L_0x001d
        L_0x001b:
            r9 = r22
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            r10 = r2
            goto L_0x0025
        L_0x0023:
            r10 = r23
        L_0x0025:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002b
            r11 = r2
            goto L_0x002d
        L_0x002b:
            r11 = r24
        L_0x002d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0033
            r12 = r2
            goto L_0x0035
        L_0x0033:
            r12 = r25
        L_0x0035:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004d
            r1 = 8
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = a24.X(r1)
            r13 = r1
            goto L_0x004f
        L_0x004d:
            r13 = r26
        L_0x004f:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            r14 = r2
            goto L_0x0057
        L_0x0055:
            r14 = r27
        L_0x0057:
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7d.<init>(long, int, mge, d7d, mge, java.lang.Integer, b7d, u6d, mge, int, r6d, int):void");
    }
}
