package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* renamed from: td6  reason: default package */
public abstract class td6 {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new sd6(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        if (obj instanceof kcc) {
            obj = null;
        }
        sd6 sd6 = (sd6) obj;
    }

    public static final Handler a(Looper looper) {
        return (Handler) Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
    }
}
