package defpackage;

import android.content.Context;

/* renamed from: pvf  reason: default package */
public final class pvf extends kj0 {
    public static final p7c c = new p7c("\\p{Graph}+?");
    public final String a;
    public final ovf b;

    public pvf(Context context, String str) {
        this.a = str;
        this.b = new ovf(context);
    }

    public static final boolean b(String str) {
        return ovf.j.matcher(str).matches() || ovf.k.matcher(str).matches() || c.a(str);
    }

    public final dhd a() {
        return new mv9(1, new xle(21, (Object) this));
    }
}
