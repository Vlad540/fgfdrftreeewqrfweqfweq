package defpackage;

import android.os.SystemClock;
import java.util.List;

/* renamed from: rh6  reason: default package */
public final class rh6 extends aj0 {
    public int g;

    public final int b() {
        return this.g;
    }

    public final int k() {
        return 0;
    }

    public final Object m() {
        return null;
    }

    public final void r(long j, long j2, long j3, List list, a28[] a28Arr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (q(this.g, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!q(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
