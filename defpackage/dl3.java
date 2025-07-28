package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: dl3  reason: default package */
public final class dl3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kl3 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl3(kl3 kl3, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = kl3;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dl3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dl3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pq3 pq3;
        Object a;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wf3 wf3 = (wf3) this.Y.o.getValue();
            this.X = 1;
            long j = this.Z;
            tf3 i2 = ((di3) wf3.a.getValue()).i(j, false);
            if (i2 == null) {
                a = hw4.a;
            } else {
                i22 q = ((bv2) wf3.b.getValue()).q(j);
                lg7 c = hwf.c();
                boolean v = i2.v();
                boolean t = i2.t();
                if (!v && !t) {
                    c.add(uf3.Z);
                    c.add(uf3.w0);
                }
                c.add(uf3.a);
                if (v) {
                    c.add(uf3.b);
                } else {
                    c.add(uf3.c);
                }
                c.add(uf3.o);
                if (!t || q == null || q.d0()) {
                    c.add(uf3.X);
                } else {
                    c.add(uf3.x0);
                }
                if (t) {
                    c.add(uf3.Y);
                }
                a = hwf.a(c);
            }
            obj = a;
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sg5 M = myc.M(myc.M(new es(2, (Iterable) obj), new t13(6)), new t13(7));
        d15 d15 = kl3.H0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        myc.T(M, arrayList2);
        t23.J(arrayList2, d15);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            switch (((uf3) it.next()).ordinal()) {
                case 0:
                    pq3 = new pq3(p2a.d, new hge(rhc.U), Integer.valueOf(phc.F1), Integer.valueOf(j9a.G), 4);
                    break;
                case 1:
                    pq3 = new pq3(p2a.f, new hge(rhc.W), Integer.valueOf(phc.X1), Integer.valueOf(j9a.G), 4);
                    break;
                case 2:
                    pq3 = new pq3(p2a.i, new hge(rhc.Z), Integer.valueOf(phc.m1), Integer.valueOf(j9a.G), 4);
                    break;
                case 3:
                    pq3 = new pq3(p2a.e, new hge(rhc.V), Integer.valueOf(phc.c), Integer.valueOf(j9a.G), 4);
                    break;
                case 4:
                    pq3 = new pq3(p2a.b, new hge(rhc.S), Integer.valueOf(j9a.J), Integer.valueOf(phc.T), Integer.valueOf(j9a.F));
                    break;
                case 5:
                    pq3 = new pq3(p2a.c, new hge(rhc.T), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F));
                    break;
                case 6:
                    pq3 = new pq3(p2a.a, new hge(rhc.R), Integer.valueOf(phc.A1), Integer.valueOf(j9a.G), 4);
                    break;
                case 7:
                    pq3 = new pq3(p2a.h, new hge(rhc.Y), Integer.valueOf(phc.m2), Integer.valueOf(j9a.G), 4);
                    break;
                case 8:
                    pq3 = new pq3(p2a.g, new hge(rhc.X), Integer.valueOf(j9a.J), Integer.valueOf(phc.o1), Integer.valueOf(j9a.F));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(pq3);
        }
        return arrayList;
    }
}
