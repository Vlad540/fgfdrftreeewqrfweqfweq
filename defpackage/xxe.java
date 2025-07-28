package defpackage;

import java.util.concurrent.Callable;

/* renamed from: xxe  reason: default package */
public final class xxe implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ yxe o;

    public xxe(yxe yxe, String str, int i, long j) {
        this.o = yxe;
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final Object call() {
        yxe yxe = this.o;
        tdc tdc = yxe.c;
        aec aec = yxe.a;
        yz5 f = tdc.f();
        String str = this.a;
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        f.j(2, (long) hr1.t(this.b));
        f.j(3, this.c);
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
