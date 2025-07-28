package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: hla  reason: default package */
public final class hla extends ju3 {
    public final hi4 a = new hi4();

    public final void dispatch(hu3 hu3, Runnable runnable) {
        hi4 hi4 = this.a;
        hi4.getClass();
        ha4 ha4 = oi4.a;
        zr7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
        if (!immediate.isDispatchNeeded(hu3)) {
            if (!(hi4.b || !hi4.a)) {
                if (hi4.d.offer(runnable)) {
                    hi4.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        immediate.dispatch(hu3, new dr1(hi4, 29, runnable));
    }

    public final boolean isDispatchNeeded(hu3 hu3) {
        ha4 ha4 = oi4.a;
        if (MainDispatcherLoader.dispatcher.getImmediate().isDispatchNeeded(hu3)) {
            return true;
        }
        hi4 hi4 = this.a;
        return !(hi4.b || !hi4.a);
    }
}
