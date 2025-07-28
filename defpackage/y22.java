package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: y22  reason: default package */
public final class y22 extends taf {
    public final l05 A0 = new l05(0);
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final long b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final stf x0 = new stf(5);
    public qod y0;
    public final ArrayList z0 = new ArrayList();

    public y22(long j) {
        i6b i6b = i6b.a;
        t97 c2 = i6b.c();
        t97 e = i6b.e();
        t97 f = i6b.f();
        t97 O = ez3.O(3, new p22(3));
        t97 g = i6b.g();
        t97 d = i6b.d();
        this.b = j;
        this.c = c2;
        this.o = e;
        this.X = f;
        this.Y = O;
        this.Z = g;
        this.w0 = d;
    }

    public final i22 q() {
        return (i22) ((aw2) ((bv2) this.c.getValue())).m(this.b).a.getValue();
    }

    public final void r() {
        ArrayList arrayList = this.z0;
        List s0 = o23.s0(arrayList);
        arrayList.clear();
        qod qod = this.y0;
        if ((qod == null || !qod.isActive()) && !s0.isEmpty()) {
            this.y0 = taf.n(this, ((pae) this.X.getValue()).b().plus(sk9.a), (ru3) null, new x22(this, s0, (Continuation) null), 2);
        }
    }
}
