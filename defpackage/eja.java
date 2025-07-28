package defpackage;

/* renamed from: eja  reason: default package */
public final class eja {
    public static final eja e = new eja((uld) null, (Long) null, 15);
    public final vwa a;
    public final int b;
    public final uld c;
    public final Long d;

    public eja(vwa vwa, int i, uld uld, Long l) {
        this.a = vwa;
        this.b = i;
        this.c = uld;
        this.d = l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.eja) r5;
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
            boolean r1 = r5 instanceof defpackage.eja
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            eja r5 = (defpackage.eja) r5
            vwa r1 = r5.a
            vwa r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            uld r1 = r4.c
            uld r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.Long r4 = r4.d
            java.lang.Long r5 = r5.d
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        vwa vwa = this.a;
        int hashCode = (vwa == null ? 0 : vwa.hashCode()) * 31;
        int i2 = this.b;
        int t = (hashCode + (i2 == 0 ? 0 : hr1.t(i2))) * 31;
        uld uld = this.c;
        int hashCode2 = (t + (uld == null ? 0 : uld.hashCode())) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(pipType=");
        sb.append(this.a);
        sb.append(", navReason=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PIP_CLOSE" : "FOLDER_CHANGE" : "LINK" : "PUSH_NOTIFICATION");
        sb.append(", sourceType=");
        sb.append(this.c);
        sb.append(", sourceId=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eja(uld uld, Long l, int i) {
        this((vwa) null, 0, (i & 4) != 0 ? null : uld, (i & 8) != 0 ? null : l);
    }
}
