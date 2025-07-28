package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* renamed from: fh0  reason: default package */
public abstract class fh0 implements qz3 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public yz3 o;

    public fh0(boolean z) {
        this.a = z;
    }

    public final void H(cqe cqe) {
        cqe.getClass();
        ArrayList arrayList = this.b;
        if (!arrayList.contains(cqe)) {
            arrayList.add(cqe);
            this.c++;
        }
    }

    public final void b(int i) {
        yz3 yz3 = this.o;
        int i2 = oze.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            boolean z = this.a;
            g54 g54 = (g54) ((cqe) this.b.get(i3));
            synchronized (g54) {
                e8c e8c = g54.n;
                if (z && (yz3.i & 8) != 8) {
                    g54.h += (long) i;
                }
            }
        }
    }

    public final void c() {
        yz3 yz3 = this.o;
        int i = oze.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            boolean z = this.a;
            g54 g54 = (g54) ((cqe) this.b.get(i2));
            synchronized (g54) {
                try {
                    e8c e8c = g54.n;
                    if (z && (yz3.i & 8) != 8) {
                        oyb.k(g54.f > 0);
                        g54.c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (elapsedRealtime - g54.g);
                        g54.i += (long) i3;
                        long j = g54.j;
                        long j2 = g54.h;
                        g54.j = j + j2;
                        if (i3 > 0) {
                            g54.e.a((int) Math.sqrt((double) j2), (((float) j2) * 8000.0f) / ((float) i3));
                            if (g54.i < 2000) {
                                if (g54.j >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                }
                                g54.c(i3, g54.h, g54.k);
                                g54.g = elapsedRealtime;
                                g54.h = 0;
                            }
                            g54.k = (long) g54.e.b();
                            g54.c(i3, g54.h, g54.k);
                            g54.g = elapsedRealtime;
                            g54.h = 0;
                        }
                        g54.f--;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        this.o = null;
    }

    public final void d() {
        for (int i = 0; i < this.c; i++) {
            ((cqe) this.b.get(i)).getClass();
        }
    }

    public final void e(yz3 yz3) {
        this.o = yz3;
        for (int i = 0; i < this.c; i++) {
            boolean z = this.a;
            g54 g54 = (g54) ((cqe) this.b.get(i));
            synchronized (g54) {
                try {
                    e8c e8c = g54.n;
                    if (z && (yz3.i & 8) != 8) {
                        if (g54.f == 0) {
                            g54.c.getClass();
                            g54.g = SystemClock.elapsedRealtime();
                        }
                        g54.f++;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }
}
