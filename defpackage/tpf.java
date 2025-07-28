package defpackage;

import android.os.Bundle;

/* renamed from: tpf  reason: default package */
public final class tpf implements z24 {
    public static final tpf a = new Object();
    public static final upf b = upf.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        if (!b.a.contains(c34)) {
            return null;
        }
        upf.b.getClass();
        if (c34.equals(upf.c)) {
            return new j34(str, c34, bundle, 1, (h34) null, new g8d(8), 16);
        }
        udd.s(tpf.class.getName(), "invalid route " + c34, new IllegalArgumentException("invalid route " + c34));
        return null;
    }
}
