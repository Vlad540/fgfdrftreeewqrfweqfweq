package defpackage;

import android.os.Bundle;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: jpd  reason: default package */
public final class jpd implements z24 {
    public static final jpd a = new Object();
    public static final lpd b = lpd.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        g8d g8d;
        g8d q63;
        if (!b.a.contains(c34)) {
            return null;
        }
        lpd.b.getClass();
        if (c34.equals(lpd.c)) {
            q63 = new g8d(1);
        } else if (c34.equals(lpd.d)) {
            q63 = new g8d(2);
        } else if (c34.equals(lpd.e)) {
            q63 = new g8d(3);
        } else if (c34.equals(lpd.f)) {
            g8d = new eo3(1, x87.u0("ids", bundle));
            return new j34(str, c34, bundle, 1, (h34) null, g8d, 16);
        } else if (c34.equals(lpd.g)) {
            q63 = new q63(x87.E0(ApiProtocol.KEY_ID, bundle), 9);
        } else {
            udd.s(jpd.class.getName(), "invalid route " + c34, new IllegalArgumentException("invalid route " + c34));
            return null;
        }
        g8d = q63;
        return new j34(str, c34, bundle, 1, (h34) null, g8d, 16);
    }
}
