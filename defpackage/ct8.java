package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ct8  reason: default package */
public final class ct8 implements Callable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public ct8(et8 et8, long j, long j2, String str) {
        this.X = et8;
        this.c = j;
        this.o = j2;
        this.b = str;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                et8 et8 = (et8) this.X;
                th thVar = et8.c;
                aec aec = et8.a;
                yz5 f = thVar.f();
                f.j(1, this.c);
                f.j(2, this.o);
                String str = this.b;
                if (str == null) {
                    f.W(3);
                } else {
                    f.f(3, str);
                }
                try {
                    aec.c();
                    f.n();
                    aec.r();
                    aec.l();
                    thVar.u(f);
                    return null;
                } catch (Throwable th) {
                    thVar.u(f);
                    throw th;
                }
            default:
                xff xff = (xff) this.X;
                tdc tdc = xff.d;
                aec aec2 = xff.a;
                yz5 f2 = tdc.f();
                String str2 = this.b;
                if (str2 == null) {
                    f2.W(1);
                } else {
                    f2.f(1, str2);
                }
                f2.j(2, this.c);
                f2.j(3, this.o);
                try {
                    aec2.c();
                    Integer valueOf = Integer.valueOf(f2.n());
                    aec2.r();
                    aec2.l();
                    tdc.u(f2);
                    return valueOf;
                } catch (Throwable th2) {
                    tdc.u(f2);
                    throw th2;
                }
        }
    }

    public ct8(xff xff, String str, long j, long j2) {
        this.X = xff;
        this.b = str;
        this.c = j;
        this.o = j2;
    }
}
