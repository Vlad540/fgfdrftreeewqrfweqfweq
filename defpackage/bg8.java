package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: bg8  reason: default package */
public final class bg8 implements Runnable {
    public final u16 X;
    public final String Y = bg8.class.getName();
    public long Z = Long.MIN_VALUE;
    public final Handler a;
    public final kqe b;
    public final long c;
    public final long o;
    public int w0 = Integer.MIN_VALUE;
    public final ii5 x0 = new ii5(false);

    public bg8(Handler handler, kqe kqe, long j, long j2, e98 e98) {
        this.a = handler;
        this.b = kqe;
        this.c = j;
        this.o = j2;
        this.X = e98;
    }

    public final void a() {
        String str = this.Y;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "cancel", (Throwable) null);
        }
        this.a.removeCallbacks(this);
        this.Z = Long.MIN_VALUE;
        this.w0 = Integer.MIN_VALUE;
    }

    public final void b() {
        String str = this.Y;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, "start", (Throwable) null);
        }
        this.a.postDelayed(this, this.c);
    }

    public final void run() {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        kqe kqe = this.b;
        ii5 ii5 = this.x0;
        int d = kqe.d(ii5);
        long j = this.Z;
        if (j == Long.MIN_VALUE) {
            this.Z = elapsedRealtime;
            if (d == 2) {
                this.w0 = ii5.b;
            }
        } else {
            String str = this.Y;
            if (d != 2 || (i = ii5.b) <= this.w0) {
                long j2 = elapsedRealtime - j;
                if (j2 >= this.o) {
                    udd.U(str, "it seems media transform is stuck, ~ " + (((float) j2) / 1000.0f) + " s");
                }
            } else {
                this.Z = elapsedRealtime;
                this.w0 = i;
                udd.q(str, "media transform progress=" + i + "%");
                u16 u16 = this.X;
                if (u16 != null) {
                    u16.invoke(Float.valueOf(((float) this.w0) / 100.0f));
                }
            }
        }
        this.a.postDelayed(this, this.c);
    }
}
