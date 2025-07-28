package defpackage;

import android.os.Bundle;

/* renamed from: c31  reason: default package */
public final class c31 implements z24 {
    public static final c31 a = new Object();
    public static final d31 b = d31.b;

    public final g34 a() {
        return b;
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [java.lang.Object, i34] */
    public final j34 b(String str, c34 c34, Bundle bundle) {
        int i;
        c34 c342 = c34;
        Bundle bundle2 = bundle;
        String str2 = null;
        if (!b.a.contains(c342)) {
            return null;
        }
        d31.b.getClass();
        boolean z = true;
        if (c342.equals(d31.d)) {
            String V = at7.V(x87.G0("link", bundle2));
            boolean x = am7.x(x87.s0("video_enabled", bundle2));
            boolean x2 = am7.x(x87.s0("microphone_enabled", bundle2));
            Boolean s0 = x87.s0("front_camera_enabled", bundle2);
            if (s0 != null) {
                z = s0.booleanValue();
            }
            return new j34(str, c34, bundle, 0, new h34(new b31(2, 0), new b31(2, 1)), new w21(V, x, x2, z, am7.x(x87.s0("is_new", bundle2))), 8);
        } else if (c342.equals(d31.c)) {
            long E0 = x87.E0("opponent_id", bundle2);
            boolean x3 = am7.x(x87.s0("video_enabled", bundle2));
            Boolean s02 = x87.s0("microphone_enabled", bundle2);
            if (s02 != null) {
                z = s02.booleanValue();
            }
            return new j34(str, c34, bundle, 0, new h34(new b31(2, 0), new b31(2, 1)), new x21(E0, x3, z, 0), 8);
        } else if (c342.equals(d31.e)) {
            return new j34(str, c34, bundle, 0, new h34(new b31(2, 0), new b31(2, 1)), new x21(x87.E0("chat_id", bundle2), am7.x(x87.s0("video_enabled", bundle2)), am7.x(x87.s0("microphone_enabled", bundle2)), 1), 8);
        } else if (c342.equals(d31.g)) {
            String string = bundle2.getString("place");
            if (true ^ (string == null || h0e.c0(string))) {
                str2 = string;
            }
            if (str2 == null) {
                str2 = "OTHER";
            }
            if (str2 != null) {
                if (str2.equals("PIP")) {
                    i = 1;
                } else if (str2.equals("FIRST")) {
                    i = 2;
                } else if (str2.equals("OTHER")) {
                    i = 3;
                } else {
                    throw new IllegalArgumentException("No enum constant one.me.calls.ui.deeplink.CallDeepLinkFactory.Place.".concat(str2));
                }
                return new j34(str, c34, bundle, 0, new h34(new b31(i, 0), new b31(i, 1)), new Object(), 8);
            }
            throw new NullPointerException("Name is null");
        } else if (c342.equals(d31.k)) {
            return new j34(str, c34, bundle, 0, new h34(new a01(5), new a01(6)), new i(3), 8);
        } else if (c342.equals(d31.f)) {
            String G0 = x87.G0("call_name", bundle2);
            String string2 = bundle2.getString("call_avatar");
            return new j34(str, c34, bundle, 0, new h34(new b31(3, 0), new b31(3, 1)), new z21(x87.E0("chat_id", bundle2), G0, string2, x87.B0("video_enabled", bundle2)), 8);
        } else if (c342.equals(d31.h)) {
            return new j34(str, c34, bundle, 0, (h34) null, new v21(at7.V(x87.G0("link", bundle2)), 0), 24);
        } else if (c342.equals(d31.i)) {
            return new j34(str, c34, bundle, 0, (h34) null, new i(4), 24);
        } else if (c342.equals(d31.j)) {
            return new j34(str, c34, bundle, 0, (h34) null, new i(5), 24);
        } else if (c342.equals(d31.m)) {
            return new j34(str, c34, bundle, 0, new h34(new b31(3, 0), new b31(3, 1)), new a31(bundle2), 8);
        } else if (c342.equals(d31.l)) {
            return new j34(str, c34, bundle, 0, (h34) null, new i(6), 24);
        } else {
            throw new IllegalStateException(hr1.f("invalid route ", c342));
        }
    }
}
