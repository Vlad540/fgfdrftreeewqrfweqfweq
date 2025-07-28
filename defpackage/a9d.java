package defpackage;

import android.os.Bundle;

/* renamed from: a9d  reason: default package */
public final class a9d implements z24 {
    public static final a9d a = new Object();
    public static final b9d b = b9d.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        z8d z8d;
        z8d z8d2;
        if (!b.a.contains(c34)) {
            return null;
        }
        b9d.b.getClass();
        if (c34.equals(b9d.c)) {
            z8d2 = z8d.b;
        } else if (c34.equals(b9d.d)) {
            z8d2 = z8d.c;
        } else if (c34.equals(b9d.e)) {
            z8d2 = z8d.o;
        } else if (c34.equals(b9d.f)) {
            String G0 = x87.G0("mode", bundle);
            if (G0.equals("setup")) {
                z8d2 = z8d.X;
            } else if (G0.equals("confirm")) {
                z8d = new v21(x87.G0("hash", bundle), 1);
                return new j34(str, c34, bundle, 0, (h34) null, z8d, 24);
            } else {
                throw new IllegalStateException("illegal mode".toString());
            }
        } else {
            udd.s(a9d.class.getName(), "invalid route " + c34, new IllegalArgumentException("invalid route " + c34));
            return null;
        }
        z8d = z8d2;
        return new j34(str, c34, bundle, 0, (h34) null, z8d, 24);
    }
}
