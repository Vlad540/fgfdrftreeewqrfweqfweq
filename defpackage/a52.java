package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a52  reason: default package */
public final /* synthetic */ class a52 implements Runnable {
    public final /* synthetic */ t52 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ i22 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ a52(t52 t52, long j, i22 i22, boolean z) {
        this.a = t52;
        this.b = j;
        this.c = i22;
        this.o = z;
    }

    public final void run() {
        t52 t52 = this.a;
        ConcurrentHashMap concurrentHashMap = t52.f;
        long j = this.b;
        boolean containsKey = concurrentHashMap.containsKey(Long.valueOf(j));
        Long valueOf = Long.valueOf(j);
        i22 i22 = this.c;
        concurrentHashMap.put(valueOf, i22);
        t52.c.put(Long.valueOf(i22.b.l), i22);
        long J = t52.J();
        o62 o62 = i22.b;
        boolean f = o62.f(J);
        long j2 = o62.a;
        if (f || j2 != 0) {
            t52.g.put(Long.valueOf(j2), i22);
        }
        boolean p = r1g.p(o62.I);
        ConcurrentHashMap concurrentHashMap2 = t52.h;
        if (!p) {
            concurrentHashMap2.put(Long.valueOf(j), i22);
        } else {
            concurrentHashMap2.remove(Long.valueOf(j));
        }
        if (containsKey) {
            t97 t97 = t52.C;
            if (t97.getValue() != null) {
                ((b92) ((v72) t97.getValue())).k(j, i22);
            }
            if (this.o) {
                t52.m.c(new mw2(Collections.singletonList(Long.valueOf(j)), false, false, md4.REGULAR, (jh0) null, true, qw4.a));
                List singletonList = Collections.singletonList(i22);
                s52 s52 = t52.G;
                if (s52 != null) {
                    s52.c(singletonList);
                }
            }
        }
    }
}
