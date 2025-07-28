package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wu9  reason: default package */
public final class wu9 extends AtomicInteger implements xi4 {
    public final zu9 a;
    public final bw9 b;
    public Serializable c;
    public volatile boolean o;

    public wu9(zu9 zu9, bw9 bw9) {
        this.a = zu9;
        this.b = bw9;
    }

    public final void f() {
        if (!this.o) {
            this.o = true;
            this.a.a(this);
            this.c = null;
        }
    }

    public final boolean h() {
        return this.o;
    }
}
