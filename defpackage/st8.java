package defpackage;

/* renamed from: st8  reason: default package */
public final class st8 {
    public final boolean a;
    public final CharSequence b;

    public st8(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.st8) r5;
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
            boolean r1 = r5 instanceof defpackage.st8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            st8 r5 = (defpackage.st8) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.CharSequence r4 = r4.b
            java.lang.CharSequence r5 = r5.b
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "MiniAppData(isVisible=" + this.a + ", title=" + this.b + ")";
    }
}
