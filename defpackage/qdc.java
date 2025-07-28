package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qdc  reason: default package */
public final class qdc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ udc c;

    public /* synthetic */ qdc(udc udc, String str, int i) {
        this.a = i;
        this.c = udc;
        this.b = str;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                udc udc = this.c;
                tdc tdc = udc.e;
                aec aec = udc.a;
                yz5 f = tdc.f();
                String str = this.b;
                if (str == null) {
                    f.W(1);
                } else {
                    f.f(1, str);
                }
                try {
                    aec.c();
                    f.n();
                    aec.r();
                    aec.l();
                    tdc.u(f);
                    return jue.a;
                } catch (Throwable th) {
                    tdc.u(f);
                    throw th;
                }
            default:
                udc udc2 = this.c;
                tdc tdc2 = udc2.g;
                aec aec2 = udc2.a;
                yz5 f2 = tdc2.f();
                String str2 = this.b;
                if (str2 == null) {
                    f2.W(1);
                } else {
                    f2.f(1, str2);
                }
                try {
                    aec2.c();
                    f2.n();
                    aec2.r();
                    aec2.l();
                    tdc2.u(f2);
                    return jue.a;
                } catch (Throwable th2) {
                    tdc2.u(f2);
                    throw th2;
                }
        }
    }
}
