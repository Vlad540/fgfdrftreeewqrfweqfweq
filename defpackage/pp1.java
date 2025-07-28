package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: pp1  reason: default package */
public final /* synthetic */ class pp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp1 b;

    public /* synthetic */ pp1(rp1 rp1, int i) {
        this.a = i;
        this.b = rp1;
    }

    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                rp1 rp1 = this.b;
                rp1.getClass();
                rp1.c = new qp1();
                new File(((mg5) rp1.E0).b(), "call_history_state").delete();
                return;
            case 1:
                rp1 rp12 = this.b;
                rp12.e();
                if (rp12.Z == 0) {
                    if (rp12.c.b == 0) {
                        z = false;
                    }
                    boolean z2 = z;
                    udd.q("rp1", "sync: from: " + rp12.c.b + " forward: " + z2);
                    pk pkVar = rp12.A0;
                    gy9 gy9 = (gy9) pkVar;
                    rp12.Z = gy9.v(gy9, new j2f(((j2b) gy9.z()).a.n(), rp12.c.b, z2));
                    return;
                }
                return;
            case 2:
                Iterator it = this.b.Y.iterator();
                while (it.hasNext()) {
                    w61 w61 = (w61) it.next();
                    udd.q("CallHistoryPageViewModel", "loaded history for type=" + w61.b);
                    w61.t();
                }
                return;
            case 3:
                rp1 rp13 = this.b;
                rp13.F0.d(rp13);
                return;
            case 4:
                rp1 rp14 = this.b;
                rp14.F0.f(rp14);
                return;
            default:
                rp1 rp15 = this.b;
                if (!rp15.a) {
                    rp15.e();
                    if (rp15.c.a.a == 0 && rp15.c.a.b == 0 && rp15.c.X) {
                        rp15.g(new pp1(rp15, 1));
                        return;
                    }
                    ArrayList m = rp15.B0.m(rp15.c.a.a, rp15.c.a.b);
                    udd.q("rp1", "loadInitial: loaded from db: " + m.size() + " messages");
                    rp15.b(rp15.o.size(), m);
                    rp15.a = true;
                    rp15.b = m.isEmpty();
                    rp15.f();
                    if (rp15.c.o) {
                        rp15.g(new t50(rp15, true, 5));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
