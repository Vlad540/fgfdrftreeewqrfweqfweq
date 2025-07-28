package defpackage;

import android.os.Bundle;

/* renamed from: jq  reason: default package */
public final class jq implements z24 {
    public static final jq a = new Object();
    public static final kq b = kq.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        if (c34.equals(kq.c)) {
            return new j34(str, c34, bundle, 1, (h34) null, new i(2), 16);
        }
        throw new IllegalStateException(hr1.f("Unknown route=", c34));
    }
}
