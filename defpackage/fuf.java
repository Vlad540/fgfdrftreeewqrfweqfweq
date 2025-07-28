package defpackage;

/* renamed from: fuf  reason: default package */
public final class fuf implements Runnable {
    public final guf a;
    public final btf b;

    public fuf(guf guf, btf btf) {
        this.a = guf;
        this.b = btf;
    }

    public final void run() {
        synchronized (this.a.d) {
            try {
                if (((fuf) this.a.b.remove(this.b)) != null) {
                    euf euf = (euf) this.a.c.remove(this.b);
                    if (euf != null) {
                        btf btf = this.b;
                        kd4 kd4 = (kd4) euf;
                        a24 B = a24.B();
                        B.t(kd4.B0, "Exceeded time limits on execution for " + btf);
                        kd4.w0.execute(new jd4(kd4, 0));
                    }
                } else {
                    a24 B2 = a24.B();
                    btf btf2 = this.b;
                    B2.t("WrkTimerRunnable", "Timer with " + btf2 + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
