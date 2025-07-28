package defpackage;

import android.os.Bundle;

/* renamed from: axd  reason: default package */
public final class axd implements z24 {
    public static final axd a = new Object();
    public static final bxd b = bxd.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        g8d q63;
        if (!b.a.contains(c34)) {
            return null;
        }
        Long t0 = x87.t0("set_id", bundle);
        long longValue = t0 != null ? t0.longValue() : -1;
        bxd.b.getClass();
        if (c34.equals(bxd.c)) {
            q63 = new g8d(4);
        } else if (c34.equals(bxd.d)) {
            q63 = new g8d(5);
        } else if (c34.equals(bxd.e)) {
            q63 = new g8d(6);
        } else if (c34.equals(bxd.f)) {
            q63 = new q63(longValue, 10);
        } else {
            throw new IllegalStateException(hr1.f("invalid route ", c34));
        }
        return new j34(str, c34, bundle, 1, (h34) null, q63, 16);
    }
}
