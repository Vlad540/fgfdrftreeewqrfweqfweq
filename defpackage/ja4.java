package defpackage;

import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: ja4  reason: default package */
public final class ja4 implements Provider {
    public final Provider X;
    public final Provider Y;
    public final /* synthetic */ int a = 1;
    public final Provider b;
    public final Provider c;
    public final Provider o;

    public ja4(ja4 ja4, km4 km4, nxc nxc) {
        gf6 gf6 = a06.g;
        ns7 ns7 = n06.d;
        this.b = gf6;
        this.c = ns7;
        this.o = ja4;
        this.X = km4;
        this.Y = nxc;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new ia4((Executor) this.b.get(), (b39) this.c.get(), (i37) this.o.get(), (a15) this.X.get(), (m7e) this.Y.get());
            default:
                return new tre((eye) this.b.get(), (eye) this.c.get(), (pmc) this.o.get(), (vxe) this.X.get(), (etf) this.Y.get());
        }
    }

    public ja4(Provider provider, Provider provider2, j8e j8e, Provider provider3, Provider provider4) {
        this.b = provider;
        this.c = provider2;
        this.o = j8e;
        this.X = provider3;
        this.Y = provider4;
    }
}
