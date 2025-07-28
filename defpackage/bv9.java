package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bv9  reason: default package */
public final class bv9 extends AtomicReference implements yu9 {
    public xu9 a;
    public int b;
    public final boolean c = false;
    public final int o;

    public bv9() {
        xu9 xu9 = new xu9((Object) null);
        this.a = xu9;
        set(xu9);
        this.o = 1;
    }

    public final void a() {
        xu9 xu9 = new xu9(ap9.a);
        this.a.set(xu9);
        this.a = xu9;
        this.b++;
        xu9 xu92 = (xu9) get();
        if (xu92.a != null) {
            xu9 xu93 = new xu9((Object) null);
            xu93.lazySet(xu92.get());
            set(xu93);
        }
    }

    public final void b(Object obj) {
        xu9 xu9 = new xu9(obj);
        this.a.set(xu9);
        this.a = xu9;
        int i = this.b + 1;
        this.b = i;
        if (i > this.o) {
            xu9 xu92 = (xu9) ((xu9) get()).get();
            this.b--;
            if (this.c) {
                xu9 xu93 = new xu9((Object) null);
                xu93.lazySet(xu92.get());
                xu92 = xu93;
            }
            set(xu92);
        }
    }

    public final void c(wu9 wu9) {
        if (wu9.getAndIncrement() == 0) {
            int i = 1;
            do {
                xu9 xu9 = (xu9) wu9.c;
                if (xu9 == null) {
                    xu9 = (xu9) get();
                    wu9.c = xu9;
                }
                while (!wu9.o) {
                    xu9 xu92 = (xu9) xu9.get();
                    if (xu92 != null) {
                        if (ap9.a(wu9.b, xu92.a)) {
                            wu9.c = null;
                            return;
                        }
                        xu9 = xu92;
                    } else {
                        wu9.c = xu9;
                        i = wu9.addAndGet(-i);
                    }
                }
                wu9.c = null;
                return;
            } while (i != 0);
        }
    }

    public final void d(Throwable th) {
        xu9 xu9 = new xu9(new yo9(th));
        this.a.set(xu9);
        this.a = xu9;
        this.b++;
        xu9 xu92 = (xu9) get();
        if (xu92.a != null) {
            xu9 xu93 = new xu9((Object) null);
            xu93.lazySet(xu92.get());
            set(xu93);
        }
    }
}
