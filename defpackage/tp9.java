package defpackage;

import android.content.Context;

/* renamed from: tp9  reason: default package */
public final class tp9 {
    public final Context a;
    public final qp9 b;

    public tp9(Context context, qp9 qp9) {
        this.a = context;
        this.b = qp9;
    }

    public final String a(String str, String str2, String str3, boolean z) {
        if (z) {
            return me4.i(str2, ": ", str3);
        }
        if (str == null || str.length() == 0) {
            String string = this.a.getString(avb.tt_in_chat);
            return str2 + " " + string + ": " + str3;
        }
        return str2 + " | " + str + ": " + str3;
    }
}
