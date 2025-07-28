package defpackage;

import android.os.SystemClock;
import java.util.List;

/* renamed from: qh6  reason: default package */
public final class qh6 extends zi0 {
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

    public final void t(long j, long j2, long j3, List list, z18[] z18Arr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (s(this.g, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!s(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
