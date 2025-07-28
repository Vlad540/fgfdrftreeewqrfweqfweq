package defpackage;

import android.content.Context;

/* renamed from: t4g  reason: default package */
public final class t4g implements c1g {
    public final vbe a;

    public t4g(vbe vbe) {
        this.a = vbe;
    }

    public final Object n() {
        Context context = (Context) this.a.a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
