package defpackage;

import android.os.Bundle;

/* renamed from: kxd  reason: default package */
public final class kxd implements z24 {
    public static final kxd a = new Object();
    public static final lxd b = lxd.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        lxd.b.getClass();
        if (c34.equals(lxd.c)) {
            return new j34(str, c34, bundle, 1, (h34) null, new q62(bundle, 10), 16);
        }
        throw new IllegalStateException(hr1.f("invalid route ", c34));
    }
}
