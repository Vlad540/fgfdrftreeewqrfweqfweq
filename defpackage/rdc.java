package defpackage;

import java.util.concurrent.Callable;

/* renamed from: rdc  reason: default package */
public final class rdc implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ udc o;

    public rdc(udc udc, String str, String str2, String str3) {
        this.o = udc;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Object call() {
        udc udc = this.o;
        yv8 yv8 = udc.i;
        aec aec = udc.a;
        yz5 f = yv8.f();
        String str = this.a;
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        String str2 = this.b;
        if (str2 == null) {
            f.W(2);
        } else {
            f.f(2, str2);
        }
        String str3 = this.c;
        if (str3 == null) {
            f.W(3);
        } else {
            f.f(3, str3);
        }
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
    }
}
