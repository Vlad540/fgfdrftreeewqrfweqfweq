package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hp5  reason: default package */
public final class hp5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ip5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp5(ip5 ip5, Continuation continuation) {
        super(2, continuation);
        this.Y = ip5;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ep5) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hp5 hp5 = new hp5(this.Y, continuation);
        hp5.X = obj;
        return hp5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ep5 ep5 = (ep5) this.X;
        ip5 ip5 = this.Y;
        ep5 ep52 = ip5.d;
        if (ep52 == null) {
            ip5.d = ep5;
        } else {
            ip5.getClass();
            if (ep52 != null && !ep52.equals(ep5)) {
                if (!hhd.f(ep52.Y, ep5.Y) || !hhd.f(ep52.z0, ep5.z0) || !hhd.f(ep52.B0, ep5.B0) || !hhd.f(ep52.A0, ep5.A0)) {
                    ip5.a(cq2.a);
                }
                ip5.d = ep5;
            }
        }
        return jue.a;
    }
}
