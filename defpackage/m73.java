package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: m73  reason: default package */
public final class m73 extends v63 {
    public final v63 X;
    public final v63 a;
    public final long b = 3;
    public final TimeUnit c;
    public final qmc o;

    public m73(y63 y63, TimeUnit timeUnit, qmc qmc) {
        this.a = y63;
        this.c = timeUnit;
        this.o = qmc;
        this.X = null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [xi4, n83, java.lang.Object] */
    public final void j(g73 g73) {
        ? obj = new Object();
        g73.d(obj);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        obj.a(this.o.c(new kuf(this, atomicBoolean, obj, g73, 2), this.b, this.c));
        this.a.i(new ul7(obj, atomicBoolean, g73));
    }
}
