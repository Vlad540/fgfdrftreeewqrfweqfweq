package defpackage;

import android.content.Context;

/* renamed from: suf  reason: default package */
public final class suf {
    public static final suf b;
    public u5g a;

    /* JADX WARNING: type inference failed for: r0v0, types: [suf, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static u5g a(Context context) {
        u5g u5g;
        suf suf = b;
        synchronized (suf) {
            try {
                if (suf.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    suf.a = new u5g(21, (Object) context);
                }
                u5g = suf.a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return u5g;
    }
}
