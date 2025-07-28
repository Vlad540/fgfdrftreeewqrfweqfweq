package defpackage;

import java.util.concurrent.Executor;

/* renamed from: koe  reason: default package */
public abstract class koe {
    public static final r7e a = new r7e(l8.Z);
    public static final r7e b = new r7e(l8.Y);

    public static void a(Runnable runnable) {
        ((Executor) b.getValue()).execute(runnable);
    }

    public static void b(Runnable runnable) {
        ((Executor) a.getValue()).execute(runnable);
    }
}
