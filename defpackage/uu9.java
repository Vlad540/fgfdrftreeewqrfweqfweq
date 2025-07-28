package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: uu9  reason: default package */
public final class uu9 extends ms9 {
    public final tc3 a;
    public final int b = 1;
    public su9 c;

    public uu9(tc3 tc3) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = tc3;
    }

    public final void q(bw9 bw9) {
        su9 su9;
        boolean z;
        synchronized (this) {
            try {
                su9 = this.c;
                if (su9 == null) {
                    su9 = new su9(this);
                    this.c = su9;
                }
                long j = su9.b + 1;
                su9.b = j;
                if (su9.c || j != ((long) this.b)) {
                    z = false;
                } else {
                    z = true;
                    su9.c = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.a.a(new tu9(bw9, this, su9));
        if (z) {
            this.a.x(su9);
        }
    }

    public final void x(su9 su9) {
        synchronized (this) {
            try {
                if (this.c == su9) {
                    su9.getClass();
                    long j = su9.b - 1;
                    su9.b = j;
                    if (j == 0) {
                        this.c = null;
                        this.a.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(su9 su9) {
        synchronized (this) {
            try {
                if (su9.b == 0 && su9 == this.c) {
                    this.c = null;
                    xi4 xi4 = (xi4) su9.get();
                    bj4.a(su9);
                    if (xi4 == null) {
                        su9.o = true;
                    } else {
                        this.a.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
