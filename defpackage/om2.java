package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: om2  reason: default package */
public final class om2 extends l5e implements i26 {
    public final /* synthetic */ nn2 X;
    public final /* synthetic */ View Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public om2(nn2 nn2, View view, Continuation continuation) {
        super(2, continuation);
        this.X = nn2;
        this.Y = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((om2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new om2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        nn2 nn2 = this.X;
        i22 i22 = (i22) nn2.Z0.a.getValue();
        jue jue = jue.a;
        if (i22 == null) {
            return jue;
        }
        boolean z = !i22.S((f03) nn2.z0.getValue());
        lg7 c = hwf.c();
        if (nn2.w() && !i22.F()) {
            c.add(new pq3(qhc.H0, new hge(rhc.M), new Integer(phc.m2), (Integer) null, 20));
        }
        boolean J = i22.J();
        o62 o62 = i22.b;
        if ((J || o62.c != m62.c) && !i22.Q() && !i22.I()) {
            c.add(new pq3(qhc.G0, new hge(rhc.L), new Integer(phc.O0), (Integer) null, 20));
        }
        if (!i22.P()) {
            c.add(new pq3(z ? qhc.F0 : qhc.E0, new hge(rhc.K), new Integer(z ? phc.v1 : phc.u1), (Integer) null, 20));
            c.add(new pq3(qhc.D0, new hge(rhc.j), new Integer(phc.c), (Integer) null, 20));
        }
        lg7 a = hwf.a(c);
        wia wia = new wia("chat_server_id", new Long(o62.a));
        tf3 k = i22.k();
        taf.o(nn2.c1, new cm2(a, jjd.j(wia, new wia("contact_id", k != null ? new Long(k.n()) : null)), this.Y));
        return jue;
    }
}
