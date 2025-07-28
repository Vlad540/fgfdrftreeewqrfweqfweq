package defpackage;

import android.os.Bundle;

/* renamed from: f65  reason: default package */
public final class f65 implements z24 {
    public static final f65 a = new Object();
    public static final g65 b = g65.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        g65.b.getClass();
        if (c34.equals(g65.c)) {
            return new j34(str, c34, bundle, 0, (h34) null, new q62(bundle, 2), 24);
        }
        throw new IllegalStateException(hr1.f("unknown screen ", c34));
    }
}
