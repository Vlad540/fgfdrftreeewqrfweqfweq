package defpackage;

import android.net.Uri;

/* renamed from: sr7  reason: default package */
public final class sr7 extends u2 {
    public static final sr7 c = new u2(8);

    public static a34 Z1(long j, Long l, Long l2) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chats?id=" + j + "&type=local");
        if (l2 != null) {
            sb.append("&message_id=" + l2);
        }
        sb.append("&load_mark=" + l);
        return new a34(sb.toString());
    }

    public static a34 a2(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chat-list?message_push=" + z);
        if (str != null) {
            sb.append("&folder_id=".concat(str));
        }
        return new a34(sb.toString());
    }

    public static Uri b2(long j, String str) {
        qr4 qr4 = bff.c;
        mn mnVar = new mn(12);
        mnVar.b = ":webapp:root";
        mnVar.T(Long.valueOf(j), "bot_id");
        mnVar.T("url", "entry_point");
        if (str != null) {
            mnVar.T(str, "start_param");
        }
        return mnVar.u();
    }

    public static a34 c2(long j, bff bff, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder k = hr1.k(j, ":webapp:root?bot_id=", "&entry_point=");
        k.append(bff.a);
        sb.append(k.toString());
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new a34(sb.toString());
    }
}
