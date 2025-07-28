package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: sc9  reason: default package */
public final class sc9 implements yv1, fef {
    public final zv1 a;
    public final Object b = null;
    public final /* synthetic */ tc9 c;

    public sc9(tc9 tc9, zv1 zv1) {
        this.c = tc9;
        this.a = zv1;
    }

    public final void a(Segment segment, int i) {
        this.a.a(segment, i);
    }

    public final void c(ju3 ju3) {
        this.a.c(ju3);
    }

    public final boolean cancel(Throwable th) {
        return this.a.cancel(th);
    }

    public final void d(u16 u16) {
        this.a.d(u16);
    }

    public final void e(Object obj, k26 k26) {
        jue jue = jue.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tc9.h;
        Object obj2 = this.b;
        tc9 tc9 = this.c;
        atomicReferenceFieldUpdater.set(tc9, obj2);
        ka kaVar = new ka(tc9, 22, this);
        zv1 zv1 = this.a;
        zv1.v(jue, zv1.resumeMode, new rp0(2, kaVar));
    }

    public final hu3 getContext() {
        return this.a.b;
    }

    public final boolean isActive() {
        return this.a.isActive();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final Symbol j(Throwable th) {
        return this.a.j(th);
    }

    public final Symbol l(Object obj, k26 k26) {
        tc9 tc9 = this.c;
        ms0 ms0 = new ms0(tc9, 1, this);
        Symbol x = this.a.x((jue) obj, ms0);
        if (x != null) {
            tc9.h.set(tc9, this.b);
        }
        return x;
    }

    public final void q(Object obj) {
        this.a.q(obj);
    }

    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
