package defpackage;

import android.os.SystemClock;

/* renamed from: ir1  reason: default package */
public final class ir1 {
    public long a;
    public long b;
    public Object c;

    public int a() {
        if (!((kr1) this.c).c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.b == -1) {
            this.b = uptimeMillis;
        }
        long j = uptimeMillis - this.b;
        if (j <= 120000) {
            return 1000;
        }
        return j <= 300000 ? 2000 : 4000;
    }

    public int b() {
        boolean c2 = ((kr1) this.c).c();
        long j = this.a;
        if (!c2) {
            if (j > 0) {
                return Math.min((int) j, 10000);
            }
            return 10000;
        } else if (j > 0) {
            return Math.min((int) j, 1800000);
        } else {
            return 1800000;
        }
    }
}
