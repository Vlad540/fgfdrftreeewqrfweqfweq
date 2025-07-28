package defpackage;

/* renamed from: hf2  reason: default package */
public final class hf2 extends u2 {
    public static final hf2 c = new u2(8);

    public static a34 Z1(long j, Long l) {
        if (l == null) {
            return new a34(us8.i(j, ":chats/forward?messages_ids="));
        }
        return new a34(":chats/forward?messages_ids=" + j + "&attach_id=" + l + "&is_forward_attach=true");
    }
}
