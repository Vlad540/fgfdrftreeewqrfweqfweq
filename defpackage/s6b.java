package defpackage;

import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: s6b  reason: default package */
public final class s6b extends g34 {
    public static final s6b b;
    public static final c34 c;
    public static final c34 d;
    public static final c34 e;
    public static final c34 f;
    public static final c34 g;
    public static final c34 h;
    public static final c34 i;
    public static final c34 j;

    static {
        g34 g34 = new g34();
        b = g34;
        c = g34.a(g34, ":profile/avatars", new String[]{ApiProtocol.KEY_ID, "type"}, (Set) null, 0, 14);
        d = g34.a(g34, ":profile", new String[]{ApiProtocol.KEY_ID, "type"}, (Set) null, 0, 14);
        e = g34.a(g34, ":profile/attaches", new String[]{ApiProtocol.KEY_ID}, (Set) null, 0, 14);
        f = g34.a(g34, ":profile/members", new String[]{ApiProtocol.KEY_ID, "type"}, (Set) null, 0, 14);
        g = g34.a(g34, ":profile/invite", new String[]{ApiProtocol.KEY_ID}, (Set) null, 0, 14);
        h = g34.a(g34, ":profile/add-admins", new String[]{"chat_id"}, (Set) null, 0, 14);
        i = g34.a(g34, ":profile/add-members", new String[]{"chat_id"}, (Set) null, 0, 14);
        j = g34.a(g34, ":profile/change-owner", new String[]{"chat_id"}, (Set) null, 0, 14);
    }
}
