package defpackage;

import java.util.concurrent.Callable;

/* renamed from: zv8  reason: default package */
public final class zv8 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ cw8 o;

    public /* synthetic */ zv8(cw8 cw8, long j, long j2, int i) {
        this.a = i;
        this.o = cw8;
        this.b = j;
        this.c = j2;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                cw8 cw8 = this.o;
                yv8 yv8 = cw8.q;
                aec aec = cw8.a;
                yz5 f = yv8.f();
                f.j(1, this.b);
                f.j(2, this.c);
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
                cw8 cw82 = this.o;
                yv8 yv82 = cw82.r;
                aec aec2 = cw82.a;
                yz5 f2 = yv82.f();
                f2.j(1, this.b);
                f2.j(2, this.c);
                try {
                    aec2.c();
                    f2.n();
                    aec2.r();
                    aec2.l();
                    yv82.u(f2);
                    return jue.a;
                } catch (Throwable th2) {
                    yv82.u(f2);
                    throw th2;
                }
        }
    }
}
