package defpackage;

/* renamed from: ktd  reason: default package */
public final class ktd implements pg7 {
    public static final ktd D0 = new ktd(0, 0, 0, (String) null, (String) null, (String) null, 0, 0, false, false, 0, 8190);
    public final boolean A0;
    public final long B0;
    public final int C0;
    public final String X;
    public final String Y;
    public final int Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final int w0;
    public final int x0;
    public final boolean y0;
    public final boolean z0;

    public ktd(long j, long j2, long j3, String str, String str2, String str3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, long j4) {
        int i4;
        String str4 = str2;
        String str5 = str3;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str4;
        this.Y = str5;
        this.Z = i;
        this.w0 = i2;
        this.x0 = i3;
        this.y0 = z;
        this.z0 = z2;
        this.A0 = z3;
        this.B0 = j4;
        if (str5 != null && str3.length() != 0) {
            i4 = gaa.j;
        } else if (str4 == null || str2.length() == 0) {
            i4 = gaa.h;
        } else {
            i4 = gaa.i;
        }
        this.C0 = i4;
    }

    public static ktd k(ktd ktd, boolean z, boolean z2, int i) {
        ktd ktd2 = ktd;
        int i2 = i;
        boolean z3 = (i2 & 1024) != 0 ? ktd2.z0 : z;
        ktd ktd3 = r3;
        ktd ktd4 = new ktd(ktd2.a, ktd2.b, ktd2.c, ktd2.o, ktd2.X, ktd2.Y, ktd2.Z, ktd2.w0, ktd2.x0, ktd2.y0, z3, (i2 & 2048) != 0 ? ktd2.A0 : z2, ktd2.B0);
        return ktd3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktd)) {
            return false;
        }
        ktd ktd = (ktd) obj;
        return this.a == ktd.a && this.b == ktd.b && this.c == ktd.c && hhd.f(this.o, ktd.o) && hhd.f(this.X, ktd.X) && hhd.f(this.Y, ktd.Y) && this.Z == ktd.Z && this.w0 == ktd.w0 && this.x0 == ktd.x0 && this.y0 == ktd.y0 && this.z0 == ktd.z0 && this.A0 == ktd.A0 && this.B0 == ktd.B0;
    }

    public final boolean g(pg7 pg7) {
        return this.B0 == pg7.getItemId();
    }

    public final long getItemId() {
        return this.B0;
    }

    public final int hashCode() {
        int m = sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.o;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.X;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.Y;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Long.hashCode(this.B0) + th2.f(th2.f(th2.f(c3d.d(this.x0, c3d.d(this.w0, c3d.d(this.Z, (hashCode2 + i) * 31, 31), 31), 31), 31, this.y0), 31, this.z0), 31, this.A0);
    }

    public final int l() {
        return this.C0;
    }

    public final Object n(Object obj) {
        boolean z;
        pg7 pg7 = (pg7) obj;
        if ((pg7 instanceof ktd) && this.A0 != (z = ((ktd) pg7).A0)) {
            return new jtd(z);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerModel(id=");
        sb.append(this.a);
        sb.append(", setId=");
        sb.append(this.b);
        sb.append(", originalSetId=");
        sb.append(this.c);
        sb.append(", previewUrl=");
        sb.append(this.o);
        sb.append(", lottieUrl=");
        sb.append(this.X);
        sb.append(", videoUrl=");
        sb.append(this.Y);
        sb.append(", markerType=");
        sb.append(this.Z);
        sb.append(", width=");
        sb.append(this.w0);
        sb.append(", height=");
        sb.append(this.x0);
        sb.append(", external=");
        sb.append(this.y0);
        sb.append(", favorite=");
        sb.append(this.z0);
        sb.append(", selected=");
        sb.append(this.A0);
        sb.append(", itemId=");
        return wn6.k(sb, this.B0, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ktd(long r23, long r25, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, int r33, boolean r34, boolean r35, long r36, int r38) {
        /*
            r22 = this;
            r0 = r38
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r7 = r2
            goto L_0x000c
        L_0x000a:
            r7 = r25
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0012
            r9 = r2
            goto L_0x0014
        L_0x0012:
            r9 = r27
        L_0x0014:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x001b
            r11 = r2
            goto L_0x001d
        L_0x001b:
            r11 = r29
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r12 = r2
            goto L_0x0025
        L_0x0023:
            r12 = r30
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r13 = r2
            goto L_0x002d
        L_0x002b:
            r13 = r31
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0034
            r15 = r2
            goto L_0x0036
        L_0x0034:
            r15 = r32
        L_0x0036:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003d
            r16 = r2
            goto L_0x003f
        L_0x003d:
            r16 = r33
        L_0x003f:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0046
            r18 = r2
            goto L_0x0048
        L_0x0046:
            r18 = r34
        L_0x0048:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x004f
            r19 = r2
            goto L_0x0051
        L_0x004f:
            r19 = r35
        L_0x0051:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0058
            r20 = r23
            goto L_0x005a
        L_0x0058:
            r20 = r36
        L_0x005a:
            r14 = 0
            r17 = 0
            r4 = r22
            r5 = r23
            r4.<init>(r5, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktd.<init>(long, long, long, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, boolean, long, int):void");
    }
}
