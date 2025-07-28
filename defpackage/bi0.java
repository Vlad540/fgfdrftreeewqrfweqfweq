package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bi0  reason: default package */
public final /* synthetic */ class bi0 implements rf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ av7 b;

    public /* synthetic */ bi0(av7 av7, int i) {
        this.a = i;
        this.b = av7;
    }

    public final void accept(Object obj) {
        av7 av7;
        switch (this.a) {
            case 0:
                be9 be9 = (be9) obj;
                be9.getClass();
                av7 av72 = this.b;
                long j = av72.c;
                long j2 = be9.G0.h;
                int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                ConcurrentHashMap concurrentHashMap = be9.c;
                ge9 ge9 = (ge9) be9.b;
                dm7 dm7 = av72.a;
                if (i == 0) {
                    be9.b2(new ai0(16));
                    av7 av73 = (av7) concurrentHashMap.get(Long.valueOf(be9.G0.h));
                    if (av73 != null) {
                        be9.L0.c(av73);
                    }
                    ((af9) ge9).B(dm7.a, dm7.b, false);
                } else {
                    if (!(j2 == -1 || (av7 = (av7) concurrentHashMap.get(Long.valueOf(j2))) == null)) {
                        zu7 a2 = av7.a();
                        a2.d = ev7.b;
                        concurrentHashMap.put(Long.valueOf(av7.c), new av7(a2));
                    }
                    long j3 = be9.G0.h;
                    long j4 = av72.c;
                    if (j4 != j3) {
                        be9.b2(new bi0(av72, 3));
                        av7 av74 = (av7) concurrentHashMap.get(Long.valueOf(be9.G0.h));
                        if (av74 != null) {
                            zu7 a3 = av74.a();
                            a3.d = ev7.c;
                            concurrentHashMap.put(Long.valueOf(av74.c), new av7(a3));
                            be9.L0.c(av74);
                        }
                        be9.g2(j4);
                        ((af9) ge9).B(dm7.a, dm7.b, false);
                    }
                }
                ((af9) ge9).A(-1, av72.k);
                be9.J0 = true;
                be9.h2((yd9) null);
                be9.e2();
                return;
            case 1:
                be9 be92 = (be9) obj;
                be92.getClass();
                av7 av75 = this.b;
                int i2 = (av75.j > be92.G0.o ? 1 : (av75.j == be92.G0.o ? 0 : -1));
                ge9 ge92 = (ge9) be92.b;
                dm7 dm72 = av75.a;
                if (i2 == 0) {
                    ((af9) ge92).B(dm72.a, dm72.b, false);
                    return;
                } else if (((List) be92.o.get(Long.valueOf(av75.c))) != null) {
                    be92.b2(new bi0(av75, 4));
                    be92.h2((yd9) null);
                    af9 af9 = (af9) ge92;
                    af9.A(av75.j, av75.k);
                    av7 av76 = (av7) be92.c.get(Long.valueOf(be92.G0.h));
                    if (av76 != null) {
                        be92.L0.c(av76);
                    }
                    af9.B(dm72.a, dm72.b, false);
                    return;
                } else {
                    return;
                }
            case 2:
                ((fm7) obj).h = this.b.c;
                return;
            case 3:
                fm7 fm7 = (fm7) obj;
                fm7.h = this.b.c;
                fm7.o = -1;
                return;
            default:
                ((fm7) obj).o = this.b.j;
                return;
        }
    }
}
