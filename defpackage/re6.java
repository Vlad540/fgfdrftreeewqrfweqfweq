package defpackage;

/* renamed from: re6  reason: default package */
public final class re6 {
    public static final uu0 d = s59.l(":");
    public static final uu0 e = s59.l(":status");
    public static final uu0 f = s59.l(":method");
    public static final uu0 g = s59.l(":path");
    public static final uu0 h = s59.l(":scheme");
    public static final uu0 i = s59.l(":authority");
    public final int a;
    public final uu0 b;
    public final uu0 c;

    public re6(uu0 uu0, uu0 uu02) {
        this.b = uu0;
        this.c = uu02;
        this.a = uu02.c() + uu0.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re6)) {
            return false;
        }
        re6 re6 = (re6) obj;
        return hhd.f(this.b, re6.b) && hhd.f(this.c, re6.c);
    }

    public final int hashCode() {
        int i2 = 0;
        uu0 uu0 = this.b;
        int hashCode = (uu0 != null ? uu0.hashCode() : 0) * 31;
        uu0 uu02 = this.c;
        if (uu02 != null) {
            i2 = uu02.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return this.b.j() + ": " + this.c.j();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public re6(defpackage.uu0 r3, java.lang.String r4) {
        /*
            r2 = this;
            uu0 r0 = new uu0
            java.nio.charset.Charset r1 = defpackage.e22.a
            byte[] r1 = r4.getBytes(r1)
            r0.<init>(r1)
            r0.b = r4
            r2.<init>((defpackage.uu0) r3, (defpackage.uu0) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re6.<init>(uu0, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public re6(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            uu0 r0 = new uu0
            java.nio.charset.Charset r1 = defpackage.e22.a
            byte[] r1 = r3.getBytes(r1)
            r0.<init>(r1)
            r0.b = r3
            uu0 r3 = new uu0
            java.nio.charset.Charset r1 = defpackage.e22.a
            byte[] r1 = r4.getBytes(r1)
            r3.<init>(r1)
            r3.b = r4
            r2.<init>((defpackage.uu0) r0, (defpackage.uu0) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re6.<init>(java.lang.String, java.lang.String):void");
    }
}
