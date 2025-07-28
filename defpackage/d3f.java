package defpackage;

import java.util.concurrent.Callable;

/* renamed from: d3f  reason: default package */
public final class d3f implements Callable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ e3f Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ qjb b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;

    public d3f(e3f e3f, String str, qjb qjb, float f, float f2, boolean z) {
        this.Y = e3f;
        this.a = str;
        this.b = qjb;
        this.c = f;
        this.o = f2;
        this.X = z;
    }

    public final Object call() {
        e3f e3f = this.Y;
        tdc tdc = e3f.c;
        aec aec = e3f.a;
        yz5 f = tdc.f();
        String str = this.a;
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        f.j(2, (long) this.b.b);
        f.h(3, (double) this.c);
        f.h(4, (double) this.o);
        f.j(5, this.X ? 1 : 0);
        try {
            aec.c();
            f.n();
            aec.r();
            aec.l();
            tdc.u(f);
            return null;
        } catch (Throwable th) {
            tdc.u(f);
            throw th;
        }
    }
}
