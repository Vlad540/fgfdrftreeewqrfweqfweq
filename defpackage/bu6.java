package defpackage;

import android.os.SystemClock;

/* renamed from: bu6  reason: default package */
public final /* synthetic */ class bu6 implements u16 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;

    public /* synthetic */ bu6(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        String str = bv6.I0;
        int i = this.b;
        if (th == null) {
            udd.q(str, "prefetch " + i + " completed, all time = " + elapsedRealtime + "ms");
        } else {
            udd.s(str, "prefetch " + i + " completion error, all time = " + elapsedRealtime + "ms", th);
        }
        return jue.a;
    }
}
