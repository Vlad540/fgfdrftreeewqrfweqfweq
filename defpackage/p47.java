package defpackage;

import android.os.Bundle;

/* renamed from: p47  reason: default package */
public final class p47 implements z24 {
    public static final p47 a = new Object();
    public static final q47 b = q47.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        h34 h34 = new h34(new fs5(25), new fs5(26));
        q47.b.getClass();
        if (c34.equals(q47.c)) {
            return new j34(str, c34, bundle, 0, h34, new q62(bundle, 5), 8);
        }
        throw new IllegalStateException(hr1.f("unknown screen ", c34));
    }
}
