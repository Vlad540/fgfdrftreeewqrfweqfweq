package defpackage;

/* renamed from: mmc  reason: default package */
public final class mmc implements xi4, Runnable {
    public final Runnable a;
    public final omc b;
    public Thread c;

    public mmc(Runnable runnable, omc omc) {
        this.a = runnable;
        this.b = omc;
    }

    public final void f() {
        if (this.c == Thread.currentThread()) {
            omc omc = this.b;
            if (omc instanceof uj9) {
                uj9 uj9 = (uj9) omc;
                if (!uj9.b) {
                    uj9.b = true;
                    uj9.a.shutdown();
                    return;
                }
                return;
            }
        }
        this.b.f();
    }

    public final boolean h() {
        return this.b.h();
    }

    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            f();
            this.c = null;
        } catch (Throwable th) {
            f();
            this.c = null;
            throw th;
        }
    }
}
