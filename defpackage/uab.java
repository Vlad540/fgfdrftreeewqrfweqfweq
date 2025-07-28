package defpackage;

import android.view.Choreographer;

/* renamed from: uab  reason: default package */
public abstract class uab {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new eg(1, runnable));
    }
}
