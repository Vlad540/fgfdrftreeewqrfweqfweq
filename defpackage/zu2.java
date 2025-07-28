package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zu2  reason: default package */
public final class zu2 extends u2 {
    public static final zu2 c = new u2(8);

    public static Uri Z1(zu2 zu2, long j, String str, Long l, Long l2, List list, String str2, Boolean bool, boolean z, int i) {
        int i2 = i;
        Boolean bool2 = null;
        Long l3 = (i2 & 4) != 0 ? null : l;
        Long l4 = (i2 & 8) != 0 ? null : l2;
        List list2 = (i2 & 16) != 0 ? null : list;
        String str3 = (i2 & 32) != 0 ? null : str2;
        if ((i2 & 128) == 0) {
            bool2 = bool;
        }
        boolean z2 = (i2 & 256) != 0 ? false : z;
        zu2.getClass();
        mn mnVar = new mn(12);
        mnVar.b = ":chats";
        mnVar.T(Long.valueOf(j), HasExtraData.KEY_ID);
        String str4 = str;
        mnVar.T(str, "type");
        if (z2) {
            mnVar.T(Boolean.TRUE, "no_anim");
        }
        if (l3 != null) {
            mnVar.T(Long.valueOf(l3.longValue()), "message_id");
        }
        if (l4 != null) {
            mnVar.T(Long.valueOf(l4.longValue()), "load_mark");
        }
        if (list2 != null) {
            ((ArrayList) mnVar.c).add("highlights=".concat(o23.c0(list2, ",", (String) null, (String) null, (u16) null, 62)));
        }
        if (str3 != null) {
            mnVar.T(str3, "payload");
        }
        if (bool2 != null) {
            mnVar.T(bool2, "open_search_field");
        }
        return mnVar.u();
    }

    public static void b2(zu2 zu2, long j, String str, Long l, Long l2, List list, String str2, int i) {
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str3 = (i & 32) != 0 ? null : str2;
        zu2.getClass();
        zu2.P1().c(Z1(zu2, j, str, l3, l4, list2, str3, (Boolean) null, false, 320), (Bundle) null);
    }

    public static a34 c2(zu2 zu2, long j, bff bff, String str, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        zu2.getClass();
        StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
        sb.append(j);
        sb.append("&entry_point=");
        sb.append(bff.a);
        if (i != 0) {
            sb.append("&request_code=");
            sb.append(i);
        }
        if (!(str == null || str.length() == 0)) {
            sb.append("&start_param=");
            sb.append(str);
        }
        return new a34(sb.toString());
    }

    public final a34 a2(long j) {
        return new a34(us8.j(j, ":chats?id=", "&type=local"));
    }
}
