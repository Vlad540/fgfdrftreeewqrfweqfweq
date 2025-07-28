package defpackage;

import android.os.Handler;

/* renamed from: xd6  reason: default package */
public final class xd6 implements Runnable, xi4 {
    public final /* synthetic */ int a = 0;
    public final Runnable b;
    public volatile boolean c;
    public final Object o;

    public xd6(Handler handler, Runnable runnable) {
        this.o = handler;
        this.b = runnable;
    }

    public final void f() {
        switch (this.a) {
            case 0:
                ((Handler) this.o).removeCallbacks(this);
                this.c = true;
                return;
            default:
                this.c = true;
                ((omc) this.o).f();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    xs7.F(th);
                    return;
                }
            default:
                if (!this.c) {
                    try {
                        this.b.run();
                        return;
                    } catch (Throwable th2) {
                        f();
                        xs7.F(th2);
                        throw th2;
                    }
                } else {
                    return;
                }
        }
    }

    public xd6(Runnable runnable, omc omc) {
        this.b = runnable;
        this.o = omc;
    }
}
