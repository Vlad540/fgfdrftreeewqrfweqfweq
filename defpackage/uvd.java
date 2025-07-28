package defpackage;

import android.os.Bundle;

/* renamed from: uvd  reason: default package */
public final class uvd implements z24 {
    public static final uvd a = new Object();
    public static final vvd b = vvd.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        vvd.b.getClass();
        if (c34.equals(vvd.c)) {
            return new j34(str, c34, bundle, 1, (h34) null, new q62(bundle, 9), 16);
        }
        throw new IllegalStateException(hr1.f("invalid route ", c34));
    }
}
