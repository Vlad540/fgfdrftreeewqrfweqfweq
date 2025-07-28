package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ce  reason: default package */
public abstract class ce {
    public static final yd6 a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        qmc qmc = de.a;
        a = new yd6(new Handler(mainLooper));
    }
}
