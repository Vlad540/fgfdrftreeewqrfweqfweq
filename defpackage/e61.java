package defpackage;

import android.os.Bundle;

/* renamed from: e61  reason: default package */
public final class e61 implements z24 {
    public static final e61 a = new Object();
    public static final f61 b = f61.b;

    public final g34 a() {
        return b;
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        i iVar;
        if (!b.a.contains(c34)) {
            return null;
        }
        f61.b.getClass();
        if (c34.equals(f61.c)) {
            iVar = new i(7);
        } else if (c34.equals(f61.d)) {
            String string = bundle.getString("call_link");
            String string2 = bundle.getString("call_title");
            Long t0 = x87.t0("call_chat_id", bundle);
            Boolean s0 = x87.s0("is_link_call", bundle);
            iVar = new d61(t0, string, string2, s0 != null ? s0.booleanValue() : false);
        } else {
            throw new IllegalStateException(hr1.f("invalid route ", c34));
        }
        return new j34(str, c34, bundle, 0, (h34) null, iVar, 24);
    }
}
