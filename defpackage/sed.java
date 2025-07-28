package defpackage;

import java.util.List;

/* renamed from: sed  reason: default package */
public final class sed {
    public static final sed c = new sed(red.a, hw4.a);
    public final red a;
    public final List b;

    public sed(red red, List list) {
        this.a = red;
        this.b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.sed) r5;
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
            boolean r1 = r5 instanceof defpackage.sed
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            sed r5 = (defpackage.sed) r5
            red r1 = r5.a
            red r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.util.List r4 = r4.b
            java.util.List r5 = r5.b
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sed.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowcaseState(state=");
        sb.append(this.a);
        sb.append(", content=");
        return hr1.i(sb, this.b, ")");
    }
}
