package defpackage;

import java.util.List;

/* renamed from: xrc  reason: default package */
public final class xrc {
    public static final xrc c = new xrc(1, hw4.a);
    public final int a;
    public final List b;

    public xrc(int i, List list) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.xrc) r5;
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
            boolean r1 = r5 instanceof defpackage.xrc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xrc r5 = (defpackage.xrc) r5
            int r1 = r5.a
            int r3 = r4.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xrc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (hr1.t(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(state=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "EMPTY" : "CONTENT" : "LOADING");
        sb.append(", content=");
        return hr1.i(sb, this.b, ")");
    }
}
