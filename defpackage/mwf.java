package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* renamed from: mwf  reason: default package */
public final class mwf {
    public final u39 a;
    public final long b;
    public long c = SystemClock.elapsedRealtime();

    public mwf(long j, u39 u39) {
        this.a = u39;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mwf.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((mwf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
