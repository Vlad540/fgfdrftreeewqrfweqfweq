package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q2e  reason: default package */
public final class q2e {
    public final p2e a;
    public final List b;

    public q2e(p2e p2e, ArrayList arrayList) {
        this.a = p2e;
        this.b = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.q2e) r5;
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
            boolean r1 = r5 instanceof defpackage.q2e
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            q2e r5 = (defpackage.q2e) r5
            p2e r1 = r5.a
            p2e r3 = r4.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q2e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionSearchResult(state=");
        sb.append(this.a);
        sb.append(", mentions=");
        return hr1.i(sb, this.b, ")");
    }
}
