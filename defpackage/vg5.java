package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: vg5  reason: default package */
public final class vg5 extends ThreadPoolExecutor {
    public final void finalize() {
        shutdown();
    }
}
