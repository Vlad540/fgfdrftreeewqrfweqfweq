package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: su9  reason: default package */
public final class su9 extends AtomicReference implements Runnable, of3 {
    public final uu9 a;
    public long b;
    public boolean c;
    public boolean o;

    public su9(uu9 uu9) {
        this.a = uu9;
    }

    public final void accept(Object obj) {
        bj4.c(this, (xi4) obj);
        synchronized (this.a) {
            try {
                if (this.o) {
                    this.a.a.y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        this.a.y(this);
    }
}
