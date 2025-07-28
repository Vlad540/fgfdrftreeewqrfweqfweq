package defpackage;

/* renamed from: eoc  reason: default package */
public final class eoc {
    public static final eoc d = new eoc(foc.o, (aoc) null, false);
    public final foc a;
    public final aoc b;
    public final boolean c;

    public eoc(foc foc, aoc aoc, boolean z) {
        this.a = foc;
        this.b = aoc;
        this.c = z;
    }

    public static eoc a(eoc eoc, foc foc, aoc aoc, boolean z, int i) {
        if ((i & 1) != 0) {
            foc = eoc.a;
        }
        if ((i & 2) != 0) {
            aoc = eoc.b;
        }
        if ((i & 4) != 0) {
            z = eoc.c;
        }
        eoc.getClass();
        return new eoc(foc, aoc, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.eoc) r5;
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
            boolean r1 = r5 instanceof defpackage.eoc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            eoc r5 = (defpackage.eoc) r5
            foc r1 = r5.a
            foc r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            aoc r1 = r4.b
            aoc r3 = r5.b
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        aoc aoc = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (aoc == null ? 0 : aoc.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenRecordData(state=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", isApproved=");
        return hr1.j(sb, this.c, ")");
    }
}
