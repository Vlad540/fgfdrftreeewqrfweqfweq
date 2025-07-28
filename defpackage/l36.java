package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* renamed from: l36  reason: default package */
public final /* synthetic */ class l36 implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ l36(sn1 sn1, ch7 ch7, long j) {
        this.c = sn1;
        this.o = ch7;
        this.b = j;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, p10] */
    public final Object call() {
        p10 p10;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((sn1) this.c).d(new TimeoutException("Future[" + ((ch7) this.o) + "] is not done within " + this.b + " ms.")));
            default:
                nec nec = (nec) this.c;
                cw8 d = nec.d();
                long j = this.b;
                jp8 c2 = d.c(j);
                int i = 0;
                if (c2 == null) {
                    return 0;
                }
                jj7 jj7 = c2.m;
                if (jj7 != null) {
                    p10 = jj7.I();
                } else {
                    ? obj = new Object();
                    obj.a = hw4.a;
                    p10 = obj;
                }
                int i2 = 1;
                int b2 = p10.b() + (p10.b != null ? 1 : 0);
                ((of3) this.o).accept(p10);
                if (p10.b == null) {
                    i2 = 0;
                }
                int b3 = p10.b() + i2;
                if (b2 > 0 || b3 > 0) {
                    jj7 c3 = p10.c();
                    i = nec.d().m(new eve(j, c3, fu7.c(c3)));
                }
                return Integer.valueOf(i);
        }
    }

    public /* synthetic */ l36(nec nec, long j, of3 of3) {
        this.c = nec;
        this.b = j;
        this.o = of3;
    }
}
