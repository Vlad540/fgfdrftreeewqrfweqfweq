package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: x91  reason: default package */
public final class x91 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ga1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x91(ga1 ga1, Continuation continuation) {
        super(2, continuation);
        this.Y = ga1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((x91) n((d41) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x91 x91 = new x91(this.Y, continuation);
        x91.X = obj;
        return x91;
    }

    public final Object o(Object obj) {
        Object value;
        y91 y91;
        String str;
        wx3.H(obj);
        d41 d41 = (d41) this.X;
        if (d41 instanceof v31) {
            long j = ((v31) d41).a;
            Long l = this.Y.D0;
            if (l != null && j == l.longValue()) {
                this.Y.D0 = null;
            }
        } else if (d41 instanceof w31) {
            w31 w31 = (w31) d41;
            long j2 = w31.a.a;
            Long l2 = this.Y.D0;
            if (l2 != null && j2 == l2.longValue()) {
                this.Y.D0 = null;
                ga1 ga1 = this.Y;
                grd grd = ga1.A0;
                do {
                    value = grd.getValue();
                    y91 = (y91) value;
                    qd7 qd7 = w31.a;
                    zc6 zc6 = qd7.X;
                    if (zc6 == null || (str = zc6.X) == null) {
                        s2f s2f = qd7.Y;
                        str = s2f != null ? s2f.o : null;
                    }
                    s2f s2f2 = qd7.Y;
                    ga1.C0.o1(ga1, ga1.F0[0], xs7.D(ga1.a, ((pae) ga1.y0.getValue()).b(), ru3.b, new ea1(s2f2.Z, s2f2.X, ga1, (Continuation) null)));
                } while (!grd.b(value, y91.a(y91, (mc0) null, (hy7) null, (hy7) null, false, str != null ? new lge(str) : new hge(r1a.c0), (ArrayList) null, (mge) null, 111)));
            }
        }
        return jue.a;
    }
}
