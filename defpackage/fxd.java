package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: fxd  reason: default package */
public final class fxd extends l5e implements i26 {
    public final /* synthetic */ gxd X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fxd(gxd gxd, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.X = gxd;
        this.Y = j;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fxd(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        p6d p6d;
        Object obj2;
        wx3.H(obj);
        gxd gxd = this.X;
        Iterator it = ((Iterable) gxd.X.getValue()).iterator();
        while (true) {
            p6d = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            dtc dtc = (dtc) obj2;
            if ((dtc instanceof btc) && ((btc) dtc).a == this.Y) {
                break;
            }
        }
        btc btc = obj2 instanceof btc ? (btc) obj2 : null;
        jue jue = jue.a;
        if (btc == null) {
            return jue;
        }
        int i = rca.k;
        l05 l05 = gxd.Z;
        String str = btc.X;
        int i2 = this.Z;
        if (i2 == i) {
            taf.o(l05, new l6d(str));
        } else if (i2 == rca.l) {
            taf.o(l05, new m6d(str));
        } else if (i2 == rca.i) {
            hhd.q(gxd.b, str);
            if (hhd.y()) {
                p6d = new p6d(phc.u, new hge(sca.g));
            }
            if (p6d != null) {
                taf.o(l05, p6d);
            }
        } else if (i2 == rca.j) {
            gxd.C0 = Long.valueOf(btc.a);
            taf.o(l05, new n6d(new hge(sca.k), new hge(sca.j), p23.B(new kc3[]{new kc3(rca.b, new hge(sca.h), 1, false), new kc3(rca.a, new hge(sca.i), 2, false)})));
        }
        return jue;
    }
}
