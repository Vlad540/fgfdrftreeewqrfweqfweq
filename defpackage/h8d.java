package defpackage;

import android.os.Bundle;

/* renamed from: h8d  reason: default package */
public final class h8d implements z24 {
    public static final h8d a = new Object();
    public static final i8d b = i8d.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        i8d.b.getClass();
        if (c34.equals(i8d.c)) {
            return new j34(str, c34, bundle, 0, (h34) null, new g8d(0), 24);
        }
        udd.s(h8d.class.getName(), "invalid route " + c34, new IllegalArgumentException("invalid route " + c34));
        return null;
    }
}
