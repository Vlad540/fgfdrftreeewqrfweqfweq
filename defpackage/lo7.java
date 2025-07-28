package defpackage;

import android.os.Bundle;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: lo7  reason: default package */
public final class lo7 implements z24 {
    public static final lo7 a = new Object();
    public static final mo7 b = mo7.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        i q63;
        if (!b.a.contains(c34)) {
            return null;
        }
        if (c34.equals(mo7.c)) {
            q63 = new i(21);
        } else if (c34.equals(mo7.d)) {
            q63 = new q63(x87.E0(ApiProtocol.KEY_ID, bundle), 3);
        } else {
            throw new IllegalStateException(hr1.f("invalid route ", c34));
        }
        return new j34(str, c34, bundle, 0, (h34) null, q63, 24);
    }
}
