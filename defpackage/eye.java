package defpackage;

import android.os.SystemClock;

/* renamed from: eye  reason: default package */
public final class eye {
    public final /* synthetic */ int a;

    public /* synthetic */ eye(int i) {
        this.a = i;
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }
}
