package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: y17  reason: default package */
public final class y17 extends t37 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(y17.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final u16 b;

    public y17(u16 u16) {
        this.b = u16;
    }

    public final boolean c() {
        return true;
    }

    public final void d(Throwable th) {
        if (c.compareAndSet(this, 0, 1)) {
            this.b.invoke(th);
        }
    }
}
