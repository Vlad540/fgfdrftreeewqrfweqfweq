package defpackage;

/* renamed from: zw3  reason: default package */
public final class zw3 {
    public static final zw3 k = new zw3((ete) null, (String) null, (String) null, false, false, (b65) null, 1022);
    public final ete a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final o3b i;
    public final b65 j;

    public zw3(ete ete, long j2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, o3b o3b, b65 b65) {
        this.a = ete;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = o3b;
        this.j = b65;
    }

    public static zw3 a(zw3 zw3, ete ete, long j2, String str, String str2, boolean z, boolean z2, boolean z3, o3b o3b, b65 b65, int i2) {
        zw3 zw32 = zw3;
        int i3 = i2;
        ete ete2 = (i3 & 1) != 0 ? zw32.a : ete;
        long j3 = (i3 & 2) != 0 ? zw32.b : j2;
        String str3 = (i3 & 4) != 0 ? zw32.c : str;
        String str4 = (i3 & 8) != 0 ? zw32.d : str2;
        boolean z4 = (i3 & 16) != 0 ? zw32.e : z;
        boolean z5 = (i3 & 32) != 0 ? zw32.f : z2;
        boolean z6 = zw32.g;
        boolean z7 = (i3 & 128) != 0 ? zw32.h : z3;
        o3b o3b2 = (i3 & 256) != 0 ? zw32.i : o3b;
        b65 b652 = (i3 & 512) != 0 ? zw32.j : b65;
        zw3.getClass();
        return new zw3(ete2, j3, str3, str4, z4, z5, z6, z7, o3b2, b652);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw3)) {
            return false;
        }
        zw3 zw3 = (zw3) obj;
        return hhd.f(this.a, zw3.a) && this.b == zw3.b && hhd.f(this.c, zw3.c) && hhd.f(this.d, zw3.d) && this.e == zw3.e && this.f == zw3.f && this.g == zw3.g && this.h == zw3.h && hhd.f(this.i, zw3.i) && hhd.f(this.j, zw3.j);
    }

    public final int hashCode() {
        int i2 = 0;
        ete ete = this.a;
        int m = sxe.m((ete == null ? 0 : ete.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int f2 = th2.f(th2.f(th2.f(th2.f((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        o3b o3b = this.i;
        if (o3b != null) {
            i2 = o3b.hashCode();
        }
        return this.j.hashCode() + ((f2 + i2) * 31);
    }

    public final String toString() {
        return "CurrentCallInfo(target=" + this.a + ", startedAt=" + this.b + ", conversationId=" + this.c + ", joinLink=" + this.d + ", hasOpponentsOnce=" + this.e + ", isConnectedOnce=" + this.f + ", isIncoming=" + this.g + ", isGroupCall=" + this.h + ", previousCallState=" + this.i + ", state=" + this.j + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ zw3(defpackage.ete r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, defpackage.b65 r19, int r20) {
        /*
            r13 = this;
            r0 = r20
            long r2 = java.lang.System.currentTimeMillis()
            r1 = r0 & 4
            r4 = 0
            if (r1 == 0) goto L_0x000d
            r5 = r4
            goto L_0x000e
        L_0x000d:
            r5 = r15
        L_0x000e:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0014
            r6 = r4
            goto L_0x0016
        L_0x0014:
            r6 = r16
        L_0x0016:
            r1 = r0 & 64
            r4 = 0
            if (r1 == 0) goto L_0x001d
            r8 = r4
            goto L_0x001f
        L_0x001d:
            r8 = r17
        L_0x001f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0025
            r9 = r4
            goto L_0x0027
        L_0x0025:
            r9 = r18
        L_0x0027:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x002f
            w55 r0 = defpackage.w55.b
            r11 = r0
            goto L_0x0031
        L_0x002f:
            r11 = r19
        L_0x0031:
            r7 = 0
            r10 = 0
            r12 = 0
            r0 = r13
            r1 = r14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r10 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw3.<init>(ete, java.lang.String, java.lang.String, boolean, boolean, b65, int):void");
    }
}
