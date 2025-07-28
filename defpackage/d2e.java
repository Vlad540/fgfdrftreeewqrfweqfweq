package defpackage;

/* renamed from: d2e  reason: default package */
public final class d2e {
    public static final a2e Companion = new Object();
    public static final l77[] c = {c2e.Companion.serializer(), null};
    public final c2e a;
    public final String b;

    public /* synthetic */ d2e(int i, c2e c2e, String str) {
        if (1 == (i & 1)) {
            this.a = c2e;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        } else {
            bm3.I(i, 1, z1e.a.d());
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.d2e) r5;
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
            boolean r1 = r5 instanceof defpackage.d2e
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            d2e r5 = (defpackage.d2e) r5
            c2e r1 = r5.a
            c2e r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResponse(status=");
        sb.append(this.a);
        sb.append(", requestId=");
        return wn6.l(sb, this.b, ")");
    }

    public d2e(c2e c2e, String str) {
        this.a = c2e;
        this.b = str;
    }
}
