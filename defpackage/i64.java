package defpackage;

import android.content.Context;

/* renamed from: i64  reason: default package */
public final class i64 implements mz3 {
    public final Context a;
    public final bqe b;
    public final mz3 c;

    public i64(Context context, String str, f54 f54) {
        g84 g84 = new g84();
        g84.b = str;
        this.a = context.getApplicationContext();
        this.b = f54;
        this.c = g84;
    }

    public final oz3 a() {
        g64 g64 = new g64(this.a, this.c.a());
        bqe bqe = this.b;
        if (bqe != null) {
            g64.O(bqe);
        }
        return g64;
    }
}
