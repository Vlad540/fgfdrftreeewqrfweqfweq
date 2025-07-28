package defpackage;

import java.util.List;

/* renamed from: bx8  reason: default package */
public final class bx8 extends u2 {
    public static final bx8 c = new u2(8);

    public static a34 Z1(List list, boolean z) {
        String c0 = o23.c0(list, ",", (String) null, (String) null, (u16) null, 62);
        return new a34(":chats/forward?messages_ids=" + c0 + "&show_ext_sharing=" + z);
    }

    public static a34 b2(long j, long j2, String str, ak4 ak4) {
        int ordinal = ak4.ordinal();
        StringBuilder k = hr1.k(j, ":dialogs/share-media?msg_id=", "&attach_id=");
        k.append(j2);
        k.append("&local_attach_id=");
        k.append(str);
        k.append("&cause_ordinal=");
        k.append(ordinal);
        return new a34(k.toString());
    }

    public static a34 c2(long j, bff bff, Long l, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder k = hr1.k(j, ":webapp:root?bot_id=", "&entry_point=");
        k.append(bff.a);
        sb.append(k.toString());
        sb.append("&chat_id=" + l);
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new a34(sb.toString());
    }

    public final a34 a2(long j) {
        return new a34(us8.j(j, ":chats?id=", "&type=local"));
    }
}
