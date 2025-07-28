package defpackage;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xc4  reason: default package */
public abstract class xc4 {
    public static final Size k = new Size(0, 0);
    public static final AtomicInteger l = new AtomicInteger(0);
    public static final AtomicInteger m = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public sn1 d;
    public final vn1 e;
    public sn1 f;
    public final vn1 g;
    public final Size h;
    public final int i;
    public Class j;

    public xc4(Size size, int i2) {
        this.h = size;
        this.i = i2;
        vn1 f2 = hwf.f(new vc4(this, 0));
        this.e = f2;
        this.g = hwf.f(new vc4(this, 1));
        if (hwf.l(3, "DeferrableSurface")) {
            m.incrementAndGet();
            l.get();
            toString();
            f2.b.c(new wc4(this, Log.getStackTraceString(new Exception())), pa2.j());
        }
    }

    public void a() {
        sn1 sn1;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f.b((Object) null);
                    if (this.b == 0) {
                        sn1 = this.d;
                        this.d = null;
                    } else {
                        sn1 = null;
                    }
                    if (hwf.l(3, "DeferrableSurface")) {
                        toString();
                    }
                } else {
                    sn1 = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (sn1 != null) {
            sn1.b((Object) null);
        }
    }

    public final void b() {
        sn1 sn1;
        synchronized (this.a) {
            try {
                int i2 = this.b;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    this.b = i3;
                    if (i3 != 0 || !this.c) {
                        sn1 = null;
                    } else {
                        sn1 = this.d;
                        this.d = null;
                    }
                    if (hwf.l(3, "DeferrableSurface")) {
                        toString();
                        if (this.b == 0) {
                            m.get();
                            l.decrementAndGet();
                            toString();
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sn1 != null) {
            sn1.b((Object) null);
        }
    }

    public final ch7 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    as6 as6 = new as6(1, new DeferrableSurface$SurfaceClosedException(this, "DeferrableSurface already closed."));
                    return as6;
                }
                ch7 e2 = e();
                return e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i2 = this.b;
                if (i2 == 0) {
                    if (this.c) {
                        throw new DeferrableSurface$SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                    }
                }
                this.b = i2 + 1;
                if (hwf.l(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        m.get();
                        l.incrementAndGet();
                        toString();
                    }
                    toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ch7 e();
}
