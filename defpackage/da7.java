package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: da7  reason: default package */
public final class da7 implements kv0 {
    public final LinkedHashMap a;

    public da7(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ju7.S(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ca7(((Number) entry.getValue()).longValue()));
        }
        this.a = linkedHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = defpackage.o0e.G(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.m68 e(java.lang.String r1) {
        /*
            android.net.Uri r1 = android.net.Uri.parse(r1)
            ns7 r0 = defpackage.m68.a
            r0.getClass()
            java.lang.String r0 = "MediaItemType"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x001c
            java.lang.Integer r1 = defpackage.o0e.G(r1)
            if (r1 == 0) goto L_0x001c
            int r1 = r1.intValue()
            goto L_0x001d
        L_0x001c:
            r1 = -1
        L_0x001d:
            m68 r1 = ns7.c(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da7.e(java.lang.String):m68");
    }

    public final void a(av0 av0, wv0 wv0) {
        ca7 ca7 = (ca7) this.a.get(e(wv0.a));
        if (ca7 != null) {
            ca7.a(av0, wv0);
        }
    }

    public final void b(av0 av0, wv0 wv0) {
        ca7 ca7 = (ca7) this.a.get(e(wv0.a));
        if (ca7 != null) {
            ca7.b(av0, wv0);
        }
    }

    public final void c(av0 av0, String str, long j, long j2) {
        ca7 ca7 = (ca7) this.a.get(e(str));
        if (ca7 != null) {
            ca7.c(av0, str, j, j2);
        }
    }

    public final void d(av0 av0, wv0 wv0, pgd pgd) {
        a(av0, wv0);
        b(av0, pgd);
    }
}
