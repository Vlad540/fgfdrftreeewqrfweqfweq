package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: fp6  reason: default package */
public final /* synthetic */ class fp6 implements a2d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fp6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(c2d c2d) {
        switch (this.a) {
            case 0:
                kp6 kp6 = (kp6) this.b;
                if (kp6.c() != null) {
                    gt0.i();
                    z1d z1d = kp6.t;
                    if (z1d != null) {
                        z1d.b();
                        kp6.t = null;
                    }
                    cs6 cs6 = kp6.s;
                    if (cs6 != null) {
                        cs6.a();
                        kp6.s = null;
                    }
                    kp6.p.c();
                    kp6.e();
                    va0 va0 = kp6.g;
                    va0.getClass();
                    y1d F = kp6.F((np6) kp6.f, va0);
                    kp6.r = F;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = new Object[]{F.c()}[0];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    kp6.E(Collections.unmodifiableList(arrayList));
                    kp6.q();
                    return;
                }
                return;
            case 1:
                bq6 bq6 = (bq6) this.b;
                if (bq6.c() != null) {
                    z9e z9e = bq6.x;
                    z9e.getClass();
                    gt0.i();
                    z9e.Y = true;
                    xac xac = z9e.o;
                    if (xac != null) {
                        gt0.i();
                        if (!xac.d.b.isDone()) {
                            Exception exc = new Exception("The request is aborted silently and retried.", (Throwable) null);
                            gt0.i();
                            xac.g = true;
                            ch7 ch7 = xac.i;
                            Objects.requireNonNull(ch7);
                            ch7.cancel(true);
                            xac.e.d(exc);
                            xac.f.b((Object) null);
                            z9e z9e2 = xac.b;
                            z9e2.getClass();
                            gt0.i();
                            z9e2.a.addFirst(xac.a);
                            z9e2.c();
                        }
                    }
                    bq6.F(true);
                    va0 va02 = bq6.g;
                    va02.getClass();
                    y1d G = bq6.G(bq6.e(), (cq6) bq6.f, va02);
                    bq6.v = G;
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = new Object[]{G.c()}[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    bq6.E(Collections.unmodifiableList(arrayList2));
                    bq6.q();
                    z9e z9e3 = bq6.x;
                    z9e3.getClass();
                    gt0.i();
                    z9e3.Y = false;
                    z9e3.c();
                    return;
                }
                return;
            case 2:
                s39 s39 = (s39) this.b;
                s39.b = s39.c();
                ar1 ar1 = (ar1) s39.e;
                if (ar1 != null) {
                    lr1 lr1 = ar1.b;
                    lr1.getClass();
                    try {
                        if (((Boolean) hwf.f(new ar1(lr1, 0)).b.get()).booleanValue()) {
                            s39 s392 = lr1.L0;
                            lr1 lr12 = lr1;
                            lr1.c.execute(new cr1(lr12, lr1.w(s392), (c2d) s392.b, (r39) s392.c, (va0) null, Collections.singletonList(rye.Y), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                } else {
                    return;
                }
            case 3:
                b3b b3b = (b3b) this.b;
                if (b3b.c() != null) {
                    b3b.H((c3b) b3b.f, b3b.g);
                    b3b.q();
                    return;
                }
                return;
            case 4:
                Iterator it = ((b2d) this.b).m.iterator();
                while (it.hasNext()) {
                    ((a2d) it.next()).a(c2d);
                }
                return;
            default:
                ((h2f) this.b).N();
                return;
        }
    }
}
