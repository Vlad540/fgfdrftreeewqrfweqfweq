package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: v15  reason: default package */
public final class v15 extends AtomicInteger implements Runnable, xi4 {
    public final Runnable a;
    public final yi4 b;
    public volatile Thread c;

    public v15(Runnable runnable, yi4 yi4) {
        this.a = runnable;
        this.b = yi4;
    }

    public final void f() {
        while (true) {
            int i = get();
            if (i < 2) {
                if (i == 0) {
                    if (compareAndSet(0, 4)) {
                        yi4 yi4 = this.b;
                        if (yi4 != null) {
                            yi4.c(this);
                            return;
                        }
                        return;
                    }
                } else if (compareAndSet(1, 3)) {
                    Thread thread = this.c;
                    if (thread != null) {
                        thread.interrupt();
                        this.c = null;
                    }
                    set(4);
                    yi4 yi42 = this.b;
                    if (yi42 != null) {
                        yi42.c(this);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        return get() >= 2;
    }

    public final void run() {
        if (get() == 0) {
            this.c = Thread.currentThread();
            if (compareAndSet(0, 1)) {
                try {
                    this.a.run();
                    this.c = null;
                    if (compareAndSet(1, 2)) {
                        yi4 yi4 = this.b;
                        if (yi4 != null) {
                            yi4.c(this);
                            return;
                        }
                        return;
                    }
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } catch (Throwable th) {
                    this.c = null;
                    if (!compareAndSet(1, 2)) {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } else {
                        yi4 yi42 = this.b;
                        if (yi42 != null) {
                            yi42.c(this);
                        }
                    }
                    throw th;
                }
            } else {
                this.c = null;
            }
        }
    }
}
