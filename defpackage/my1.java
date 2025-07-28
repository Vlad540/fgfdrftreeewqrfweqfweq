package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CountDownLatch;

/* renamed from: my1  reason: default package */
public final /* synthetic */ class my1 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ my1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                ((o96) ((w4g) this.b).b).b((p96) this.c);
                return;
            case 1:
                y65 y65 = (y65) this.b;
                y65.C0 = 0;
                y65.X = (u65) ((o96) this.c);
                return;
            case 2:
                tg5 tg5 = (tg5) this.b;
                p4e p4e = (p4e) this.c;
                synchronized (tg5) {
                    try {
                        if (tg5.p == null) {
                            if (!oze.a(tg5.D, p4e)) {
                                p4e p4e2 = tg5.D;
                                if (p4e2 != null) {
                                    if (p4e != null) {
                                        if (!p4e2.a.equals(p4e.a)) {
                                        }
                                    }
                                    tg5.i();
                                }
                                p4e p4e3 = tg5.D;
                                if (p4e3 != null && p4e != null && p4e3.b == p4e.b && p4e3.c == p4e.c) {
                                    if (p4e3.d == p4e.d) {
                                        z = false;
                                        tg5.C = z;
                                        tg5.D = p4e;
                                        return;
                                    }
                                }
                                z = true;
                                tg5.C = z;
                                tg5.D = p4e;
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
            case 3:
                ope ope = (ope) this.b;
                ope.getClass();
                Pair pair = (Pair) this.c;
                long longValue = ((Long) pair.second).longValue();
                ((o96) ope.X).a((h96) ope.o, (p96) pair.first, longValue);
                return;
            case 4:
                la9 la9 = ((xee) this.b).X;
                la9.getClass();
                int i = ((p96) this.c).a;
                gt0.n();
                pqe pqe = la9.a;
                SparseArray sparseArray = pqe.B0;
                oyb.k(oze.l(sparseArray, i));
                na9 na9 = (na9) sparseArray.get(i);
                na9.a.d(na9.b);
                sparseArray.remove(i);
                pqe.b();
                return;
            default:
                ew0 ew0 = (ew0) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (ew0.Z) {
                    ew0.Y = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
