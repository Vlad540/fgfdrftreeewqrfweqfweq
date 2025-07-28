package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: qs0  reason: default package */
public final /* synthetic */ class qs0 extends x26 implements k26 {
    public static final qs0 a = new x26(3, us0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        us0 us0 = (us0) obj;
        zvc zvc = (zvc) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = us0.o;
        us0.getClass();
        n12 n12 = (n12) us0.x0.get(us0);
        while (true) {
            if (us0.x()) {
                ((yvc) zvc).X = ws0.l;
                break;
            }
            long andIncrement = us0.X.getAndIncrement(us0);
            long j = (long) ws0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (n12.id != j2) {
                n12 r = us0.r(j2, n12);
                if (r == null) {
                    continue;
                } else {
                    n12 = r;
                }
            }
            Object H = us0.H(n12, i, andIncrement, zvc);
            if (H == ws0.m) {
                fef fef = zvc instanceof fef ? (fef) zvc : null;
                if (fef != null) {
                    fef.a(n12, i);
                }
            } else if (H == ws0.o) {
                if (andIncrement < us0.u()) {
                    n12.cleanPrev();
                }
            } else if (H != ws0.n) {
                n12.cleanPrev();
                ((yvc) zvc).X = H;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return jue.a;
    }
}
