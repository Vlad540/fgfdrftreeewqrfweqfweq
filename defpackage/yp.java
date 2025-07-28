package defpackage;

import android.content.Context;

/* renamed from: yp  reason: default package */
public final class yp implements vp {
    public final y3g b;

    public yp(Context context) {
        fte fte;
        synchronized (n1g.class) {
            try {
                if (n1g.b == null) {
                    Context applicationContext = context.getApplicationContext();
                    n1g.b = new fte(new vbe(applicationContext != null ? applicationContext : context));
                }
                fte = n1g.b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.b = (y3g) ((c1g) fte.a).n();
    }
}
