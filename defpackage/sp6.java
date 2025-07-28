package defpackage;

import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: sp6  reason: default package */
public final class sp6 implements at {
    public final boolean a;
    public final gs4 b;
    public final wm0 c;
    public final zs d;
    public final ScheduledExecutorService e;
    public ojc f;
    public int g;
    public volatile int h;

    public sp6(gs4 gs4, zs zsVar, sz3 sz3, boolean z) {
        this.a = z;
        boolean z2 = true;
        oyb.k(gs4.e != -9223372036854775807L);
        oyb.k(gs4.f == -2147483647 ? false : z2);
        this.b = gs4;
        this.d = zsVar;
        this.c = sz3;
        this.e = Executors.newSingleThreadScheduledExecutor();
        this.g = 0;
    }

    public final int a(ii5 ii5) {
        if (this.g == 2) {
            ii5.b = this.h;
        }
        return this.g;
    }

    public final void b(Bitmap bitmap, xu5 xu5) {
        try {
            ojc ojc = this.f;
            if (ojc == null) {
                this.f = this.d.c(xu5);
                this.e.schedule(new rp6(this, bitmap, xu5, 0), 10, TimeUnit.MILLISECONDS);
                return;
            }
            gs4 gs4 = this.b;
            int g2 = ojc.g(bitmap, new je3((float) gs4.f, 0, gs4.e));
            if (g2 == 1) {
                this.h = 100;
                this.f.e();
            } else if (g2 == 2) {
                this.e.schedule(new rp6(this, bitmap, xu5, 1), 10, TimeUnit.MILLISECONDS);
            } else if (g2 == 3) {
                this.h = 100;
            } else {
                throw new IllegalStateException();
            }
        } catch (ExportException e2) {
            this.d.d(e2);
        } catch (RuntimeException e3) {
            this.d.d(ExportException.a(e3, 1000));
        }
    }

    public final zs6 e() {
        return j8c.w0;
    }

    public final void release() {
        this.g = 0;
        this.e.shutdownNow();
    }

    public final void start() {
        this.g = 2;
        gs4 gs4 = this.b;
        long j = gs4.e;
        zs zsVar = this.d;
        zsVar.f(j);
        zsVar.b(1);
        a68 a68 = gs4.a.b;
        a68.getClass();
        swb.a(this.c.c(a68.a), new mod(18, this), this.e);
    }
}
