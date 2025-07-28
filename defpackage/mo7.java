package defpackage;

import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: mo7  reason: default package */
public final class mo7 extends g34 {
    public static final mo7 b;
    public static final c34 c;
    public static final c34 d;

    static {
        g34 g34 = new g34();
        b = g34;
        c = g34.a(g34, ":login", new String[0], (Set) null, 1, 10);
        d = g34.a(g34, ":neuro-avatars", new String[]{ApiProtocol.KEY_ID}, (Set) null, 0, 14);
    }
}
