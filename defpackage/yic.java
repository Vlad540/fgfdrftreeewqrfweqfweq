package defpackage;

import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: yic  reason: default package */
public final class yic implements nr6 {
    public final Surface X;
    public pw5 Y;
    public final op6 Z = new op6(1, this);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public final nr6 o;

    public yic(nr6 nr6) {
        this.o = nr6;
        this.X = nr6.getSurface();
    }

    public final void a() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.o.h();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final lr6 c() {
        pp6 pp6;
        synchronized (this.a) {
            lr6 c2 = this.o.c();
            if (c2 != null) {
                this.b++;
                pp6 = new pp6(c2);
                pp6.a(this.Z);
            } else {
                pp6 = null;
            }
        }
        return pp6;
    }

    public final void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.X;
                if (surface != null) {
                    surface.release();
                }
                this.o.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int f() {
        int f;
        synchronized (this.a) {
            f = this.o.f();
        }
        return f;
    }

    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.o.getHeight();
        }
        return height;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.o.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.o.getWidth();
        }
        return width;
    }

    public final void h() {
        synchronized (this.a) {
            this.o.h();
        }
    }

    public final void j(mr6 mr6, Executor executor) {
        synchronized (this.a) {
            this.o.j(new w48((Object) this, 29, (Object) mr6), executor);
        }
    }

    public final int l() {
        int l;
        synchronized (this.a) {
            l = this.o.l();
        }
        return l;
    }

    public final lr6 n() {
        pp6 pp6;
        synchronized (this.a) {
            lr6 n = this.o.n();
            if (n != null) {
                this.b++;
                pp6 = new pp6(n);
                pp6.a(this.Z);
            } else {
                pp6 = null;
            }
        }
        return pp6;
    }
}
