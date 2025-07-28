package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: o93  reason: default package */
public final class o93 extends omc {
    public volatile boolean X;
    public final ng7 a;
    public final n83 b;
    public final ng7 c;
    public final q93 o;

    /* JADX WARNING: type inference failed for: r3v1, types: [xi4, java.lang.Object, ng7] */
    /* JADX WARNING: type inference failed for: r0v0, types: [xi4, n83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, ng7] */
    public o93(q93 q93) {
        this.o = q93;
        ? obj = new Object();
        this.a = obj;
        ? obj2 = new Object();
        this.b = obj2;
        ? obj3 = new Object();
        this.c = obj3;
        obj3.a(obj);
        obj3.a(obj2);
    }

    public final xi4 b(Runnable runnable) {
        if (this.X) {
            return cw4.a;
        }
        return this.o.e(runnable, 0, TimeUnit.MILLISECONDS, this.a);
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.X) {
            return cw4.a;
        }
        return this.o.e(runnable, j, timeUnit, this.b);
    }

    public final void f() {
        if (!this.X) {
            this.X = true;
            this.c.f();
        }
    }

    public final boolean h() {
        return this.X;
    }
}
