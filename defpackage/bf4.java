package defpackage;

import android.os.Looper;

/* renamed from: bf4  reason: default package */
public final class bf4 {
    public static final r7e c = new r7e(new xd3(13));
    public final ThreadLocal a;
    public final Looper b = Looper.myLooper();

    public bf4(ThreadLocal threadLocal) {
        this.a = threadLocal;
        Looper.prepare();
    }
}
