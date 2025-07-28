package defpackage;

import java.util.List;

/* renamed from: hx1  reason: default package */
public final class hx1 implements jx1 {
    public final String X;
    public final String Y;
    public final mge Z;
    public final int a;
    public final List b;
    public final boolean c;
    public final jt4 o;
    public final int w0;
    public final boolean x0;
    public final long y0;
    public final int z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hx1(int r13, java.util.List r14, boolean r15, defpackage.jt4 r16, java.lang.String r17, java.lang.String r18, lge r19, long r20, int r22) {
        /*
            r12 = this;
            r4 = r16
            r0 = r22 & 16
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r5 = r1
            goto L_0x000b
        L_0x0009:
            r5 = r17
        L_0x000b:
            r0 = r22 & 32
            if (r0 == 0) goto L_0x0011
            r6 = r1
            goto L_0x0013
        L_0x0011:
            r6 = r18
        L_0x0013:
            r0 = r22 & 64
            if (r0 == 0) goto L_0x001b
            mge r0 = r4.b
            r7 = r0
            goto L_0x001d
        L_0x001b:
            r7 = r19
        L_0x001d:
            int r8 = r4.c
            r9 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx1.<init>(int, java.util.List, boolean, jt4, java.lang.String, java.lang.String, lge, long, int):void");
    }

    public static hx1 k(hx1 hx1, boolean z) {
        return new hx1(hx1.a, hx1.b, z, hx1.o, hx1.X, hx1.Y, hx1.Z, hx1.w0, hx1.x0, hx1.y0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hx1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hx1 hx1 = (hx1) obj;
        if (this.a != hx1.a || this.c != hx1.c || this.o != hx1.o || !hhd.f(this.X, hx1.X) || !hhd.f(this.Y, hx1.Y)) {
            return false;
        }
        if (!hhd.f(this.Z, hx1.Z) || this.w0 != hx1.w0) {
            return false;
        }
        return this.y0 == hx1.y0 && this.z0 == hx1.z0;
    }

    public final long getItemId() {
        return this.y0;
    }

    public final mge getName() {
        return this.Z;
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + th2.f(this.a * 31, 31, this.c)) * 31;
        int i = 0;
        String str = this.X;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Y;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return sxe.m((c3d.e((hashCode2 + i) * 31, 31, this.Z) + this.w0) * 31, 31, this.y0) + this.z0;
    }

    public final int l() {
        return this.z0;
    }

    public final Object n(Object obj) {
        boolean z;
        hx1 hx1 = (pg7) obj;
        if ((hx1 instanceof hx1) && this.c != (z = hx1.c)) {
            return new gx1(z);
        }
        return null;
    }

    public final boolean r() {
        return this.x0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiGroup(groupIndex=");
        sb.append(this.a);
        sb.append(", emojis=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", category=");
        sb.append(this.o);
        sb.append(", iconUrl=");
        sb.append(this.X);
        sb.append(", iconLottieUrl=");
        sb.append(this.Y);
        sb.append(", name=");
        sb.append(this.Z);
        sb.append(", iconRes=");
        sb.append(this.w0);
        sb.append(", clearCategoryAvailable=");
        sb.append(this.x0);
        sb.append(", itemId=");
        return wn6.k(sb, this.y0, ")");
    }

    public hx1(int i, List list, boolean z, jt4 jt4, String str, String str2, mge mge, int i2, boolean z2, long j) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.o = jt4;
        this.X = str;
        this.Y = str2;
        this.Z = mge;
        this.w0 = i2;
        this.x0 = z2;
        this.y0 = j;
        this.z0 = x5a.q;
    }
}
