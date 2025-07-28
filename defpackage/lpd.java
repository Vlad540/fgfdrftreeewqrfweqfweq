package defpackage;

import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: lpd  reason: default package */
public final class lpd extends g34 {
    public static final lpd b;
    public static final c34 c;
    public static final c34 d;
    public static final c34 e;
    public static final c34 f;
    public static final c34 g;

    static {
        g34 g34 = new g34();
        b = g34;
        c = g34.a(g34, ":start-conversation", new String[0], (Set) null, 0, 14);
        d = g34.a(g34, ":start-conversation/chat", new String[0], (Set) null, 0, 14);
        e = g34.a(g34, ":start-conversation/channel", new String[0], (Set) null, 0, 14);
        f = g34.a(g34, ":chat/add-icon", new String[0], (Set) null, 0, 14);
        g = g34.a(g34, ":start-conversation/add-subscribers", new String[]{ApiProtocol.KEY_ID}, (Set) null, 0, 14);
    }
}
