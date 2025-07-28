package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ma5  reason: default package */
public final class ma5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ma5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                na5 na5 = (na5) this.c;
                th thVar = na5.X;
                aec aec = na5.a;
                yz5 f = thVar.f();
                f.j(1, this.b);
                try {
                    aec.c();
                    Integer valueOf = Integer.valueOf(f.n());
                    aec.r();
                    aec.l();
                    thVar.u(f);
                    return valueOf;
                } catch (Throwable th) {
                    thVar.u(f);
                    throw th;
                }
            case 1:
                xp9 xp9 = (xp9) this.c;
                yv8 yv8 = xp9.o;
                aec aec2 = xp9.a;
                yz5 f2 = yv8.f();
                f2.j(1, this.b);
                try {
                    aec2.c();
                    f2.n();
                    aec2.r();
                    aec2.l();
                    yv8.u(f2);
                    return jue.a;
                } catch (Throwable th2) {
                    yv8.u(f2);
                    throw th2;
                }
            case 2:
                ur9 ur9 = (ur9) this.c;
                yv8 yv82 = ur9.c;
                aec aec3 = ur9.a;
                yz5 f3 = yv82.f();
                f3.j(1, this.b);
                try {
                    aec3.c();
                    Integer valueOf2 = Integer.valueOf(f3.n());
                    aec3.r();
                    aec3.l();
                    yv82.u(f3);
                    return valueOf2;
                } catch (Throwable th3) {
                    yv82.u(f3);
                    throw th3;
                }
            case 3:
                udc udc = (udc) this.c;
                yv8 yv83 = udc.j;
                aec aec4 = udc.a;
                yz5 f4 = yv83.f();
                f4.j(1, this.b);
                try {
                    aec4.c();
                    f4.n();
                    aec4.r();
                    aec4.l();
                    yv83.u(f4);
                    return jue.a;
                } catch (Throwable th4) {
                    yv83.u(f4);
                    throw th4;
                }
            default:
                yxe yxe = (yxe) this.c;
                tdc tdc = yxe.d;
                aec aec5 = yxe.a;
                yz5 f5 = tdc.f();
                f5.j(1, this.b);
                try {
                    aec5.c();
                    f5.n();
                    aec5.r();
                    aec5.l();
                    tdc.u(f5);
                    return null;
                } catch (Throwable th5) {
                    tdc.u(f5);
                    throw th5;
                }
        }
    }
}
