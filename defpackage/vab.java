package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: vab  reason: default package */
public abstract class vab {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
