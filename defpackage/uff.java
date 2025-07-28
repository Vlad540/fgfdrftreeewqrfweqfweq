package defpackage;

import java.util.concurrent.Callable;

/* renamed from: uff  reason: default package */
public final class uff implements Callable {
    public final /* synthetic */ xff X;
    public final /* synthetic */ boolean a = true;
    public final /* synthetic */ boolean b = true;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public uff(xff xff, long j, long j2) {
        this.X = xff;
        this.c = j;
        this.o = j2;
    }

    public final Object call() {
        xff xff = this.X;
        tdc tdc = xff.e;
        aec aec = xff.a;
        yz5 f = tdc.f();
        f.j(1, this.a ? 1 : 0);
        f.j(2, this.b ? 1 : 0);
        f.j(3, this.c);
        f.j(4, this.o);
        try {
            aec.c();
            Integer valueOf = Integer.valueOf(f.n());
            aec.r();
            aec.l();
            tdc.u(f);
            return valueOf;
        } catch (Throwable th) {
            tdc.u(f);
            throw th;
        }
    }
}
