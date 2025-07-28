package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mrd  reason: default package */
public abstract class mrd implements Runnable {
    public final String X;
    public final AtomicInteger a = new AtomicInteger(0);
    public final ah0 b;
    public final c5b c;
    public final z4b o;

    public mrd(ah0 ah0, c5b c5b, z4b z4b, String str) {
        this.b = ah0;
        this.c = c5b;
        this.o = z4b;
        this.X = str;
        c5b.j(z4b, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        c5b c5b = this.c;
        z4b z4b = this.o;
        String str = this.X;
        c5b.i(z4b, str);
        c5b.k(z4b, str);
        this.b.c();
    }

    public void f(Exception exc) {
        c5b c5b = this.c;
        z4b z4b = this.o;
        String str = this.X;
        c5b.i(z4b, str);
        c5b.d(z4b, str, exc, (Map) null);
        this.b.e(exc);
    }

    public void g(Object obj) {
        c5b c5b = this.c;
        z4b z4b = this.o;
        String str = this.X;
        c5b.a(z4b, str, c5b.i(z4b, str) ? c(obj) : null);
        this.b.g(1, obj);
    }

    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object d = d();
                atomicInteger.set(3);
                try {
                    g(d);
                } finally {
                    b(d);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
