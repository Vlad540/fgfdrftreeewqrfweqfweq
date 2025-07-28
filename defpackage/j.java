package defpackage;

import android.os.Bundle;

/* renamed from: j  reason: default package */
public final class j implements z24 {
    public static final j a = new Object();
    public static final k b = k.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        if (c34.equals(k.c)) {
            return new j34(str, c34, bundle, 1, (h34) null, new i(0), 16);
        }
        throw new IllegalStateException(hr1.f("Unknown route=", c34));
    }
}
