package defpackage;

import android.os.Looper;
import java.util.Map;

/* renamed from: yh7  reason: default package */
public abstract class yh7 {
    public static final Object k = new Object();
    public final Object a;
    public final ijc b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final vp6 j;

    public yh7(Object obj) {
        this.a = new Object();
        this.b = new ijc();
        this.c = 0;
        this.f = k;
        this.j = new vp6(6, this);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        hr.U().j.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(wn6.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(xh7 xh7) {
        if (xh7.b) {
            if (!xh7.d()) {
                xh7.a(false);
                return;
            }
            int i2 = xh7.c;
            int i3 = this.g;
            if (i2 < i3) {
                xh7.c = i3;
                xh7.a.a(this.e);
            }
        }
    }

    public final void c(xh7 xh7) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (xh7 == null) {
                ijc ijc = this.b;
                ijc.getClass();
                gjc gjc = new gjc(ijc);
                ijc.c.put(gjc, Boolean.FALSE);
                while (gjc.hasNext()) {
                    b((xh7) ((Map.Entry) gjc.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(xh7);
                xh7 = null;
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(nc7 nc7, cw9 cw9) {
        a("observe");
        if (nc7.R().d != ob7.a) {
            wh7 wh7 = new wh7(this, nc7, cw9);
            xh7 xh7 = (xh7) this.b.b(cw9, wh7);
            if (xh7 != null && !xh7.c(nc7)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (xh7 == null) {
                nc7.R().a(wh7);
            }
        }
    }

    public final void f(cw9 cw9) {
        a("observeForever");
        xh7 xh7 = new xh7(this, cw9);
        xh7 xh72 = (xh7) this.b.b(cw9, xh7);
        if (xh72 instanceof wh7) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (xh72 == null) {
            xh7.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            hr.U().W(this.j);
        }
    }

    public void j(cw9 cw9) {
        a("removeObserver");
        xh7 xh7 = (xh7) this.b.c(cw9);
        if (xh7 != null) {
            xh7.b();
            xh7.a(false);
        }
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c((xh7) null);
    }

    public yh7() {
        this.a = new Object();
        this.b = new ijc();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new vp6(6, this);
        this.e = obj;
        this.g = -1;
    }
}
