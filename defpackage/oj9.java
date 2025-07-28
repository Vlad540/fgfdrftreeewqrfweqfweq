package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: oj9  reason: default package */
public final class oj9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rj9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oj9(rj9 rj9, Continuation continuation) {
        super(2, continuation);
        this.Y = rj9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((kwc) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oj9 oj9 = new oj9(this.Y, continuation);
        oj9.X = obj;
        return oj9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kwc kwc = (kwc) this.X;
        jwc jwc = kwc.a;
        hwc hwc = jwc instanceof hwc ? (hwc) jwc : null;
        Long l = hwc != null ? new Long(hwc.c) : null;
        fxa fxa = kwc.b;
        dxa dxa = fxa instanceof dxa ? (dxa) fxa : null;
        Long l2 = dxa != null ? new Long(dxa.b) : null;
        if (l == null) {
            l = l2;
        }
        grd grd = this.Y.X;
        Iterable<mi9> iterable = (Iterable) grd.getValue();
        ArrayList arrayList = new ArrayList(q23.H(iterable, 10));
        for (mi9 mi9 : iterable) {
            arrayList.add(mi9.y(mi9, l != null && mi9.a == l.longValue()));
        }
        grd.m((Object) null, arrayList);
        return jue.a;
    }
}
