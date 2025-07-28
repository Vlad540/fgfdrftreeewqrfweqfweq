package defpackage;

import android.os.Bundle;

/* renamed from: j29  reason: default package */
public final class j29 implements z24 {
    public static final j29 a = new Object();
    public static final k29 b = k29.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        k29.b.getClass();
        if (c34.equals(k29.c)) {
            return new j34(str, c34, bundle, 0, (h34) null, new i(24), 24);
        }
        udd.s(j29.class.getName(), "invalid route " + c34, new IllegalArgumentException("invalid route " + c34));
        return null;
    }
}
