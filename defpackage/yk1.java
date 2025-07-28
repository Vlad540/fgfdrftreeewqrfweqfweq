package defpackage;

/* renamed from: yk1  reason: default package */
public final class yk1 {
    public static final yk1 d = new yk1(2, (CharSequence) null, (CharSequence) null);
    public final int a;
    public final CharSequence b;
    public final CharSequence c;

    public yk1(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.yk1) r5;
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
            boolean r1 = r5 instanceof defpackage.yk1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            yk1 r5 = (defpackage.yk1) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.CharSequence r1 = r4.b
            java.lang.CharSequence r3 = r5.b
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.CharSequence r4 = r4.c
            java.lang.CharSequence r5 = r5.c
            boolean r4 = defpackage.hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int t = hr1.t(this.a) * 31;
        int i = 0;
        CharSequence charSequence = this.b;
        int hashCode = (t + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallTimeData(place=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? "null" : "SPEAKER" : "HEADER");
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
