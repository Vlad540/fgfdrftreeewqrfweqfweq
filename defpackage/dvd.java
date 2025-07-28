package defpackage;

import android.os.Bundle;

/* renamed from: dvd  reason: default package */
public final class dvd implements z24 {
    public static final dvd a = new Object();
    public static final evd b = evd.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        evd.b.getClass();
        if (c34.equals(evd.c)) {
            return new j34(str, c34, bundle, 1, new h34(new opd(3), new opd(4)), new o6b(x87.E0("sticker_id", bundle), bundle, 2));
        }
        throw new IllegalStateException(hr1.f("invalid route ", c34));
    }
}
