package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: bxf  reason: default package */
public final class bxf extends Handler {
    public final xwb a;
    public final String b;
    public final h87 c;
    public double d;
    public double e;
    public double f;
    public long g;
    public long h;
    public double i;

    public bxf(Looper looper, xwb xwb, String str, h87 h87) {
        super(looper);
        this.a = xwb;
        this.b = str;
        this.c = h87;
    }

    public final void a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        double d2 = this.e + 1.0d;
        this.e = d2;
        double d3 = this.d + ((double) (elapsedRealtime - j));
        this.d = d3;
        double d4 = d3 / d2;
        double d5 = this.i;
        int valueOf = d5 > 0.0d ? Double.valueOf(this.f / d5) : 0;
        if (elapsedRealtime - this.g > 10000) {
            double d6 = this.d;
            this.a.log(this.b, "Total calls: " + d6 + ", average call time: " + d4 + ", average idle time " + valueOf);
            this.g = elapsedRealtime;
            this.e = 0.0d;
            this.d = 0.0d;
            this.i = 0.0d;
            this.f = 0.0d;
            this.h = 0;
        }
    }

    public final void dispatchMessage(Message message) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            long j = this.h;
            if (j > 0) {
                this.f = (double) (elapsedRealtime - j);
                this.i += 1.0d;
            }
            super.dispatchMessage(message);
            this.h = SystemClock.elapsedRealtime();
            message.getCallback();
            a(elapsedRealtime);
        } catch (Throwable th) {
            message.getCallback();
            a(elapsedRealtime);
            this.c.invoke(th);
        }
    }
}
