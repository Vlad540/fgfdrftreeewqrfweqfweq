package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: va7  reason: default package */
public final class va7 extends g34 {
    public static final va7 b;
    public static final c34 c;
    public static final c34 d;
    public static final c34 e;

    static {
        g34 g34 = new g34();
        b = g34;
        c = g34.a(g34, ":location/show", new String[]{"lat", "lon"}, (Set) null, 0, 14);
        d = g34.a(g34, ":location/pick", new String[]{"request_code"}, (Set) null, 0, 14);
        e = g34.a(g34, ":attach/fullscreen", new String[]{"attachment_id"}, Collections.singleton("message"), 0, 12);
    }
}
