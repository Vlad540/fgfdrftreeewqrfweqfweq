package defpackage;

import android.os.SystemClock;

/* renamed from: u37  reason: default package */
public final class u37 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w37 b;

    public /* synthetic */ u37(w37 w37, int i) {
        this.a = i;
        this.b = w37;
    }

    public final void run() {
        ax4 ax4;
        int i;
        switch (this.a) {
            case 0:
                w37 w37 = this.b;
                w37.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (w37) {
                    ax4 = w37.e;
                    i = w37.f;
                    w37.e = null;
                    w37.f = 0;
                    w37.g = 3;
                    w37.i = uptimeMillis;
                }
                try {
                    if (w37.d(ax4, i)) {
                        w37.b.g(ax4, i);
                    }
                    return;
                } finally {
                    ax4.d(ax4);
                    w37.b();
                }
            default:
                w37 w372 = this.b;
                w372.a.execute(w372.c);
                return;
        }
    }
}
