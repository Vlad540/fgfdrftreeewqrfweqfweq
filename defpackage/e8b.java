package defpackage;

import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: e8b  reason: default package */
public final class e8b extends g34 {
    public static final e8b b;
    public static final c34 c;
    public static final c34 d;
    public static final c34 e;
    public static final c34 f;

    static {
        g34 g34 = new g34();
        b = g34;
        c = g34.a(g34, ":profile/edit", new String[]{ApiProtocol.KEY_ID, "type"}, (Set) null, 0, 14);
        d = g34.a(g34, ":profile/member_permissions", new String[]{ApiProtocol.KEY_ID}, (Set) null, 0, 14);
        e = g34.a(g34, ":profile/edit/link", new String[]{ApiProtocol.KEY_ID, "type", "flow"}, (Set) null, 0, 14);
        f = g34.a(g34, ":profile/edit/admin_permission", new String[]{"chat_id", "contact_id", "permissions_type"}, (Set) null, 0, 14);
    }
}
