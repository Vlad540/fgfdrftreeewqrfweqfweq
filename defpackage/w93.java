package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: w93  reason: default package */
public abstract class w93 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
