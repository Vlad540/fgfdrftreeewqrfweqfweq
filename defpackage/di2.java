package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: di2  reason: default package */
public final class di2 extends taf {
    public final int A0;
    public final l05 B0;
    public final pj5 C0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final long b;
    public final boolean c;
    public final t97 o;
    public final stf w0;
    public qod x0;
    public final ArrayList y0;
    public final AtomicBoolean z0;

    public di2(int i, long j, boolean z) {
        int i2 = 2;
        z = (i & 2) != 0 ? false : z;
        i6b i6b = i6b.a;
        r7e c2 = i6b.c();
        t97 e = i6b.e();
        r7e f = i6b.f();
        t97 O = ez3.O(3, new p22(22));
        this.b = j;
        this.c = z;
        this.o = c2;
        this.X = e;
        this.Y = f;
        this.Z = O;
        this.w0 = new stf(5);
        this.y0 = new ArrayList();
        this.z0 = new AtomicBoolean(false);
        i22 q = q();
        if (q != null && q.G()) {
            i2 = 1;
        }
        this.A0 = i2;
        this.B0 = new l05(0);
        this.C0 = ez3.z(new yh2(ez3.J(new ik5(((aw2) ((bv2) c2.getValue())).m(j), 2), ((pae) f.getValue()).b()), this, 1));
    }

    public static boolean t(i22 i22) {
        boolean z = !r1g.p(i22.b.I);
        boolean z2 = i22.r() || i22.x();
        if (!i22.a0()) {
            return z && z2;
        }
        return true;
    }

    public final i22 q() {
        return (i22) ((aw2) ((bv2) this.o.getValue())).m(this.b).a.getValue();
    }

    public final lg7 r() {
        i22 q = q();
        stf stf = this.w0;
        stf.getClass();
        lg7 c2 = hwf.c();
        if (q != null && q.r()) {
            if (!this.c) {
                c2.add((pq3) ((t97) stf.a).getValue());
            }
            if (q.G()) {
                c2.add((pq3) ((t97) stf.c).getValue());
            } else {
                c2.add((pq3) ((t97) stf.b).getValue());
            }
        }
        return hwf.a(c2);
    }

    public final pj5 s() {
        return ez3.z(ez3.J(new yh2(new ik5(((aw2) ((bv2) this.o.getValue())).m(this.b), 2), this, 0), ((pae) this.Y.getValue()).b()));
    }

    public final void u(List list, boolean z) {
        dge dge;
        this.z0.set(z);
        ArrayList arrayList = this.y0;
        arrayList.clear();
        arrayList.addAll(list);
        int t = hr1.t(this.A0);
        if (t == 0) {
            dge = new dge(k8a.c, list.size());
        } else if (t == 1) {
            dge = new dge(k8a.d, list.size());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        taf.o(this.B0, new qcb(dge));
    }

    public final void v() {
        dge dge;
        this.z0.set(false);
        ArrayList arrayList = this.y0;
        arrayList.clear();
        int t = hr1.t(this.A0);
        if (t == 0) {
            dge = new dge(k8a.e, arrayList.size());
        } else if (t == 1) {
            dge = new dge(k8a.f, arrayList.size());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        taf.o(this.B0, new rcb(dge));
    }

    public final void w() {
        ArrayList arrayList = this.y0;
        List s0 = o23.s0(arrayList);
        arrayList.clear();
        qod qod = this.x0;
        if ((qod == null || !qod.isActive()) && !s0.isEmpty()) {
            this.x0 = taf.n(this, ((pae) this.Y.getValue()).b().plus(sk9.a), (ru3) null, new ci2(this, s0, (Continuation) null), 2);
        }
    }
}
