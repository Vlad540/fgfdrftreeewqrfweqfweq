package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vee  reason: default package */
public final class vee extends zr7 implements hd4 {
    public final uee a;

    public vee(zr7 zr7) {
        this.a = new uee(zr7);
    }

    public final Object delay(long j, Continuation continuation) {
        return iu7.q(this, j, continuation);
    }

    public final void dispatch(hu3 hu3, Runnable runnable) {
        ((ju3) this.a.a()).dispatch(hu3, runnable);
    }

    public final void dispatchYield(hu3 hu3, Runnable runnable) {
        ((ju3) this.a.a()).dispatchYield(hu3, runnable);
    }

    public final zr7 getImmediate() {
        zr7 immediate;
        Object a2 = this.a.a();
        zr7 zr7 = a2 instanceof zr7 ? (zr7) a2 : null;
        return (zr7 == null || (immediate = zr7.getImmediate()) == null) ? this : immediate;
    }

    public final aj4 invokeOnTimeout(long j, Runnable runnable, hu3 hu3) {
        Object a2 = this.a.a();
        hd4 hd4 = a2 instanceof hd4 ? (hd4) a2 : null;
        if (hd4 == null) {
            hd4 = p74.a;
        }
        return hd4.invokeOnTimeout(j, runnable, hu3);
    }

    public final boolean isDispatchNeeded(hu3 hu3) {
        return ((ju3) this.a.a()).isDispatchNeeded(hu3);
    }

    public final void scheduleResumeAfterDelay(long j, yv1 yv1) {
        Object a2 = this.a.a();
        hd4 hd4 = a2 instanceof hd4 ? (hd4) a2 : null;
        if (hd4 == null) {
            hd4 = p74.a;
        }
        hd4.scheduleResumeAfterDelay(j, yv1);
    }
}
