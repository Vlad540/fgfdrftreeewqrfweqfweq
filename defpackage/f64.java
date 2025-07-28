package defpackage;

import android.content.Context;

/* renamed from: f64  reason: default package */
public final class f64 implements nz3 {
    public final Context a;
    public final nz3 b;

    public f64(Context context) {
        this(context, new h84());
    }

    public final qz3 a() {
        return new h64(this.a, this.b.a());
    }

    public f64(Context context, nz3 nz3) {
        this.a = context.getApplicationContext();
        this.b = nz3;
    }
}
