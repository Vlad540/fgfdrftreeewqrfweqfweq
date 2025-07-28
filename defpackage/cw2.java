package defpackage;

import android.os.Bundle;

/* renamed from: cw2  reason: default package */
public final class cw2 implements z24 {
    public static final cw2 a = new Object();
    public static final dw2 b = dw2.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        h34 h34 = new h34(new hk2(12), new hk2(13));
        if (c34.equals(dw2.c)) {
            return new j34(str, c34, bundle, 1, h34, new i(8));
        }
        throw new IllegalStateException(hr1.f("invalid route ", c34));
    }
}
