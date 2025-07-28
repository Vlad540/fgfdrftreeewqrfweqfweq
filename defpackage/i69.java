package defpackage;

/* renamed from: i69  reason: default package */
public final class i69 extends e1 implements Runnable {
    public final Runnable w0;

    public i69(Runnable runnable) {
        runnable.getClass();
        this.w0 = runnable;
    }

    public final String j() {
        return "task=[" + this.w0 + "]";
    }

    public final void run() {
        try {
            this.w0.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
