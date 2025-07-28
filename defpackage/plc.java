package defpackage;

/* renamed from: plc  reason: default package */
public final class plc extends h0 implements Runnable {
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            this.c = null;
        } catch (Throwable th) {
            f();
            this.c = null;
            xs7.F(th);
            throw th;
        }
    }
}
