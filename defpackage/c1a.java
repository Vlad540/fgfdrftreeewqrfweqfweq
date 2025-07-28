package defpackage;

/* renamed from: c1a  reason: default package */
public final class c1a {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final boolean f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1a(int i, Integer num, Integer num2, Integer num3, Integer num4, int i2) {
        this(i, num, (i2 & 4) != 0 ? null : num2, num3, (i2 & 16) != 0 ? null : num4, true);
    }

    public static c1a a(c1a c1a, boolean z) {
        return new c1a(c1a.a, c1a.b, c1a.c, c1a.d, c1a.e, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.c1a) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.c1a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            c1a r5 = (defpackage.c1a) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.Integer r1 = r4.b
            java.lang.Integer r3 = r5.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.Integer r1 = r4.c
            java.lang.Integer r3 = r5.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.lang.Integer r1 = r4.d
            java.lang.Integer r3 = r5.d
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            java.lang.Integer r1 = r4.e
            java.lang.Integer r3 = r5.e
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x003f
            return r2
        L_0x003f:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L_0x0046
            return r2
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        int i = 0;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return Boolean.hashCode(this.f) + ((hashCode4 + i) * 31);
    }

    public final String toString() {
        return "ButtonData(id=" + this.a + ", textRes=" + this.b + ", textColor=" + this.c + ", iconRes=" + this.d + ", iconColor=" + this.e + ", isEnabled=" + this.f + ")";
    }

    public c1a(int i, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = z;
    }
}
