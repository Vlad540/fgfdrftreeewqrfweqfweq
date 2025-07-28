package defpackage;

import java.util.concurrent.Callable;

/* renamed from: pdc  reason: default package */
public final class pdc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ udc b;

    public /* synthetic */ pdc(udc udc, int i) {
        this.a = i;
        this.b = udc;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                udc udc = this.b;
                yv8 yv8 = udc.d;
                aec aec = udc.a;
                yz5 f = yv8.f();
                try {
                    aec.c();
                    f.n();
                    aec.r();
                    aec.l();
                    yv8.u(f);
                    return jue.a;
                } catch (Throwable th) {
                    yv8.u(f);
                    throw th;
                }
            default:
                udc udc2 = this.b;
                tdc tdc = udc2.h;
                aec aec2 = udc2.a;
                yz5 f2 = tdc.f();
                try {
                    aec2.c();
                    f2.n();
                    aec2.r();
                    aec2.l();
                    tdc.u(f2);
                    return jue.a;
                } catch (Throwable th2) {
                    tdc.u(f2);
                    throw th2;
                }
        }
    }
}
