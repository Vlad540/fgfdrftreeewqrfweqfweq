package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: js2  reason: default package */
public final class js2 {
    public static final js2 f = new js2(is2.c, BuildConfig.FLAVOR, dp6.d, hw4.a, true);
    public final is2 a;
    public final String b;
    public final dp6 c;
    public final List d;
    public final boolean e;

    public js2(is2 is2, String str, dp6 dp6, List list, boolean z) {
        this.a = is2;
        this.b = str;
        this.c = dp6;
        this.d = list;
        this.e = z;
    }

    public static js2 a(js2 js2, is2 is2, dp6 dp6, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            is2 = js2.a;
        }
        is2 is22 = is2;
        String str = js2.b;
        if ((i & 4) != 0) {
            dp6 = js2.c;
        }
        dp6 dp62 = dp6;
        List list = arrayList;
        if ((i & 8) != 0) {
            list = js2.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = js2.e;
        }
        js2.getClass();
        return new js2(is22, str, dp62, list2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.js2) r5;
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
            boolean r1 = r5 instanceof defpackage.js2
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            js2 r5 = (defpackage.js2) r5
            is2 r1 = r5.a
            is2 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            dp6 r1 = r4.c
            dp6 r3 = r5.c
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.util.List r1 = r4.d
            java.util.List r3 = r5.d
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0034
            return r2
        L_0x0034:
            boolean r4 = r4.e
            boolean r5 = r5.e
            if (r4 == r5) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = me4.d(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(this.e) + c3d.f(this.d, (this.c.hashCode() + d2) * 31, 31);
    }

    public final String toString() {
        if (this == f) {
            return js2.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("ChatsListSearchState(type=");
        sb.append(this.a);
        sb.append(", searchQuery='");
        sb.append(h2g.s(this.b));
        sb.append("', idleSearchData=");
        sb.append(this.c);
        sb.append(", searchResult=");
        sb.append(o23.c0(this.d, ",", "[", "]", new hd1(25), 24));
        sb.append(", scrollToTop=");
        return hr1.j(sb, this.e, ")");
    }
}
