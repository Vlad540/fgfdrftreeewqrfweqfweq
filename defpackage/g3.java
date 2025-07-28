package defpackage;

import java.io.Closeable;

/* renamed from: g3  reason: default package */
public final class g3 extends ah0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g3(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void d() {
        switch (this.b) {
            case 0:
                c13 c13 = (c13) this.c;
                synchronized (c13) {
                    ez3.o(c13.g());
                }
                return;
            default:
                try {
                    n06.s();
                    oa9 oa9 = (oa9) this.c;
                    synchronized (oa9) {
                        if (oa9.g == this) {
                            oa9.g = null;
                            oa9.f = null;
                            oa9.b(oa9.c);
                            oa9.c = null;
                            oa9.i(3);
                        }
                    }
                    n06.s();
                    return;
                } catch (Throwable th) {
                    n06.s();
                    throw th;
                }
        }
    }

    public final void f(Throwable th) {
        switch (this.b) {
            case 0:
                c13 c13 = (c13) this.c;
                d4d d4d = c13.h;
                if (c13.j(th, d4d.Y)) {
                    c13.i.f(d4d, th);
                    return;
                }
                return;
            default:
                try {
                    if (n06.w()) {
                        n06.g("MultiplexProducer#onFailure");
                    }
                    ((oa9) this.c).f(this, th);
                    if (n06.w()) {
                        n06.m();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (n06.w()) {
                        n06.m();
                    }
                    throw th2;
                }
        }
    }

    public final void h(int i, Object obj) {
        switch (this.b) {
            case 0:
                c13 c13 = (c13) this.c;
                c13.o(obj, i, c13.h);
                return;
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    if (n06.w()) {
                        n06.g("MultiplexProducer#onNewResult");
                    }
                    ((oa9) this.c).g(this, closeable, i);
                    if (n06.w()) {
                        n06.m();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (n06.w()) {
                        n06.m();
                    }
                    throw th;
                }
        }
    }

    public final void j(float f) {
        switch (this.b) {
            case 0:
                ((c13) this.c).k(f);
                return;
            default:
                try {
                    if (n06.w()) {
                        n06.g("MultiplexProducer#onProgressUpdate");
                    }
                    ((oa9) this.c).h(this, f);
                    if (n06.w()) {
                        n06.m();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (n06.w()) {
                        n06.m();
                    }
                    throw th;
                }
        }
    }
}
